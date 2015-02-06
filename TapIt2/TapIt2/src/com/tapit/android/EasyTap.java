package com.tapit.android;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class EasyTap extends Activity {

	Random random = new Random();

	int player1score, player2score;
	int whattopress;
	String pressbutton;
	TextView display1, display2, displaypress;
	Button player1A, player1B, player2A, player2B;
	@ Override
	public void onCreate (Bundle savedInstanceState)
	{
		super.onCreate (savedInstanceState);
		setContentView (R.layout.easytap);

		player1score = 0;
		player2score = 0;

		player1A = (Button) findViewById (R.id.button1A);
		player1B = (Button) findViewById (R.id.button1B);
		player2A = (Button) findViewById (R.id.button2A);
		player2B = (Button) findViewById (R.id.button2B);

		display1 = (TextView) findViewById (R.id.score1);
		display2 = (TextView) findViewById (R.id.score2);
		displaypress = (TextView) findViewById (R.id.whattopress);

		display1.setText("Player 1 Score: " + player1score);
		display2.setText("Player 2 Score: " + player2score);

		//random button
		whattopress = random.nextInt(3 - 1) + 1;;
		if (whattopress==1){
			pressbutton="A";
		}
		else{
			pressbutton="B";
		}
		displaypress.setText ("Press " + pressbutton + " now!");
		//random button


		player1A.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (player1score < 10 && player2score < 10){
					if (pressbutton=="A"){

						player1score++;
						display1.setText("Player 1 Score: " + player1score);

						whattopress = random.nextInt(3 - 1) + 1;;
						if (whattopress==1){
							pressbutton="A";
						}
						else{
							pressbutton="B";
						}
						displaypress.setText ("Press " + pressbutton + " now!");
					}
					else{
						player1score--;
						display1.setText("Player 1 Score: " + player1score);
					}
				}
				if (player1score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 1 wins!");
				}
				if (player2score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 2 wins!");
				}
			}
		}
				);
		player1B.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (player1score < 10 && player2score < 10){
					if (pressbutton=="B"){

						player1score++;
						display1.setText("Player 1 Score: " + player1score);

						whattopress = random.nextInt(3 - 1) + 1;;
						if (whattopress==1){
							pressbutton="A";
						}
						else{
							pressbutton="B";
						}
						displaypress.setText ("Press " + pressbutton + " now!");
					}
					else{
						player1score--;
						display1.setText("Player 1: " + player1score);
					}
				}
				if (player1score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 1 wins!");
				}
				if (player2score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 2 wins!");
				}
			}
		}
				);
		player2A.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (player1score < 10 && player2score < 10){
					if (pressbutton=="A"){

						player2score++;
						display2.setText("Player 2 Score: " + player2score);

						whattopress = random.nextInt(3 - 1) + 1;;
						if (whattopress==1){
							pressbutton="A";
						}
						else{
							pressbutton="B";
						}
						displaypress.setText ("Press " + pressbutton + " now!");
					}
					else{
						player2score--;
						display2.setText("Player 2 Score: " + player2score);

					}
				}
				if (player1score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 1 wins!");
				}
				if (player2score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 2 wins!");
				}
			}
		}
				);
		player2B.setOnClickListener (new View.OnClickListener ()
		{
			public void onClick (View v)
			{
				if (player1score < 10 && player2score < 10){
					if (pressbutton=="B"){

						player2score++;
						display2.setText("Player 2 Score: " + player2score);

						whattopress = random.nextInt(3 - 1) + 1;;
						if (whattopress==1){
							pressbutton="A";
						}
						else{
							pressbutton="B";
						}
						displaypress.setText ("Press " + pressbutton + " now!");
					}
					else{
						player2score--;
						display2.setText("Player 2 Score: " + player2score);
					}
				}
				if (player1score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 1 wins!");
				}
				if (player2score == 10){
					display1.setText("Player 1 Score: " + player1score);
					display2.setText("Player 2 Score: " + player2score);
					displaypress.setText ("Player 2 wins!");
				}
			}
		}
				);

	}

}
