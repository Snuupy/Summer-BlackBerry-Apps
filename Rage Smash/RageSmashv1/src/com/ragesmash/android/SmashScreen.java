package com.ragesmash.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
@SuppressWarnings("unused")
public class SmashScreen extends Activity {
	int countera, counterb;
	TextView display;
    Button playera, playerb;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.smash);
		final Context context = this;
	
	        
	        countera = 0;
	        counterb = 0;
	        
	        playera = (Button) findViewById(R.id.button2a);
	        playerb = (Button) findViewById(R.id.button2b);
	        
		        display = (TextView) findViewById(R.id.textView1);
		        playera.setOnClickListener(new View.OnClickListener(){
		        	public void onClick(View v){
		        	if (countera <10 && counterb <10)
		        	{
			        	countera++;
			        	display.setText("Player 1: " + countera + "-----" + "Player 2: " + counterb);
		        	}
		        	else
		        	{
		        		if (countera>counterb)
		        		{
		        			display.setText ("Player 1 wins! Please press the back button to go back to the main screen.");
		        		}
		        		else if (counterb>countera)
		        		{
		        			display.setText("Player 2 wins! Please press the back button to go back to the main screen.");
		        		}
		        	}
		        	}
		        });


		        playerb.setOnClickListener(new View.OnClickListener(){
			        public void onClick(View v){
			        if (countera <10 && counterb <10)
			        	{
			        	counterb++;
			        	display.setText("Player 1: " + countera + "-----" + "Player 2: " + counterb);
		        	}
		        	else
		        	{
		        		if (countera>counterb)
		        		{
		        			display.setText ("Player 1 wins! Please press the back button to go back to the main screen.");
		        		}
		        		else if (counterb>countera)
		        		{
		        			display.setText("Player 2 wins! Please press the back button to go back to the main screen.");
		        		}
		        	}
			        }
		        });
		        

			//	Intent intent = new Intent(context, RageTapActivity.class);
            //    startActivity(intent); 
	}
}
