package com.xor.crocodiledentist;

import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

public class CrocodileActivity extends Activity implements OnTouchListener{

	Button button1, button2,button3;
	public int tooth, randomnumber;	
	int alphaAmount1 = 0, alphaAmount2 = 255; // some value 0-255 where 0 is fully transparent and 255 is fully opaque
	TextView display1, display2, display3;
	int flag1=0, flag2=0, flag3=0, flag4=0, flag5=0, flag6=0, flag7=0, flag8=0, flag9=0, flagA=0, flagB=0, flagC=0;
	int gameover = 0;

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



	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.regular);

		AdView adview = (AdView)findViewById(R.id.adView);
		AdRequest re = new AdRequest();
		adview.loadAd(re);

		//Create, Initialise and then load the Sound manager
		SoundManager.getInstance();
		SoundManager.initSounds(this);
		SoundManager.loadSounds();  
		Random random = new Random();

		final Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

		randomnumber = random.nextInt(13 - 1) + 1; //random.nextInt((max-1)-min)+min
		tooth = randomnumber;

		final ImageView Tooth01 = (ImageView) findViewById(R.id.ImgTooth02);
		final ImageView Tooth02 = (ImageView) findViewById(R.id.ImgTooth0B);
		final ImageView Tooth03 = (ImageView) findViewById(R.id.ImgTooth12);
		final ImageView Tooth04 = (ImageView) findViewById(R.id.ImgTooth1B);
		final ImageView Tooth05 = (ImageView) findViewById(R.id.ImgTooth23);
		final ImageView Tooth06 = (ImageView) findViewById(R.id.ImgTooth2A);
		final ImageView Tooth07 = (ImageView) findViewById(R.id.ImgTooth34);
		final ImageView Tooth08 = (ImageView) findViewById(R.id.ImgTooth39);
		final ImageView Tooth09 = (ImageView) findViewById(R.id.ImgTooth45);
		final ImageView Tooth10 = (ImageView) findViewById(R.id.ImgTooth46);
		final ImageView Tooth11 = (ImageView) findViewById(R.id.ImgTooth47);
		final ImageView Tooth12 = (ImageView) findViewById(R.id.ImgTooth48);


		//		ImageView BITE = (ImageView) findViewById(R.id.bgred);
		//		BITE.setVisibility(View.GONE);

		Tooth01.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth01.setImageResource(R.drawable.tooth_pressed);
				if (tooth==1 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag1==0 && gameover==0){
						vib.vibrate(200);
						flag1=1;
					}
				}
			}
		});
		Tooth02.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth02.setImageResource(R.drawable.tooth_pressed);
				if (tooth==2 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag2==0 && gameover==0){
						vib.vibrate(200);
						flag2=1;
					}
				}
			}
		});
		Tooth03.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth03.setImageResource(R.drawable.tooth_pressed);
				if (tooth==3 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag3==0 && gameover==0){
						vib.vibrate(200);
						flag3=1;
					}
				}
			}
		});
		Tooth04.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth04.setImageResource(R.drawable.tooth_pressed);
				if (tooth==4 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag4==0 && gameover==0){
						vib.vibrate(200);
						flag4=1;
					}
				}
			}
		});
		Tooth05.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth05.setImageResource(R.drawable.tooth_pressed);
				if (tooth==5 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag5==0 && gameover==0){
						vib.vibrate(200);
						flag5=1;
					}
				}
			}
		});
		Tooth06.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth06.setImageResource(R.drawable.tooth_pressed);
				if (tooth==6 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag6==0 && gameover==0){
						vib.vibrate(200);
						flag6=1;
					}
				}
			}
		});
		Tooth07.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth07.setImageResource(R.drawable.tooth_pressed);
				if (tooth==7 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag7==0 && gameover==0){
						vib.vibrate(200);
						flag7=1;
					}
				}
			}
		});
		Tooth08.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth08.setImageResource(R.drawable.tooth_pressed);
				if (tooth==8 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag8==0 && gameover==0){
						vib.vibrate(200);
						flag8=1;
					}
				}
			}
		});
		Tooth09.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth09.setImageResource(R.drawable.tooth_pressed);
				if (tooth==9 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flag9==0 && gameover==0){
						vib.vibrate(200);
						flag9=1;
					}
				}
			}
		});
		Tooth10.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth10.setImageResource(R.drawable.tooth_pressed);
				if (tooth==10 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flagA==0 && gameover==0){
						vib.vibrate(200);
						flagA=1;
					}
				}
			}
		});
		Tooth11.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth11.setImageResource(R.drawable.tooth_pressed);
				if (tooth==11 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flagB==0 && gameover==0){
						vib.vibrate(200);
						flagB=1;
					}
				}
			}
		});
		Tooth12.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Tooth12.setImageResource(R.drawable.tooth_pressed);
				if (tooth==12 && gameover==0){
					endgame();
					Tooth01.setImageResource(R.drawable.tooth);
					Tooth02.setImageResource(R.drawable.tooth);
					Tooth03.setImageResource(R.drawable.tooth);
					Tooth04.setImageResource(R.drawable.tooth);
					Tooth05.setImageResource(R.drawable.tooth);
					Tooth06.setImageResource(R.drawable.tooth);
					Tooth07.setImageResource(R.drawable.tooth);
					Tooth08.setImageResource(R.drawable.tooth);
					Tooth09.setImageResource(R.drawable.tooth);
					Tooth10.setImageResource(R.drawable.tooth);
					Tooth11.setImageResource(R.drawable.tooth);
					Tooth12.setImageResource(R.drawable.tooth);
					//					display2.setText("");
					//					display3.setText("");
				}
				else{
					if (flagC==0 && gameover==0){
						vib.vibrate(200);
						flagC=1;
					}
				}
			}
		});

	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		//ImageView view = (ImageView) v;

		switch (event.getAction() & MotionEvent.ACTION_MASK) {
		case MotionEvent.ACTION_DOWN:

			//			id=event.getActionIndex();
			//			x0 = event.getX(id);
			//			y0 = event.getY(id);
			//			if (y0>y1bordertop && y0<y1borderbtm){
			//			}
			//			if (y0>y2bordertop && y0<y2borderbtm){
			//			}
			//			//display1.setText("DOWN "+x0+" "+y0+" "+id+" ");
			//			if (score1==maxscore){
			//				display1.setText("Player 1 Wins!");
			//			}
			//			if (score2==maxscore){
			//				display1.setText("Player 2 Wins!");
			//			}
			break;
		}
		return true;
	}

	public void endgame(){

		final Context context = this;

		gameover=1;
		Intent intent = new Intent(context, GameOver.class);
		startActivity(intent);
		gameover=0;
		Random random = new Random();
		randomnumber = random.nextInt(13 - 1) + 1; //random.nextInt((max-1)-min)+min
		tooth = randomnumber;
		flag1=0; flag2=0; flag3=0; flag4=0; flag5=0; flag6=0; flag7=0; flag8=0; flag9=0; flagA=0; flagB=0; flagC=0;
	}

	@Override
	protected void onStop() {
		//Log.w(TAG, "App stopped");

		super.onStop();
	}

	@Override
	protected void onDestroy() {
		//Log.w(TAG, "App destoryed");

		super.onDestroy();
	}
}