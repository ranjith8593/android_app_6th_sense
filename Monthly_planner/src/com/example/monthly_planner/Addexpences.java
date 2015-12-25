package com.example.monthly_planner;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import com.example.monthly_planner.Setmonthdata;
import android.widget.*;
import android.content.Context;
import com.example.monthly_planner.helper.*;



public class Addexpences extends Activity {
	Button button;
	Double cost;
	Context con =this;
	java.util.Date fdate;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_expences);
		DatabaseHelper db = new DatabaseHelper(this);
		Log.d("Insert: ", "Inserting .."); 
		EditText ea = (EditText) findViewById(R.id.food);
		String foods = ea.getText().toString();
		double foodi = Double.parseDouble(foods);
		
		//get the details from the xml page add expences
		
		EditText ea1 = (EditText) findViewById(R.id.transport);
		String trans = ea1.getText().toString();
		double trani = Double.parseDouble(trans);
		
		//get the details from the xml page add expences
		
		EditText ea2 = (EditText) findViewById(R.id.ca);
		String cas = ea2.getText().toString();
		double cai = Double.parseDouble(cas);
		
		//get the details from the xml page add expences
		
		EditText ea3 = (EditText) findViewById(R.id.medicine);
		String meds = ea3.getText().toString();
		double medi = Double.parseDouble(meds);
		
		//get the details from the xml page add expences
		
		EditText ea4 = (EditText) findViewById(R.id.gv);
		String gvs = ea4.getText().toString();
		double gvi = Double.parseDouble(gvs);
		
		EditText ea5 = (EditText) findViewById(R.id.hr);
		String hrs = ea5.getText().toString();
		double hri = Double.parseDouble(hrs);
		
		EditText ea6 = (EditText) findViewById(R.id.other);
		String other = ea6.getText().toString();
		double otheri = Double.parseDouble(other);
		
		EditText ea7 = (EditText) findViewById(R.id.entertainment);
		String ents = ea7.getText().toString();
		double enti = Double.parseDouble(ents);
		
		DatePicker ea8 = (DatePicker) findViewById(R.id.datePicker1);
		int day = ea8.getDayOfMonth();
		int month = ea8.getMonth();
		int year = ea8.getYear();
		StringBuilder date_string = new StringBuilder().append(month + 1)
        .append("-").append(day).append("-").append(year)
        .append(" ");
		String st = date_string.toString();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			 fdate = df.parse(st);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		if(ea != null)
		{
        db.create_food(new food(fdate,foodi)); 
		}
		if(ea7 != null)
		{
        db.create_e_and_t(new e_and_t(fdate,enti)); 
		}
		if(ea1 != null)
		{
        db.transport(new transport(fdate,trani)); 
		}
		if(ea2 != null)
		{
        db.create_c_and_a (new c_and_a(fdate,cai)); 
		}
		if(ea3 != null)
		{
        db.medicine(new medicine(fdate,medi)); 
		}
		if(ea4 != null)
		{
        db.create_g_and_v(new g_and_v(fdate,gvi)); 
		}
		if(ea5 != null)
		{
        db.house_rent(new house_rent(fdate,hri)); 
		}
		if(ea6 != null)
		{
        db.others(new others(fdate,otheri)); 
		}
		
		button = (Button)findViewById(R.id.button1);
		button.setOnClickListener( new OnClickListener()
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
	    		   Intent i = new Intent(con, Setmonthdata.class);
	    	        startActivity(i);
	    	   }
	       });
        
		
	}
	
}
