package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7,
    button8, button9, buttonAdd, buttonSub, buttonDiv, buttonMulti, button10, buttonC,
    buttonEquals;

    EditText mEditText;

    float mValOne, mValTwo;

    boolean mAddition, mSubtraction, mDivision, mMultiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonMulti = (Button) findViewById(R.id.buttonmul);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEquals = (Button) findViewById(R.id.buttoneql);
        mEditText = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                mEditText.setText(mEditText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (mEditText == null){
                    mEditText.setText("");
                }else{
                    mValOne = Float.parseFloat(mEditText.getText() + "");
                    mAddition = true;
                    mEditText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValOne = Float.parseFloat(mEditText.getText() + "");
                mSubtraction = true;
                mEditText.setText(null);
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValOne = Float.parseFloat(mEditText.getText() + "");
                mMultiplication = true;
                mEditText.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mValOne = Float.parseFloat(mEditText.getText() + "");
                mDivision = true;
                mEditText.setText(null);
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               mValTwo = Float.parseFloat(mEditText.getText() + "");

               if (mAddition == true){
                   mEditText.setText(mValOne + mValTwo + "");
                   mAddition = false;
               }

                if (mSubtraction == true){
                    mEditText.setText(mValOne - mValTwo + "");
                    mSubtraction = false;
                }

                if (mMultiplication == true){
                    mEditText.setText(mValOne * mValTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true){
                    mEditText.setText(mValOne / mValTwo + "");
                    mDivision = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mEditText.setText(mEditText.getText() + ".");
            }
        });
    }
}
