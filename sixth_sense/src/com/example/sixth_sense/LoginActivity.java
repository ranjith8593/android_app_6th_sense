package com.example.sixth_sense;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
 
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
 
import com.example.sixth_sense.UserFunctions;
 
public class LoginActivity extends Activity {
	  private ProgressDialog pDialog;
    Button btnLogin;
    Button btnLinkToRegister;
    EditText inputusername;
    EditText inputmobile;
    TextView loginErrorMsg;
 
    // JSON Response node names
    private static String KEY_SUCCESS = "success";
   
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
 
        // Importing all assets like buttons, text fields
        inputusername = (EditText) findViewById(R.id.loginusername);
        inputmobile = (EditText) findViewById(R.id.loginmobile);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        
 
        // Login button Click Event
        btnLogin.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View view) {
                String username = inputusername.getText().toString();
                String mobile = inputmobile.getText().toString();
                UserFunctions userFunction = new UserFunctions();
                JSONObject json = userFunction.loginUser(username, mobile);
                
 
                // check for login response
                try {
                
                    if ( json.getString(KEY_SUCCESS)!= null) {
                     	 pDialog = new ProgressDialog(LoginActivity.this);
                    	 pDialog.setMessage("error");
                    	String res = json.getString(KEY_SUCCESS); 
                    	if(Integer.parseInt(res) == 1){
                    	  	 
                       Intent i = new Intent(getApplicationContext(),
                                MainActivity.class);
                        startActivity(i);
                       finish();
                        
                    }
                    }
                    else{
                        // Error in login
                    	 pDialog = new ProgressDialog(LoginActivity.this);
                    	 pDialog.setMessage("error");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
 
        // Link to Register Screen
       
    }
}