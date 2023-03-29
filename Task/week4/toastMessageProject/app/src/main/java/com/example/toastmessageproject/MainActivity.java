package com.example.toastmessageproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

/* ***************************************
 * 프로젝트명 : toastMessageProject
 * 작성자 : 2019038011 윤석현
 * 작성일 : 2023.03.29
 * 프로그램 설명 : editText의 값을 토스트메시지로 출력하는 프로그램
 * ****************************************/

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);



        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Context context = getApplicationContext();
                String editTextStr = editText.getText().toString();
                Toast.makeText(context, editTextStr, Toast.LENGTH_SHORT).show();
            }
            @Override public void afterTextChanged(Editable s) {
            }
        });

    }


}