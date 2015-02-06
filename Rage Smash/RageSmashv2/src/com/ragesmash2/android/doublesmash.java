package com.ragesmash2.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;

public class doublesmash extends Activity  implements OnTouchListener {

	float x0, y0;
	int y1bordertop,y1borderbtm,y2bordertop,y2borderbtm;
	int xborderA, xborderB, xborderC;
	int score1, score2, maxscore;
	int id;
	int P1Next, P2Next;	

	TextView display1, displayscore1, displayscore2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.doublesmash);
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
		//border values
		y1bordertop=600;
		y1borderbtm=800;
		y2bordertop=0;
		y2borderbtm=200;
		xborderA=0;
		xborderB=240;
		xborderC=480;
		//border values
		maxscore=20;

		//Next: 0 for left, 1 for right
		P1Next = 0;
		P2Next = 0;
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
					if (x0 >xborderA && x0 < xborderB && P1Next==0){
						score1++;
						P1Next=1;
					}
					if (x0 >xborderB && x0 < xborderC && P1Next==1){
						score1++;
						P1Next=0;
					}
				}
				if (y0>y2bordertop && y0<y2borderbtm){
					if (x0 >xborderB && x0 < xborderC && P2Next==0){
						score2++;
						P2Next=1;
					}
					if (x0 >xborderA && x0 < xborderB && P2Next==1){
						score2++;
						P2Next=0;
					}
				}
			}
			displayscore1.setText("Player 1: "+score1+" ");
			displayscore2.setText("Player 2: "+score2+" ");
			if (score1==maxscore){
				display1.setText("Player 1 Wins!");
			}
			if (score2==maxscore){
				display1.setText("Player 2 Wins!");
			}
			break;
		case MotionEvent.ACTION_POINTER_UP:
			id=event.getActionIndex();
			x0 = event.getX(id);
			y0 = event.getY(id);
			//display1.setText("PT_UP "+x0+" "+y0+" "+id+" ");
			if (score1 <maxscore && score2<maxscore){
				if (y0>y1bordertop && y0<y1borderbtm){
					if (x0 >xborderA && x0 < xborderB && P1Next==0){
						score1++;
						P1Next=1;
					}
					if (x0 >xborderB && x0 < xborderC && P1Next==1){
						score1++;
						P1Next=0;
					}
				}
				if (y0>y2bordertop && y0<y2borderbtm){
					if (x0 >xborderB && x0 < xborderC && P2Next==0){
						score2++;
						P2Next=1;
					}
					if (x0 >xborderA && x0 < xborderB && P2Next==1){
						score2++;
						P2Next=0;
					}
				}
			}
			displayscore1.setText("Player 1: "+score1+" ");
			displayscore2.setText("Player 2: "+score2+" ");
			if (score1==maxscore){
				display1.setText("Player 1 Wins!");
			}
			if (score2==maxscore){
				display1.setText("Player 2 Wins!");
			}
			break;
		case MotionEvent.ACTION_MOVE:

			break;
		}
		return true;
	}
}
