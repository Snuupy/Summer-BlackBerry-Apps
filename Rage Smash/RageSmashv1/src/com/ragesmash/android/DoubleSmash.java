package com.ragesmash.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoubleSmash extends Activity {

	int countera, counterb, P1Next, P2Next;
	TextView display1, display2, display3, display4;
	Button playeral, playerbl, playerar, playerbr;
	@ Override
	public void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.dsmash);


		countera = 0;
		counterb = 0;
		//Next: 0 for left, 1 for right
		P1Next = 0;
		P2Next = 0;

		playeral = (Button) findViewById (R.id.buttondsaleft);
		playerbl = (Button) findViewById (R.id.buttondsbleft);
		playerar = (Button) findViewById (R.id.buttondsaright);
		playerbr = (Button) findViewById (R.id.buttondsbright);


		display1 = (TextView) findViewById (R.id.textviewds1);
		display2 = (TextView) findViewById (R.id.textviewds2);
		display3 = (TextView) findViewById (R.id.leftright1);
		display4 = (TextView) findViewById (R.id.leftright2);
		
		display3.setText ("next: 1L - P1Next:" + P1Next);
		display4.setText ("next: 2L - P2Next:" + P2Next);
		
		playeral.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (P1Next==0){
				P1Next = 1;
				display3.setText ("pressed: 1L, next: 1R");
		        	if (countera <10 && counterb <10) {
				        	countera++;
				        	display1.setText("Player 1: " + countera);
				        	if (countera == 10){
			        			display2.setText ("Player 1 wins! Press back.");
				        	}
				        	else{
				        	display2.setText("Player 2: " + counterb);
				        	}
			        }
		        	else if (countera == 10 && counterb <10) {
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
		        	if (countera == 10){
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
			        if (counterb == 10){
		        		display1.setText ("Player 2 wins! Press back.");
		        	}
				}
				else if (P1Next==1){
				P1Next = 1;
				display3.setText ("pressed: 1L, next: 1R");
		        	if (countera <10 && counterb <10) {
			        	display1.setText("Player 1: " + countera);
			        	if (countera == 10){
		        			display2.setText ("Player 1 wins! Press back.");
			        	}
			        	else{
			        	display2.setText("Player 2: " + counterb);
			        	}
			        }
		        	else if (countera == 10 && counterb <10) {
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
		        	if (countera == 10){
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
			        if (counterb == 10){
		        		display1.setText ("Player 2 wins! Press back.");
		        	}
				}
			}
		}
		);

		playerar.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (P1Next==1){
				P1Next = 0;
				display3.setText ("pressed: 1R, next: 1L");
		        	if (countera <10 && counterb <10) {
			        	countera++;
			        	display1.setText("Player 1: " + countera);
			        	if (countera == 10){
		        			display2.setText ("Player 1 wins! Press back.");
			        	}
			        	else{
			        	display2.setText("Player 2: " + counterb);
			        	}
			        }
		        	else if (countera == 10 && counterb <10) {
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
				}
				else if (P1Next==0){
				P1Next = 0;
				display3.setText ("pressed: 1R, next: 1L");
		        	if (countera <10 && counterb <10) {
			        	display1.setText("Player 1: " + countera);
			        	display2.setText("Player 2: " + counterb);
			        }
		        	else if (countera == 10 && counterb <10) {
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
		        	if (countera == 10){
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
			        if (counterb == 10){
		        		display1.setText ("Player 2 wins! Press back.");
		        	}
				}
			}
		}
		);


		playerbl.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (P2Next==0){
				P2Next = 1;
				display4.setText ("pressed: 2L, next: 2R");
		        	if (countera <10 && counterb <10) {
			        	counterb++;
			        	if (counterb == 10){
		        			display1.setText ("Player 2 wins! Press back.");
			        	}
			        	else{
			        	display1.setText("Player 1: " + countera);
			        	}
			        	display2.setText("Player 2: " + counterb);
			        }
		        	else if (counterb == 10 && countera <10) {
	        			display1.setText ("Player 2 wins! Press back.");
		        	}
		        	if (countera == 10){
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
			        if (counterb == 10){
		        		display1.setText ("Player 2 wins! Press back.");
		        	}
				}
				else if (P2Next==1){
				P2Next = 1;
				display4.setText ("pressed: 2L, next: 2R");
		        	if (countera <10 && counterb <10) {
			        	display1.setText("Player 1: " + countera);
			        	display2.setText("Player 2: " + counterb);
			        }
		        	else if (counterb == 10 && countera <10) {
	        			display1.setText ("Player 2 wins! Press back.");
		        	}
		        	if (countera == 10){
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
			        if (counterb == 10){
		        		display1.setText ("Player 2 wins! Press back.");
		        	}
				}
			}
		}
		);

		playerbr.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (P2Next==1){
				P2Next = 0;
				display4.setText ("pressed: 2R, next: 2L");
		        	if (countera <10 && counterb <10) {
			        	counterb++;
			        	if (counterb == 10){
		        			display1.setText ("Player 2 wins! Press back.");
			        	}
			        	else{
			        	display1.setText("Player 1: " + countera);
			        	}
			        	display2.setText("Player 2: " + counterb);
			        }
		        	else if (counterb == 10 && countera <10) {
	        			display1.setText ("Player 2 wins! Press back.");
		        	}
		        	if (countera == 10){
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
			        if (counterb == 10){
		        		display1.setText ("Player 2 wins! Press back.");
		        	}
				}
				else if (P2Next==0){
				P2Next = 0;
				display4.setText ("pressed: 2R, next: 2L");
		        	if (countera <10 && counterb <10) {
			        	if (counterb == 10){
		        			display1.setText ("Player 2 wins! Press back.");
			        	}
			        	else{
			        	display1.setText("Player 1: " + countera);
			        	}
			        	display2.setText("Player 2: " + counterb);
			        }
		        	else if (counterb == 10 && countera <10) {
	        			display1.setText ("Player 2 wins! Press back.");
		        	}
		        	if (countera == 10){
	        			display2.setText ("Player 1 wins! Press back.");
		        	}
			        if (counterb == 10){
		        		display1.setText ("Player 2 wins! Press back.");
		        	}
				}
			}
		}
		);
		
		//      Intent intent = new Intent(context, RageTapActivity.class);
		//    startActivity(intent);
		
	}

}
