package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView res;
    EditText num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        res=findViewById(R.id.res);
        res.setVisibility(View.GONE);

       num=findViewById(R.id.num);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String id=num.getText().toString();
               int c=Integer.parseInt(id);
               int t=(c/3)+4;
               res.setText("temperature="+t);
               res.setVisibility(View.VISIBLE);
           }
       });
    }
}