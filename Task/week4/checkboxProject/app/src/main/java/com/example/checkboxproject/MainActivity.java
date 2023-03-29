package com.example.checkboxproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;


/* ***************************************
 * 프로젝트명 : checkboxProject
 * 작성자 : 2019038011 윤석현
 * 작성일 : 2023.03.29
 * 프로그램 설명 : CompoundButton의 checkbox의 rotate, enable, clickable 실습프로그램
 * ****************************************/


public class MainActivity extends AppCompatActivity {
    CheckBox rotateCheckBox;
    CheckBox enableCheckBox;
    CheckBox clickableCheckBox;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotateCheckBox = (CheckBox)findViewById(R.id.rotate45degrees);
        enableCheckBox = (CheckBox)findViewById(R.id.enableCheckBox);
        clickableCheckBox = (CheckBox)findViewById(R.id.clickableCheckBox);
        button = (Button)findViewById(R.id.button);
        rotateCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton butttonView, boolean isChecked){
                if(rotateCheckBox.isChecked()) button.setRotation(45);
                else button.setRotation(0);

            }
        });

        enableCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //button.setEnabled(enableCheckBox.isEnabled());
                if (enableCheckBox.isChecked()) button.setEnabled(true);
                else button.setEnabled(false);
            }
        });

        clickableCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (clickableCheckBox.isChecked()) button.setClickable(true);
                else button.setClickable(false);
            }
        });

    }
}