package com.ragesmash.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class RageSmashActivity extends Activity {

	Button button, button2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		addListenerOnButton();
	}

	public void addListenerOnButton() {
		final Context context = this;
		button = (Button) findViewById(R.id.bsmash);
		button2 = (Button) findViewById(R.id.bsmash2);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, SmashScreen.class);
                startActivity(intent);   
			}
			
		});
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, DoubleSmash.class);
                startActivity(intent);   
			}
			
		});		
	}
}