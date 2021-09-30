package com.example.intenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnClick;
    EditText etName,etEmail;
    public static final String KEY_NAME="Name";
    public static final String KEY_EMAIL="Email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick=findViewById(R.id.btnClick);
        etName=findViewById(R.id.etName);
        etEmail=findViewById(R.id.etEmail);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eName=etName.getText().toString().trim();
                String eEmail=etEmail.getText().toString().trim();
                Intent intent=new Intent(MainActivity.this,Second_Activity.class);
                intent.putExtra(KEY_NAME,eName);
                intent.putExtra(KEY_EMAIL,eEmail);
                startActivity(intent);
            }
        });
    }
}

//TODO:1.  Create Project.
//TODO:2. In Main xml Design two Edit Text and one button,give them Id's.
//TODO:3. In MainActivity.java Define Button and editText,find their Ids and make clickListenter of button                //Line No 12-13
//TODO:4. Now Make Keys of Name and Email Global.                                                                              //LINE NO 14-15
//TODO:5. In Click Listener convert Edit Texts into String                                                                //LINE NO 27-28
//TODO:6. Start Intent                                                                                                    //LINE NO  29
//TODO:7. Now put keys in putExtra Method                                                                               //LINE NO 30-31
//TODO:8. Now start the Intent                                                                                          //LINE NO 32