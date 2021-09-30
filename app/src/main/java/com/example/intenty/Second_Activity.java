package com.example.intenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    TextView tvName_second,tvEmail_Second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        tvName_second=findViewById(R.id.tvName_two);
        tvEmail_Second=findViewById(R.id.tv_Email_two);
        Intent intent=getIntent();
        String name=intent.getStringExtra(MainActivity.KEY_NAME);
        String email=intent.getStringExtra(MainActivity.KEY_EMAIL);
        tvName_second.setText(name);
        tvEmail_Second.setText(email);
    }
}

//TODO:9. Make new Empty Activity
//TODO:10. In xml of this Design three TextView
//TODO:11.In SecondActivity.java Define Textviews,find their Ids                                     //LINE NO 10/16-17
//TODO:12. now apply getIntent method.                                                               //LINE NO 18
//TODO:13. Now get Strings from Keys by getStringExtras method                                       //LINE NO 19-20
//TODO:14. In Last Step set this on the Text Views                                                   //LINE NO 21-22