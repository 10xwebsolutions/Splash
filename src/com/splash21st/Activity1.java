package com.splash21st;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Activity1 extends Activity {

	ImageView i1;
	ProgressBar p1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity1);
		i1 = (ImageView) findViewById(R.id.imageView1);
		Thread icon = new Thread() {
			public void run() {
				
				synchronized (this) {
					try {
						wait(4000);
						   runOnUiThread(new Runnable() {
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								showimg();
							}
						});
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				
			}
		};

		icon.start();
	}
	
	
	public void showimg() {
		i1.setImageResource(R.drawable.androicon);
	}

}
