package com.example.flo.login;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button Login;
    EditText username,password;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Login = (Button) findViewById(R.id.login);
        username = (EditText)findViewById(R.id.user);
        password = (EditText)findViewById(R.id.pw);




        Login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(username.getText().toString().equals("Bob@gmail.de") &&
                        password.getText().toString().equals("Password")) {
                    Toast.makeText(getApplicationContext(),"succsess!!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Credentials!!",Toast.LENGTH_SHORT).show();

                    counter--;

                    if ( counter == 0){
                        Login.setEnabled(false);
                    }


                }


            }
        });




    }

    @Override
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
    }
}
