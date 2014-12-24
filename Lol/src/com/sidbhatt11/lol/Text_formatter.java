package com.sidbhatt11.lol;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Text_formatter extends Activity {
	private RadioGroup rad;
	private EditText enterText;
	private TextView showText;
	private CheckBox styleBox;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text_formatter);
		//setup things
		EditText enterText = (EditText) findViewById(R.id.enterText);
		
		TextView sizeText = (TextView) findViewById(R.id.showTextSize);
		TextView colorText = (TextView) findViewById(R.id.showTextColor);
		TextView styleText = (TextView) findViewById(R.id.showTextStyle);
		

		CheckBox Bold = (CheckBox) findViewById(R.id.Bold);
		CheckBox Italic = (CheckBox) findViewById(R.id.Italic);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text_formatter, menu);
		return true;
	}

}
