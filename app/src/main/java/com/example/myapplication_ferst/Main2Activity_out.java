package com.example.myapplication_ferst;

//import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity_out extends AppCompatActivity {

@Override
 protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main2_out);
     Button twook = findViewById(R.id.twook);


   twook.setOnClickListener(new View.OnClickListener() {
     @Override
   public void onClick(View v) {

 }
 });
  }
}
