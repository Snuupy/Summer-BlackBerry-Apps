package com.ragesmash2.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RageSmash2Activity extends Activity {

	Button button1, button2,button3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		addListenerOnButton();
	}

	public void addListenerOnButton() {
		final Context context = this;
		button1 = (Button) findViewById(R.id.bsmash1);
		button2 = (Button) findViewById(R.id.bsmash2);
		button3 = (Button) findViewById(R.id.bexit);

		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(context, regularsmash.class);
				startActivity(intent);   
			}
		});
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, doublesmash.class);
				startActivity(intent);   
			}
		});	
		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				finish();  
			}
		});
	}
}