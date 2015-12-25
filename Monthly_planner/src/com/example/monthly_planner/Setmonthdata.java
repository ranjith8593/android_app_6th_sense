package com.example.monthly_planner;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
/*import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.content.Context;*/
import android.content.Intent;


public class Setmonthdata extends Activity {

	public double money, food, transport,clothes,med,gros,houserent,others,entertainment;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_month_data);
		EditText editText = (EditText)findViewById(R.id.money);

		String editTextStr = editText.getText().toString();
		 money = Double.parseDouble(editTextStr);
		
		EditText editText2 = (EditText)findViewById(R.id.food);

		String editTextStr2 = editText2.getText().toString();
		 food = Double.parseDouble(editTextStr2);
		
		EditText editText3 = (EditText)findViewById(R.id.transport);

		String editTextStr3 = editText3.getText().toString();
		transport  = Double.parseDouble(editTextStr3);
		
		EditText editText4 = (EditText)findViewById(R.id.clothes);

		String editTextStr4 = editText4.getText().toString();
		clothes  = Double.parseDouble(editTextStr4);
		
		EditText editText5 = (EditText)findViewById(R.id.med);

		String editTextStr5 = editText5.getText().toString();
		med  = Double.parseDouble(editTextStr5);
		EditText editText6 = (EditText)findViewById(R.id.veg);

		String editTextStr6 = editText6.getText().toString();
		gros = Double.parseDouble(editTextStr6);
		
		EditText editText7 = (EditText)findViewById(R.id.houserent);

		String editTextStr7 = editText7.getText().toString();
		houserent  = Double.parseDouble(editTextStr7);
		
		EditText editText8 = (EditText)findViewById(R.id.other);

		String editTextStr8 = editText8.getText().toString();
		others  = Double.parseDouble(editTextStr8);
		
		EditText editText9 = (EditText)findViewById(R.id.entertainment);

		String editTextStr9 = editText9.getText().toString();
		entertainment  = Double.parseDouble(editTextStr9);
		
		Button button1 = (Button)findViewById(R.id.button1);
		final Context con = this;
		button1.setOnClickListener( new OnClickListener()
	       {
	    	   public void onClick(View v)
	    	   {
	    		   AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(con);
	    		   alertDialogBuilder.setTitle("Confirmation Dialogue");
	    		   alertDialogBuilder
					.setMessage("Click yes to exit!")
					.setCancelable(false)
					.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,int id) {
							// if this button is clicked, close
							// current activity
							Intent i = new Intent(con ,MainActivity.class);
			    	        startActivity(i);
						}
					  })
					  .setNegativeButton("No",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
								// if this button is clicked, just close
								// the dialog box and do nothing
								dialog.cancel();
							}
						});
		 
						// create alert dialog
						AlertDialog alertDialog = alertDialogBuilder.create();
		 
						// show it
						alertDialog.show();
					}
				});
	    	 
	    	        Intent i = new Intent(con ,MainActivity.class);
	    	        startActivity(i);
	    	        
	    	   }
	     
		
		
		
		
		
	}
	
	

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 
	public void addListener() {
		final Context con = this;
		button = (Button)findViewById(R.id.set_month_data);
		
        button.setOnClickListener( new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		   Intent i = new Intent(con, Setmonthdata.class);
    	        startActivity(i);
    	   }
       });
        
    }*/


