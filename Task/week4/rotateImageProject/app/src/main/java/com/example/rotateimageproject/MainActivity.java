package com.example.rotateimageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/* ***************************************
 * 프로젝트명 : rotateImageProject
 * 작성자 : 2019038011 윤석현
 * 작성일 : 2023.03.29
 * 프로그램 설명 : 버튼을 클릭하면 이미지가 돌아가는 프로그램
 * ****************************************/

public class MainActivity extends AppCompatActivity {
    Button rotateButton;
    ImageView dogImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rotateButton = (Button)findViewById(R.id.rotateButton);
        dogImage = (ImageView) findViewById(R.id.dogImage);

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //dogImage.getRotation();
                dogImage.setRotation((dogImage.getRotation()+10)%360);
            }
        });
    }
}