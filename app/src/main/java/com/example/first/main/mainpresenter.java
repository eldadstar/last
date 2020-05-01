package com.example.first.main;

/**
 * is responsible for handling
 */
public class mainpresenter implements maincontract.mvpview {
    private maincontract.mvpview mview;

    mainpresenter(maincontract.mvpview view){
        mview=view;


    }
}
