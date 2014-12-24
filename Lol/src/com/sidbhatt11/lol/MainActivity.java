package com.sidbhatt11.lol;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
/*
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
*/
public class MainActivity extends Activity {
	/*
	private EditText editText;
	private TextView nameField;
	private Button btn;
	*/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().hide();
		/*
		editText = (EditText) findViewById(R.id.TextField);	
		nameField = (TextView) findViewById(R.id.textView1);
		btn = (Button) findViewById(R.id.button1);
		OnClickListener a = new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String str = "Hi "+editText.getText()+" !";
				nameField.setText(str);
			}
		};
		btn.setOnClickListener(a);
		*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
