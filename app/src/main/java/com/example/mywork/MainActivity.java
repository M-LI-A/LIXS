package com.example.mywork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Fragment weixinFragment=new weixinFragment();
    private Fragment configFragment=new configFragment();
    private Fragment comtactFragment=new comtactFragment();
    private Fragment friendFragment=new friendFragment();
    private FragmentManager fragmentManager;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private ImageView imageView1,imageView2,imageView3,imageView4;
    private TextView textView1,textView2,textView3,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout1=findViewById(R.id.Linearlayout1);
        linearLayout2=findViewById(R.id.Linearlayout2);
        linearLayout3=findViewById(R.id.Linearlayout3);
        linearLayout4=findViewById(R.id.Linearlayout4);
        linearLayout1.setOnClickListener(this);
        linearLayout2.setOnClickListener(this);
        linearLayout3.setOnClickListener(this);
        linearLayout4.setOnClickListener(this);
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        initFragment();
    }
    private void initFragment(){
        fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.id_content,weixinFragment);
        transaction.add(R.id.id_content,friendFragment);
        transaction.add(R.id.id_content,configFragment);
        transaction.add(R.id.id_content,comtactFragment);
        hideFragment(transaction);
        transaction.commit();

    }
    private void hideFragment(@NonNull FragmentTransaction transaction){

        transaction.hide(weixinFragment);
        transaction.hide(friendFragment);
        transaction.hide(configFragment);
        transaction.hide(comtactFragment);
    }
    @Override
    public void onClick(View view) {
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (view.getId()){
            case R.id.Linearlayout1:
                showfragment(0);
                imageView1.setColorFilter(Color.GREEN);
                textView1.setTextColor(Color.GREEN);
                break;
            case R.id.Linearlayout2:
                showfragment(1);
                imageView2.setColorFilter(Color.GREEN);
                textView2.setTextColor(Color.GREEN);
                break;
            case R.id.Linearlayout3:
                showfragment(2);
                imageView3.setColorFilter(Color.GREEN);
                textView3.setTextColor(Color.GREEN);
                break;
            case R.id.Linearlayout4:
                showfragment(3);
                imageView4.setColorFilter(Color.GREEN);
                textView4.setTextColor(Color.GREEN);
                break;
            default:
                break;
        }
    }
    private void showfragment(int i) {
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        hideFragment(transaction);
        switch (i){
            case 0:
                transaction.show(weixinFragment);
                break;
            case 1:
                transaction.show(configFragment);
                break;
            case 2:
                transaction.show(friendFragment);
                break;
            case 3:
                transaction.show(comtactFragment);
                break;

        }
        transaction.commit();
        imageView1.setColorFilter(Color.WHITE);
        imageView2.setColorFilter(Color.WHITE);
        imageView3.setColorFilter(Color.WHITE);
        imageView4.setColorFilter(Color.WHITE);
        textView1.setTextColor(Color.WHITE);
        textView2.setTextColor(Color.WHITE);
        textView3.setTextColor(Color.WHITE);
        textView4.setTextColor(Color.WHITE);

    }
}