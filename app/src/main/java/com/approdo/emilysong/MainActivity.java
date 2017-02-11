package com.approdo.emilysong;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends ActionBarActivity {
	
	private MediaPlayer dontcallme;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.e("Banana", "if music be the food of love");
	}
	
	@Override
	protected void onResume(){
		Log.e("Pickle", "onResume");
		dontcallme = MediaPlayer.create(this, R.raw.kalimba);
		dontcallme.start();
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		Log.e("Pickle", "onPause");
		dontcallme.stop();
		dontcallme.release();
		super.onPause();
	}
	
	public void openFB(View v){
		String url = "https://www.facebook.com/emily.otnes.music";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void openBC(View v){
		String url = "http://emilyotnesmusic.bandcamp.com/";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}

}