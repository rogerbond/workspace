package ch.zh.rh;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.io.*;
import java.net.*;

public class MainActivity extends Activity {

  public TextView mRssFeed = null;

  /** Called when the activity is first created. */
  @Override
  public void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.main, container, false);
    mRssFeed = (TextView) rootView.findViewById(R.id.rss_feed);
    return rootView;
  }

	private class GetAndroidPitRssFeedTask extends AsyncTask<Void, Void, String> {

		@Override
		protected String doInBackground (Void... voids) {
			String result = "";
			try {
				result = getAndroidPitRssFeed();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return result;
		}

		@Override
		protected void onPostExecute (String rssFeed) {
			mRssFeed.setText(rssFeed);
		}

		public String getAndroidPitRssFeed () throws IOException {
			InputStream in = null;
			try {
				URL url = new URL("http://androitpit.com/feed/main.xml");
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				in = connection.getInputStream();
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				byte[] buffer = new byte[1024];
				for (int count; (count = in.read(buffer)) != -1;) {
					out.write(buffer, 0, count);
				}
				byte[] response = out.toByteArray();
				String rssFeed = new String(response, "UTF-8");
				mRssFeed.setText(rssFeed);
			} finally {
				if (in != null) {
					try {
						in.close();
					} finally {

					}
				}
			}
			return "Test";
		}
	}

}

	
