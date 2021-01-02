package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btnClick(View view) {
        TextView txtFName = findViewById(R.id.txtMessage);
        EditText edtTxtName = findViewById(R.id.Namefield);
        txtFName.setText("First Name: " + edtTxtName.getText().toString());

        TextView txtLName= findViewById(R.id.textView2);
        EditText edtTxtName2 = findViewById(R.id.Namefield2);
        txtLName.setText("Last Name: " + edtTxtName2.getText().toString());

        TextView txtEmail= findViewById(R.id.textViewMail);
        EditText edtTxtEmail = findViewById(R.id.edittxtEmail);
        txtEmail.setText("Email: " + edtTxtEmail.getText().toString());
    }
}