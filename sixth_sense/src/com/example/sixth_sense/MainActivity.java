package com.example.sixth_sense;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends Activity {

	
	Button btnCreateProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        
        //Buttons
       
        btnCreateProduct= (Button) findViewById(R.id.btnCreateProduct);
        //view products click event
        
        btnCreateProduct.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), NewProductActivity.class);
                startActivity(i);
				
			}
		});
    }
    
}
