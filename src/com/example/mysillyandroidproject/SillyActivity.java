package com.example.mysillyandroidproject;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends Activity
{
	private Button appButton;
	private TextView appText;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorList;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);

		// gives you access to a button or any view object
		appButton = (Button) findViewById(R.id.firstButton);
		appText = (TextView) findViewById(R.id.sillyTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		colorList = new ArrayList<Integer>();
		fillTheColorList();
		setupListeners();
	}

	private void fillTheColorList()
	{
		colorList.add( R.color.pink);
		colorList.add( R.color.green);
		colorList.add( R.color.cyan);
		colorList.add( R.color.orange);	
	}

	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				//appLayout.setBackgroundResource(colorList.());

				

			}
		});

	}
}
