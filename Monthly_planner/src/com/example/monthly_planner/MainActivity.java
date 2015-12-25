package com.example.monthly_planner;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.*;
import android.view.View.OnClickListener;
import com.example.monthly_planner.Setmonthdata;
import android.widget.*;
import android.content.Context;


public class MainActivity extends Activity {

	Button button1,button2,button3,button4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListener();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 
	public void addListener() {
		final Context con = this;
		button1 = (Button)findViewById(R.id.set_month_data);
		button2 = (Button)findViewById(R.id.add_expences);
		button3 = (Button)findViewById(R.id.export_data);
		button4 = (Button)findViewById(R.id.generate_expence_graph);
		
		
		
		
		
		
        button1.setOnClickListener( new OnClickListener()
       {
    	   public void onClick(View v)
    	   {
    		   Intent i = new Intent(con, Setmonthdata.class);
    	        startActivity(i);
    	   }
       });
        button2.setOnClickListener( new OnClickListener()
        {
     	   public void onClick(View v)
     	   {
     		   
     		   Intent i = new Intent(con, Addexpences.class);
     	        startActivity(i);
     	   }
        });
        button3.setOnClickListener( new OnClickListener()
        {
     	   public void onClick(View v)
     	   {
     		   Intent i = new Intent(con, ExportData.class);
     	        startActivity(i);
     	   }
        });
        button4.setOnClickListener( new OnClickListener()
        {
     	   public void onClick(View v)
     	   {
     		   Intent i = new Intent(con, GenerateExpenceGraph.class);
     	        startActivity(i);
     	   }
        });
      
        
    }

}
