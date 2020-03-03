package com.samu.reg_login_with_status;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile extends AppCompatActivity {

    private TextView textView;

    //---add extra
    private EditText editText_username_v,editTextStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        textView = (TextView) findViewById(R.id.textViewUserName);

        //---add extra
        editText_username_v= (EditText)findViewById(R.id.editText_username);
        editTextStatus = (EditText)findViewById(R.id.editText_status) ;



        Intent intent = getIntent();

        String username = intent.getStringExtra(ActivityLogin.USER_NAME);
        textView.setText("Welcome User "+username);

            //---add extra
        String password = intent.getStringExtra(ActivityLogin.PASSWORD);


        editText_username_v.setText(""+password);

        String status = intent.getStringExtra(ActivityLogin.STATUS);


        editTextStatus.setText(""+status);
    }

}