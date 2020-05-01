package com.example.first.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.first.R

/**
 * display the main screen
 */
public class  MainActivity extends AppCompatActivity() implements maincontract.mvpview {
    private mainpresenter mpresenter;
    @override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpresenter= new_mainpresenter();
    }
}
