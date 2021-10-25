package com.example.mywork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView5=findViewById(R.id.textView5);
        Intent intent=getIntent();
        String xinwenye=intent.getStringExtra("xinwenye");
        if (xinwenye.equals("武汉市")){
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");

        }
        else if (xinwenye.equals("长沙市")) {
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");
        }
        else if (xinwenye.equals("南宁市")) {
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");
        }
        else if (xinwenye.equals("深圳市")) {
            textView5.setText(intent.getStringExtra("xinwenye")+"的详情页面");
        }
    }
}