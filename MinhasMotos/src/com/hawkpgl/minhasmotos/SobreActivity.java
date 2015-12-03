package com.hawkpgl.minhasmotos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SobreActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sobre);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		Toast msg = Toast.makeText(this, "Sobre Paulo Lemos", Toast.LENGTH_LONG);
		msg.show();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		if (item.getItemId() == android.R.id.home){
			finish();
		}
		
		return super.onOptionsItemSelected(item);
	}
	
	public void gotoFacebook(View v){
		String webPage = "https://www.facebook.com/paulo.degouveialemos";
		
		Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webPage));
		startActivity(intent);		
	}
	
	public void gotoEmail(View v){
		
		Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
	            "mailto","hawkpgl@gmail.com", null));
		emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Aplicativo Android");
		emailIntent.putExtra(Intent.EXTRA_TEXT, "A respeito do aplicativo Android feito para ESCM");
		
		startActivity(Intent.createChooser(emailIntent, "Enviar Email"));
	}
}
