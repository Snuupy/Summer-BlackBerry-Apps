package com.ragesmash3.android;

import java.util.Hashtable;

import com.flurry.android.FlurryAgent;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import com.inneractive.api.ads.InneractiveAdComponent;
import com.inneractive.api.ads.InneractiveAdEventsListener;
import com.inneractive.api.ads.InneractiveAdView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ragesmashactivity extends Activity implements InneractiveAdEventsListener{

	GoogleAnalyticsTracker tracker;

	Button button1, button2,button3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//the following will display the main.xml layout, which already includes the InneractiveAdView, 
		//in case you prefer inneractive's ad from within the XML
		setContentView(R.layout.main);

//		GoogleAnalyticsTracker tracker;

		FlurryAgent.onStartSession(this, "MXZCG22WG93J439QTQUK");
		FlurryAgent.logEvent("start - rage smash");
		
//		tracker = GoogleAnalyticsTracker.getInstance();
//		tracker.startNewSession("UA-29355281-2", this);
//		tracker.dispatch();
//		tracker.trackPageView("/Home");
//		tracker.dispatch();

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
				FlurryAgent.logEvent("click - regular smash");

				Intent intent = new Intent(context, regularsmash.class);
				startActivity(intent);   
			}
		});
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				FlurryAgent.logEvent("click - double smash");

				Intent intent = new Intent(context, doublesmash.class);
				startActivity(intent);   
			}
		});	
		button3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				FlurryAgent.logEvent("click - exit");

				finish();  
			}
		});
	}

	public void onStop()
	{
	   super.onStop();
	   FlurryAgent.onEndSession(this);
	   // your code
	}

	@Override
	public void inneractiveOnFailedToReceiveAd(InneractiveAdView adView) {
		Log.i("ragesmashactivity" , "inneractiveOnFailedToReceiveAd...");

	}

	@Override
	public void inneractiveOnReceiveAd(InneractiveAdView adView) {
		Log.i("ragesmashactivity" , "inneractiveOnReceiveAd...");
	}

	@Override
	public void inneractiveOnClickAd(InneractiveAdView adView) {
		Log.i("ragesmashactivity" , "inneractiveOnClickAd...");
	}

	@Override
	public void inneractiveOnReceiveDefaultAd(InneractiveAdView adView) {
		Log.i("ragesmashactivity" , "inneractiveOnReceiveDefaultAd...");
	}



}