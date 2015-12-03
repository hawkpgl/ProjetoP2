package com.hawkpgl.minhasmotos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class FazerActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fazer);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		Toast msg = Toast.makeText(this, "Yamaha Fazer YS250", Toast.LENGTH_LONG);
		msg.show();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if (item.getItemId() == android.R.id.home){
			finish();
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	public void gotoFabricante(View v){
		String webPage = "http://www.yamaha-motor.com.br/";
		
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webPage));
		startActivity(intent);		
	}

}
