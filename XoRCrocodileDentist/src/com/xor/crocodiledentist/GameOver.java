package com.xor.crocodiledentist;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;

public class GameOver extends Activity implements OnTouchListener{
	
	TextView display1, display2, display3;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gameover);
		endgame();
	}

	public boolean onTouch(View v, MotionEvent event) {
		//ImageView view = (ImageView) v;

		switch (event.getAction() & MotionEvent.ACTION_MASK) {
		case MotionEvent.ACTION_DOWN:
			break;
		}
		return true;
	}

	public void endgame(){


		// This example will cause the phone to vibrate "SOS" in Morse Code
		// In Morse Code, "s" = "dot-dot-dot", "o" = "dash-dash-dash"
		// There are pauses to separate dots/dashes, letters, and words
		// The following numbers represent millisecond lengths
		int dot = 200;      // Length of a Morse Code "dot" in milliseconds
		int dash = 2000;     // Length of a Morse Code "dash" in milliseconds
		int short_gap = 200;    // Length of Gap Between dots/dashes
		int medium_gap = 500;   // Length of Gap Between Letters
		int long_gap = 1000;    // Length of Gap Between Words
		long[] pattern = {
				0,  // Start immediately
				//dot, short_gap, dot, short_gap, dot,    // s
				//medium_gap,
				//dash, short_gap, dash, short_gap, dash, // o
				//medium_gap,
				//dot, short_gap, dot, short_gap, dot,    // s
				//long_gap
				dash
		};

		// Only perform this pattern one time (-1 means "do not repeat")
		// vib.vibrate(pattern, -1);

		// Get instance of Vibrator from current Context
		final Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		// Vibrate for 300 milliseconds
		//vib.vibrate(300);
		display2 = (TextView) findViewById (R.id.textView2);
		display3 = (TextView) findViewById (R.id.textView3);
		display2.setText("Game Over!");
		display3.setText("Tap Screen to Play Again!");
		vib.vibrate(pattern, -1);
		SoundManager.playSound(1, 1);
		display2 = (TextView) findViewById (R.id.textView2);
		display3 = (TextView) findViewById (R.id.textView3);
		display2.setText("Game Over!");
		display3.setText("Tap Screen to Play Again!");
		final ImageView BITE = (ImageView) findViewById(R.id.bgred);
		BITE.setVisibility(View.VISIBLE);

		// SLEEP 2 SECONDS HERE ...
		Handler handler = new Handler(); 
		handler.postDelayed(new Runnable() { 
			public void run() { 
				display2 = (TextView) findViewById (R.id.textView2);
				display3 = (TextView) findViewById (R.id.textView3);
				display2.setText("Game Over!");
				display3.setText("Tap Screen to Play Again!");

				BITE.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						finish();
					}
				});	         } 
		}, 2000); 
	}
}