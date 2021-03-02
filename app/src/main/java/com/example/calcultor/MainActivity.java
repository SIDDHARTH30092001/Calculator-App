package com.example.calcultor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText currentText,resultText;
    private String currentString="",resultString="";
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDivision,btnMultiplication,btnAddition,btnSubtraction,btnPercentage,btnEqual,btnDot,btnAC,btnDel;
    private boolean dot_insert,dot_operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dot_insert=false;
        dot_operator=false;

        currentText=findViewById(R.id.inputText);
        resultText=findViewById(R.id.outputText);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnAddition=findViewById(R.id.btnAddition);
        btnSubtraction=findViewById(R.id.btnSubtraction);
        btnMultiplication=findViewById(R.id.btnMultiplication);
        btnDivision=findViewById(R.id.btnDivision);
        btnPercentage=findViewById(R.id.btnPercentage);
        btnEqual=findViewById(R.id.btnEqual);
        btnDot=findViewById(R.id.btnDot);
        btnAC=findViewById(R.id.btnAC);
        btnDel=findViewById(R.id.btnDel);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"0";
                displayOne();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"1";
                displayOne();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"2";
                displayOne();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"3";
                displayOne();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"4";
                displayOne();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"5";
                displayOne();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"6";
                displayOne();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"7";
                displayOne();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"8";
                displayOne();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentString=currentString+"9";
                displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delete();
                displayOne();
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set dot_insert =false;
                dot_insert=false;
                //check if current string not empty
                //if last digit a dot =>remove
                if(!currentString.isEmpty()){
                    if(currentString.substring(currentString.length()-1,currentString.length()).equals(".")){
                        delete();
                    }
                }
                //dot_operator=false=>append op to curr
                if(dot_insert==false){
                    currentString=currentString+" / ";
                    dot_insert=true;
                }
                //displayOne
                displayOne();
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set dot_insert =false;
                dot_insert=false;
                //check if current string not empty
                //if last digit a dot =>remove
                if(!currentString.isEmpty()){
                    if(currentString.substring(currentString.length()-1,currentString.length()).equals(".")){
                        delete();
                    }
                }
                //dot_operator=false=>append op to curr
                if(dot_insert==false){
                    currentString=currentString+" * ";
                    dot_insert=true;
                }
                //displayOne
                displayOne();
            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set dot_insert =false;
                dot_insert=false;
                //check if current string not empty
                //if last digit a dot =>remove
                if(!currentString.isEmpty()){
                    if(currentString.substring(currentString.length()-1,currentString.length()).equals(".")){
                        delete();
                    }
                }
                //dot_operator=false=>append op to curr
                if(dot_insert==false){
                    currentString=currentString+" + ";
                    dot_insert=true;
                }
                //displayOne
                displayOne();
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set dot_insert =false;
                dot_insert=false;
                //check if current string not empty
                //if last digit a dot =>remove
                if(!currentString.isEmpty()){
                    if(currentString.substring(currentString.length()-1,currentString.length()).equals(".")){
                        delete();
                    }
                }
                //dot_operator=false=>append op to curr
                if(dot_insert==false){
                    currentString=currentString+" - ";
                    dot_insert=true;
                }
                //displayOne
                displayOne();
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set dot_insert =false;
                dot_insert=false;
                //check if current string not empty
                //if last digit a dot =>remove
                if(!currentString.isEmpty()){
                    if(currentString.substring(currentString.length()-1,currentString.length()).equals(".")){
                        delete();
                    }
                }
                //dot_operator=false=>append op to curr
                if(dot_insert==false){
                    currentString=currentString+" % ";
                    dot_insert=true;
                }
                //displayOne
                displayOne();
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if empty append 0 and set dot_insert var true
                if (currentString.isEmpty()) {
                    currentString = "0.";
                    dot_insert = true;
                }
                //if dot_insert == false append "."
                //if (dot_insert == false){}
                currentString = currentString + ".";
                dot_insert = true;
                displayOne();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if last digit is not an op && space
                if (dot_operator == false && !currentString.substring(currentString.length() - 1, currentString.length()).equals(" ")) {
                    String[] conditions = currentString.split(" ");

                    switch (conditions[1].charAt(0)) {
                        case '+':
                            resultString = Double.toString(Double.parseDouble(conditions[0]) + Double.parseDouble(conditions[2]));
                            break;
                        case '-':
                            resultString = Double.toString(Double.parseDouble(conditions[0]) - Double.parseDouble(conditions[2]));
                            break;
                        case '/':
                            resultString = Double.toString(Double.parseDouble(conditions[0]) / Double.parseDouble(conditions[2]));
                            break;
                        case '*':
                            resultString = Double.toString(Double.parseDouble(conditions[0]) * Double.parseDouble(conditions[2]));
                            break;
                        case '%':
                            resultString = Double.toString(Double.parseDouble(conditions[0]) % Double.parseDouble(conditions[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });
    }

    public void displayOne(){
        currentText.setText(currentString);

    }

    public void displayTwo(){
        resultText.setText(resultString);
        currentString=resultString;
    }

    public void clear(){
        currentString="";
        resultString="";
        dot_insert=false;
        dot_operator=false;
    }

    public void delete(){
        //if currStr !=empty => remove last char
        if(!currentString.isEmpty()){
            //if dot is last char in curr=> dot_ins =false
            if(currentString.substring(currentString.length()-1,currentString.length()).equals(".")) {
                 dot_insert=false;
            }
            //if op is detected=>delete three digits or chars from curr and set op_ins=false
            if(currentString.substring(currentString.length()-1,currentString.length()).equals(" ")){
                currentString=currentString.substring(0,currentString.length()-3);
                dot_operator=false;
            }
            else{
                currentString = currentString.substring(0, currentString.length() - 1);
            }
        }
    }

}