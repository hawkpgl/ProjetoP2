package com.hawkpgl.minhasmotos;

import com.hawkpgl.minhasmotos.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if (item.getItemId() == R.id.action_about){
			Intent intent = new Intent(this, SobreActivity.class);
			startActivity(intent);
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	public void gotoFazerActivity(View v){
		
		Intent intent = new Intent(this, FazerActivity.class);
		startActivity(intent);
	}
	
	public void gotoDragstarActivity(View v){
			
			Intent intent = new Intent(this, DragstarActivity.class);
			startActivity(intent);
		}

	public void gotoNinjaActivity(View v){
		
		Intent intent = new Intent(this, NinjaActivity.class);
		startActivity(intent);
	}
	
}
