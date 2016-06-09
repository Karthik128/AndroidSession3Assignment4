package com.assignment.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText email = (EditText)findViewById(R.id.emailInput);
        final EditText password = (EditText)findViewById(R.id.passwordInput);

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = email.getText().toString();
                String str2 = password.getText().toString();

                if (TextUtils.isEmpty(str1)){
                    email.setError("Enter Email");
                    email.requestFocus();
                    return;

                }



                if (TextUtils.isEmpty(str2)){
                    password.setError("Enter Password");
                    password.requestFocus();
                    return;
                }


            }
        });

    }
    public static final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
    );



}
