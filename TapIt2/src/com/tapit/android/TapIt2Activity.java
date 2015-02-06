package com.tapit.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TapIt2Activity extends Activity {
	Button button1, button2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		addListenerOnButton();
	}

	public void addListenerOnButton() {
		final Context context = this;
		button1 = (Button) findViewById(R.id.easybutton);
		button2 = (Button) findViewById(R.id.hardbutton);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, EasyTap.class);
                startActivity(intent);   
			}
			
		});
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, HardTap.class);
                startActivity(intent);   
			}
			
		});		
	}
}