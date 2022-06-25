package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void next11 (View view) {
        Intent intent = new Intent(this,MainActivity11.class);
        startActivity(intent);}
    public void next12 (View view) {
        Intent intent = new Intent(this,MainActivity12.class);
        startActivity(intent);}
    public void next13 (View view) {
        Intent intent = new Intent(this,MainActivity13.class);
        startActivity(intent);}
    public void next14 (View view) {
        Intent intent = new Intent(this,MainActivity14.class);
        startActivity(intent);}
    public void next15 (View view) {
        Intent intent = new Intent(this,MainActivity15.class);
        startActivity(intent);}
    public void next16 (View view) {
        Intent intent = new Intent(this,MainActivity16.class);
        startActivity(intent);}



}