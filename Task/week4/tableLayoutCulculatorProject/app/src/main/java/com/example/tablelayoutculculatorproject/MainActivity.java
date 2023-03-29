package com.example.tablelayoutculculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/* ***************************************
 * 프로젝트명 : tableLayoutCalculatorProject
 * 작성자 : 2019038011 윤석현
 * 작성일 : 2023.03.29
 * 프로그램 설명 : 계산기 프로그램
 * ****************************************/


public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;
    Button[] numButtons = new Button[10];
    Integer[] numBtnIDs = {R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2,R.id.BtnNum3, R.id.BtnNum4, R.id.BtnNum5,
            R.id.BtnNum6, R.id.BtnNum7, R.id.BtnNum8, R.id.BtnNum9};
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                try {
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                }catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "모든 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return false;
                }
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                try {
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                }catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "모든 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return false;
                }
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                try {
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                }catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "모든 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return false;
                }
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                try {
                    if (Integer.parseInt(num2) == 0){
                        Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                        return false;}
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                }catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(), "모든 값을 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return false;
                }
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        for (i = 0; i< numBtnIDs.length; i++){
            numButtons[i] = (Button) findViewById(numBtnIDs[i]);
        }
        for(i=0;i<numBtnIDs.length;i++){
            final int index;
            index = i;

            numButtons[index].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    if(edit1.isFocused() == true){
                        num1 = edit1.getText().toString() + numButtons[index].getText().toString();
                        edit1.setText(num1);
                    }else if(edit2.isFocused() == true){
                        num2 = edit2.getText().toString() + numButtons[index].getText().toString();
                        edit2.setText(num2);

                    }else{
                        Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}