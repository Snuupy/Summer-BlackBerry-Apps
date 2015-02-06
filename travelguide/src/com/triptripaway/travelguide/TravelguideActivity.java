package com.triptripaway.travelguide;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class TravelguideActivity extends Activity implements OnGestureListener{
	/** Called when the activity is first created. */

	private GestureDetector gDetector;

	//database
	Object [][] imgDB = {
			{"1","France","Paris","Arc De Triomphe","arcdetriomphe","Arc de Triomphe","2012","Mario Dias","The Arc de Triomphe (Arc de Triomphe de l'Étoile) is one of the most famous monuments in Paris. It stands in the centre of the Place Charles de Gaulle (originally named Place de l'Étoile), at the western end of the Champs-Élysées.] There is a smaller arch, the Arc de Triomphe du Carrousel, which stands west of the Louvre. The Arc de Triomphe (in English: 'Triumphal Arch') honours those who fought and died for France in the French Revolutionary and the Napoleonic Wars, with the names of all French victories and generals inscribed on its inner and outer surfaces. Beneath its vault lies the Tomb of the Unknown Soldier from World War I."},
			{"2","France","Paris","Notre Dame Cathedral","notredame","Notre Dame Cathedral","2012","Martin Alteirac","Notre Dame de Paris, also known as Notre Dame Cathedral or simply Notre Dame, is a historic Roman Catholic Marian cathedral on the eastern half of the Île de la Cité in the fourth arrondissement of Paris, France. Widely considered one of the finest examples of French Gothic architecture and among the largest and most well-known churches in the world ever built, Notre Dame is the cathedral of the Catholic Archdiocese of Paris; that is, it is the church that contains the cathedra (official chair) of the Archbishop of Paris, currently André Vingt-Trois. The cathedral treasury is notable for its reliquary, which houses the purported crown of thorns, a fragment of the True Cross and one of the Holy Nails – all instruments of the Passion and a few of the most important first-class relics."}
	};

	int[] imgnames = new int[2];{
		imgnames[0] = R.drawable.arcdetriomphe;
		imgnames[1] = R.drawable.notredame;
	}
	int numimgs=2;
	int imglogmax=numimgs+1;

	int [] imglog= new int [imglogmax];{
	}

	ImageView image;

	int randomnumber;
	int randomold, randomnew;
	int randommin=1;
	int imglogcounter=-1;

	Random random = new Random();

	@Override

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//addListenerOnImage();
		image = (ImageView) findViewById(R.id.imageView1);

		gDetector = new GestureDetector(this);

		randomold=-1;

	};

	@Override
	public boolean onDown(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onFling(MotionEvent start, MotionEvent finish, float xVelocity, float yVelocity) {
		//		randomnumber = random.nextInt(((numimgs-1)-(randommin-1)+1)+(randommin-1)); //random.nextInt((max - min + 1) + min);
		//		while(randomnumber==randomold){
		//			randomnumber = random.nextInt(((numimgs-1)-(randommin-1)+1)+(randommin-1)); //random.nextInt((max - min + 1) + min);
		//		}
		//		randomold=randomnumber;
		//		//Toast.makeText(getApplicationContext(), "text text " + randomnumber, Toast.LENGTH_SHORT).show();
		//		image.setImageResource(imgnames[randomnumber]);

		//		if (start.getRawY() < finish.getRawY()) {
		//			Toast.makeText(getApplicationContext(), "DOWN", Toast.LENGTH_SHORT).show();
		//		} 
		//		else if (start.getRawY() > finish.getRawY()) {
		//			Toast.makeText(getApplicationContext(), "UP", Toast.LENGTH_SHORT).show();
		//		}
		if (start.getRawX() < finish.getRawX()) {
			//Toast.makeText(getApplicationContext(), "RIGHT", Toast.LENGTH_SHORT).show();
			//image.setImageResource(imgnames[randomold]);						
		} 
		else if (start.getRawX() > finish.getRawX()) {
			//Toast.makeText(getApplicationContext(), "LEFT", Toast.LENGTH_SHORT).show();

			//if next imglog = 0, show new random img
			//if next imglog != 0, show next imglog img

			if (imglogcounter+1==imglogmax){
				imglogcounter=0;
			}

			if (imglog[imglogcounter+1]==0){
				randomnumber = random.nextInt(((numimgs)-(randommin)+1)+(randommin)); //random.nextInt((max - min + 1) + min);
				if (imglogcounter==-1){
					randomnumber = random.nextInt(((numimgs)-(randommin)+1)+(randommin)); //random.nextInt((max - min + 1) + min);
				}
				else{
					while(randomnumber==imglog[imglogcounter]){
						randomnumber = random.nextInt(((numimgs)-(randommin)+1)+(randommin)); //random.nextInt((max - min + 1) + min);
					}
				}
				while(randomnumber==0){
					randomnumber = random.nextInt(((numimgs)-(randommin)+1)+(randommin)); //random.nextInt((max - min + 1) + min);
				}
				imglogcounter++;
				imglog[imglogcounter]=randomnumber;	
				image.setImageResource(imgnames[imglog[imglogcounter]-1]);
				//Toast.makeText(getApplicationContext(), "imglog: "+(imglog[imglogcounter]-1), Toast.LENGTH_SHORT).show();
				//Toast.makeText(getApplicationContext(), "randomnumber: "+(randomnumber), Toast.LENGTH_SHORT).show();
				Toast.makeText(getApplicationContext(), "imglog: "+(imglog[imglogcounter]-1)+"imglogcounter: "+(imglogcounter), Toast.LENGTH_SHORT).show();
			}
			else if (imglog[imglogcounter+1]!=0){
				imglogcounter++;
				image.setImageResource(imgnames[imglog[imglogcounter]-1]);
				Toast.makeText(getApplicationContext(), "imglog: "+(imglog[imglogcounter]-1)+"imglogcounter: "+(imglogcounter), Toast.LENGTH_SHORT).show();
			}

			//			randomnumber = random.nextInt(((numimgs-1)-(randommin-1)+1)+(randommin-1)); //random.nextInt((max - min + 1) + min);
			//			while(randomnumber==randomold){
			//				randomnumber = random.nextInt(((numimgs-1)-(randommin-1)+1)+(randommin-1)); //random.nextInt((max - min + 1) + min);
			//			}
			//			randomold=randomnumber;
			//			imglog[imglogcounter]=randomnumber;
			//			imglogcounter++;
			//			image.setImageResource(imgnames[randomnumber]);
			//			Toast.makeText(getApplicationContext(), "imglog: "+imglog[imglogcounter+1], Toast.LENGTH_SHORT).show();

		}
		return true;	
	}
	@Override
	public void onLongPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public boolean onScroll(MotionEvent arg0, MotionEvent arg1, float arg2, float arg3) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onShowPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public boolean onSingleTapUp(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onTouchEvent(MotionEvent me) {
		return gDetector.onTouchEvent(me);
	}

	//	public void addListenerOnImage(){
	//
	//		image.setOnClickListener(new OnClickListener() {
	//			public void onClick(View v) {
	//				randomnumber = random.nextInt(((numimgs-1)-(randommin-1)+1)+(randommin-1)); //random.nextInt((max - min + 1) + min);
	//				Toast.makeText(getApplicationContext(), "text text " + randomnumber, Toast.LENGTH_SHORT).show();
	//				image.setImageResource(imgnames[randomnumber]);				
	//			}
	//		});
	//	}

}