package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void next (View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);}
    public void next2 (View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent); }
    public void next3 (View view) {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent); }
    public void next4 (View view) {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent); }
    public void next5 (View view) {
        Intent intent = new Intent(this,MainActivity6.class);
        startActivity(intent);}
    public void next6 (View view) {
        Intent intent = new Intent(this,MainActivity7.class);
        startActivity(intent);}
    public void next7 (View view) {
        Intent intent = new Intent(this,MainActivity8.class);
        startActivity(intent);}
    public void next8 (View view) {
        Intent intent = new Intent(this,MainActivity9.class);
        startActivity(intent);}
    public void next9 (View view) {
        Intent intent = new Intent(this,MainActivity10.class);
        startActivity(intent);}


}
