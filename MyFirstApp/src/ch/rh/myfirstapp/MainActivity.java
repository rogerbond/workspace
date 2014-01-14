package ch.rh.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	
	private TextView nachricht;
	private EditText eingabe;
	private Button weiter_fertig;
	private boolean erster_klick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        nachricht = (TextView) findViewById(R.id.nachricht);
        eingabe = (EditText) findViewById(R.id.eingabe);
        weiter_fertig = (Button) findViewById(R.id.weiter_fertig);
        
        eingabe.addTextChangedListener(new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable s) {
				weiter_fertig.setEnabled(s.length() > 0);
				
			}
		});
        
        weiter_fertig.setEnabled(false);
        
        erster_klick = true;
        
        nachricht.setText(R.string.willkommen);
        weiter_fertig.setText(R.string.weiter);
        
        weiter_fertig.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (erster_klick) {
					nachricht.setText(getString(R.string.hallo, eingabe.getText()));
					eingabe.setVisibility(View.INVISIBLE);
					weiter_fertig.setText(R.string.fertig);
					erster_klick = false;					
				} else {
					finish();
				}
			}
		});
    }
    
}
