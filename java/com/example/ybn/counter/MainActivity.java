package com.example.ybn.counter;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.String;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String X,Y,Z;
    int x = 0;
    int y = 0;
    int z = 0;
    String c = "";         //判断加减乘除
    boolean b = false;
    boolean d = false;
    Button btn_0;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_point; //小数点
    Button btn_clear; //清除
    Button btn_del;   //删除
    Button btn_plus;
    Button btn_minus;
    Button btn_multiply;
    Button btn_divide;
    Button btn_equal;
    private TextView et_input;
    private TextView et_input1;
    private TextView et_input2;
    private TextView et_char1;
    private TextView et_char2;
    private StringBuilder pending = new StringBuilder();
    private StringBuilder pending2 = new StringBuilder();
    private StringBuilder pending3 = new StringBuilder();

    private void initView() {
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multiply = (Button) findViewById(R.id.btn_multiply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_equal = (Button) findViewById(R.id.btn_equal);
        et_input = (TextView) findViewById(R.id.et_input);
        et_input1 = (TextView) findViewById(R.id.et_input1);
        et_input2 = (TextView) findViewById(R.id.et_input2);
        et_char1 = (TextView) findViewById(R.id.et_char1);
        et_char2 = (TextView) findViewById(R.id.et_char2);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_del.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        initView();
    }
    public void onClick(View v) {
        if(b == true && d == false) {
            switch (v.getId()) {
                case  R.id.btn_del:
                    y = y/10;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_0:
                    y = y*10 + 0;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_1:
                    y = y*10 + 1;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_2:
                    y = y*10 + 2;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_3:
                    y = y*10 + 3;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_4:
                    y = y*10 + 4;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_5:
                    y = y*10 + 5;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_6:
                    y = y*10 + 6;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_7:
                    y = y*10 + 7;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_8:
                    y = y*10 + 8;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_9:
                    y = y*10 + 9;
                    Y = String.valueOf(y);
                    et_input1.setText(Y);
                    break;
                case R.id.btn_clear: //清空
                    X = "";
                    Y = "";
                    x=0;y=0;
                    b=false;
                    c = "";
                    et_input2.setHint("");
                    et_input2.setText("");
                    et_input.setText(X);
                    et_input1.setText(X);
                    et_char1.setText(X);
                    et_char2.setText(X);
                    break;
                case R.id.btn_equal:
                    et_char2.setText("=");
                    try {
                        if (c == "+") {
                            z = x + y;
                            Z = String.valueOf(z);
                            et_char2.setText("=");
                            et_input2.setText(Z);
                            d = true;
                            break;
                        } else if (c == "-") {
                            z = x - y;
                            Z = String.valueOf(z);
                            et_char2.setText("=");
                            et_input2.setText(Z);
                            d = true;
                            break;
                        } else if (c == "*") {
                            z = x * y;
                            Z = String.valueOf(z);
                            et_char2.setText("=");
                            et_input2.setText(Z);
                            d = true;
                            break;
                        } else if (c == "/") {
                            z = x / y;
                            Z = String.valueOf(z);
                            et_char2.setText("=");
                            et_input2.setText(Z);
                            d = true;
                            break;
                        }
                    }catch (Exception e){
                        et_input2.setHint("输入不合法");
                        Toast.makeText(this,"0不能当除数",Toast.LENGTH_LONG).show();
                        break;
                    }
                    break;
            }
        }
        else if(b == false)
        {
            switch (v.getId()) {
                case R.id.btn_del:
                    x=x/10;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_0:
                    x = x*10 + 0;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_1:
                    x = x*10 + 1;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_2:
                    x = x*10 + 2;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_3:
                    x = x*10 + 3;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_4:
                    x = x*10 + 4;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_5:
                    x = x*10 + 5;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_6:
                    x = x*10 + 6;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_7:
                    x = x*10 + 7;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_8:
                    x = x*10 + 8;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_9:
                    x = x*10 + 9;
                    X = String.valueOf(x);
                    et_input.setText(X);
                    break;
                case R.id.btn_point:
//                    x += ".";
                    et_input.setText(X);
                    break;
                case R.id.btn_plus:
                    c = "+";
                    b = true;
                    et_char1.setText(c);
                    break;
                case R.id.btn_minus:
                    c = "-";
                    b = true;
                    et_char1.setText(c);
                    break;
                case R.id.btn_multiply:
                    c = "*";
                    b = true;
                    et_char1.setText(c);
                    break;
                case R.id.btn_divide:
                    c = "/";
                    b = true;
                    et_char1.setText(c);
                    break;
                case R.id.btn_clear: //清空
                    X = "";
                    x=0;
                    y=0;
                    b=false;
                    d=false;
                    c = "";
                    et_input.setText(X);
                    et_input1.setText(X);
                    et_input2.setText("");
                    et_input2.setHint("");
                    et_char1.setText(X);
                    et_char2.setText(X);
                    break;
            }
        }
        else if(b ==true && d == true )
        {
            switch (v.getId()) {
                case R.id.btn_clear:
                X = "";
                x = 0;
                y = 0;
                b = false;
                d = false;
                c = "";
                et_input.setText(X);
                et_input1.setText(X);
                et_input2.setText("");
                et_input2.setHint("");
                et_char1.setText(X);
                et_char2.setText(X);
                break;
            }
        }

    }

}