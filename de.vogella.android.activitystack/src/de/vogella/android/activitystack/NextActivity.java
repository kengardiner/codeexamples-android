package de.vogella.android.activitystack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onClick(View view) {
		Intent intent = new Intent(this, NextNextActivity.class);
		startActivity(intent);
	}
}
