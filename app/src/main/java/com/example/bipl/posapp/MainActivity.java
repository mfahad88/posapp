package com.example.bipl.posapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    TextView tv_forgot;
    Button btn_login;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);
        tv_forgot=(TextView) findViewById(R.id.Forgot);
        btn_login=(Button) findViewById(R.id.buttonLogin);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!username.getText().toString().trim().equals("") && !password.getText().toString().trim().equals("")) {
                    new loginValidation().execute();
                }else{
                    username.setHint("Empty Fields not allowed");
                }
            }
        });
    }
    private  class loginValidation extends AsyncTask<Void, Void,Void>{

        @Override
        protected Void doInBackground(Void... params) {
            /*try{
                Thread.sleep(100);
            }catch (Exception e){
                Thread.interrupted();
                Toast.makeText(MainActivity.this, "Interrupted", Toast.LENGTH_SHORT).show();
            }*/
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            String user= username.getText().toString();
            String pass=password.getText().toString();
            if(user.equals("admin") && pass.equals("admin")){
                Toast.makeText(MainActivity.this, "Login Success...", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),SelectionActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(MainActivity.this, "Login Failed..!!!", Toast.LENGTH_SHORT).show();
            }

        }
    }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
