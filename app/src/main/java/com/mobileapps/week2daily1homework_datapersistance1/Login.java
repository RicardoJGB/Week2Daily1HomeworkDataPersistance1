package com.mobileapps.week2daily1homework_datapersistance1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView tvHi;
    EditText etFullName;
    EditText etPhoneNumber;
    EditText etEmail;
    EditText etSkypeID;
    EditText etFbUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        tvHi=findViewById(R.id.tvWelcome);
        etFullName=findViewById(R.id.etFullName);
        etPhoneNumber=findViewById(R.id.etPhoneNumber);
        etEmail=findViewById(R.id.etEmail);
        etSkypeID = findViewById(R.id.etSkypeId);
        etFbUser = findViewById(R.id.etFbUser);

        String ExtraFromMain = getIntent().getStringExtra("username");

        String HiAgain = "Hello " + ExtraFromMain;
        tvHi.setText(HiAgain);

    }

    public void Clickity(View view) {
        switch (view.getId()) {
            case R.id.btnBackToMain:
            Intent intent2 = new Intent(this, MainActivity.class);
            startActivity(intent2);
            break;
            case R.id.btnIntoDB:
                String usrFullName=etFullName.getText().toString();
                String usrPhoneNumber=etPhoneNumber.getText().toString();
                String usrEmail=etEmail.getText().toString();
                String usrSkypeID=etSkypeID.getText().toString();
                String usrFbUser=etFbUser.getText().toString();


        }
    }
}