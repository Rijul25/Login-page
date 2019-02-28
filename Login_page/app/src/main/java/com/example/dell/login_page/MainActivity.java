package com.example.dell.login_page;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void LogInClicked(View view){
        Toast.makeText(MainActivity.this,"Hi there",Toast.LENGTH_LONG).show();
        EditText editText=findViewById(R.id.UsernameEditText);
        EditText editText2=findViewById(R.id.PasswordEditText);
        Log.i("Username",editText.getText().toString());
        Log.i("Password",editText2.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
