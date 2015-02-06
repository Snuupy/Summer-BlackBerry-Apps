package com.ragesmash3.android;

import com.flurry.android.FlurryAgent;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnTouchListener;

public class regularsmash extends Activity implements OnTouchListener {

	GoogleAnalyticsTracker tracker;

	float x0, y0;
	float y1bordertop,y1borderbtm,y2bordertop,y2borderbtm;
	int score1, score2, maxscore;
	int id, xscreen, yscreen;

	TextView display1, displayscore1, displayscore2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.regularsmash);
		ImageView view = (ImageView) findViewById(R.id.imageView);
		view.setOnTouchListener(this);
		display1 = (TextView) findViewById (R.id.textView1);
		//display1.setOnTouchListener(this);
		displayscore1 = (TextView) findViewById (R.id.textView01);
		//displayscore1.setOnTouchListener(this);
		displayscore2 = (TextView) findViewById (R.id.textView02);
		//displayscore2.setOnTouchListener(this);
		score1=0;
		score2=0;
		displayscore1.setText("Player 1: "+score1);
		displayscore2.setText("Player 2: "+score2);

		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);

		yscreen=metrics.heightPixels;
		xscreen=metrics.widthPixels;

		//display1.setText(xscreen + " " + yscreen);

		//border values
		y1bordertop= (float) (0.75*yscreen);
		y1borderbtm= (float) 1*yscreen;
		y2bordertop= (float) 0*yscreen;
		y2borderbtm= (float) (0.25*yscreen);
		//border values
		maxscore=20;
		
		FlurryAgent.logEvent("start - regular smash");

//		tracker = GoogleAnalyticsTracker.getInstance();
//		tracker.trackPageView("/RegularSmash");
//		tracker.dispatch();

	}

	public boolean onTouch(View v, MotionEvent event) {
		//ImageView view = (ImageView) v;

		switch (event.getAction() & MotionEvent.ACTION_MASK) {
		case MotionEvent.ACTION_DOWN:
			id=event.getActionIndex();
			x0 = event.getX(id);
			y0 = event.getY(id);
			if (y0>y1bordertop && y0<y1borderbtm){
			}
			if (y0>y2bordertop && y0<y2borderbtm){
			}
			//display1.setText("DOWN "+x0+" "+y0+" "+id+" ");
			if (score1==maxscore){
				display1.setText("Player 1 Wins!");
			}
			if (score2==maxscore){
				display1.setText("Player 2 Wins!");
			}
			break;
		case MotionEvent.ACTION_POINTER_DOWN:
			id=event.getActionIndex();
			x0 = event.getX(id);
			y0 = event.getY(id);
			//display1.setText("PT_DOWN "+x0+" "+y0+" "+id+" ");
			if (score1==maxscore){
				display1.setText("Player 1 Wins!");
			}
			if (score2==maxscore){
				display1.setText("Player 2 Wins!");
			}
			break;
		case MotionEvent.ACTION_UP:
			id=event.getActionIndex();
			x0 = event.getX(id);
			y0 = event.getY(id);
			//display1.setText("UP "+x0+" "+y0+" "+id+" ");
			if (score1 <maxscore && score2<maxscore){
				if (y0>y1bordertop && y0<y1borderbtm){
					score1++;
				}
			}
			if (score1 <maxscore && score2<maxscore){
				if (y0>y2bordertop && y0<y2borderbtm){
					score2++;
				}
			}
			displayscore1.setText("Player 1: "+score1);
			displayscore2.setText("Player 2: "+score2);
			if (score1==maxscore){
				display1.setText("Player 1 Wins!");
				FlurryAgent.logEvent("win - player 1, regular smash");

			}
			if (score2==maxscore){
				display1.setText("Player 2 Wins!");
				FlurryAgent.logEvent("win - player 2, regular smash");

			}
			break;
		case MotionEvent.ACTION_POINTER_UP:
			id=event.getActionIndex();
			x0 = event.getX(id);
			y0 = event.getY(id);
			//display1.setText("PT_UP "+x0+" "+y0+" "+id+" ");
			if (score1 <maxscore && score2<maxscore){
				if (y0>y1bordertop && y0<y1borderbtm){
					score1++;
				}
			}
			if (score1 <maxscore && score2<maxscore){
				if (y0>y2bordertop && y0<y2borderbtm){
					score2++;
				}
			}
			displayscore1.setText("Player 1: "+score1);
			displayscore2.setText("Player 2: "+score2);
			if (score1==maxscore){
				display1.setText("Player 1 Wins!");
				FlurryAgent.logEvent("win - player 1, regular smash");

			}
			if (score2==maxscore){
				display1.setText("Player 2 Wins!");
				FlurryAgent.logEvent("win - player 2, regular smash");

			}
			break;
		case MotionEvent.ACTION_MOVE:

			break;
		}
		return true;
	}
}
