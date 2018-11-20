package com.mobileapps.week2daily1homework_datapersistance1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.mobileapps.week2daily1homework_datapersistance1.Constants.SHARE_PREF_NAME;
import static com.mobileapps.week2daily1homework_datapersistance1.Constants.USER_NAME;

public class MainActivity extends AppCompatActivity {


    SharedPreferences sharedPrefs;
    EditText etUserName;
    TextView tvDisplayUserName;
    MySQLite mySQLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName=findViewById(R.id.etUsername);
        tvDisplayUserName=findViewById(R.id.tvUserNameIs);
        sharedPrefs=getSharedPreferences(SHARE_PREF_NAME,Context.MODE_PRIVATE);

        String userNameToDisplay=sharedPrefs.getString(USER_NAME,"No Name");
        tvDisplayUserName.setText(userNameToDisplay);
    }

    public void Click(View view) {
        switch (view.getId()){
            case R.id.btnSaveUserName:
                if(!etUserName.getText().toString().isEmpty()){
                    String username=etUserName.getText().toString();
                    SharedPreferences.Editor editor=sharedPrefs.edit();
                    editor.putString(Constants.USER_NAME,username);
                    editor.commit();
                }
                break;
            case R.id.btnRtrvUserName:
                String userNameToDisplay=sharedPrefs.getString(Constants.USER_NAME,"No Name");
                tvDisplayUserName.setText(userNameToDisplay);
                break;
            case R.id.btntoLogin:
                String userName = tvDisplayUserName.getText().toString();
                Intent intent1=new Intent(this,Login.class);
                intent1.putExtra("username",userName);
                startActivity(intent1);
                break;
        }

    }
}
