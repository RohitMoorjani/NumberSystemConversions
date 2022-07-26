package com.rohitmoorjani.numbersystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class main extends AppCompatActivity {
    Toolbar toolbar;
    TextInputLayout inputl;
    TextInputEditText input;
    CardView resultl;
    TextView result;
    FloatingActionButton s1;
    String func;
    private static final String TAG = "main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h2b);
        func=getIntent().getStringExtra("key");
        toolbar=findViewById(R.id.toolbar2);
        inputl=findViewById(R.id.inputl);
        input=findViewById(R.id.input);
        result=findViewById(R.id.result);
        resultl=findViewById(R.id.resultl);
        s1=findViewById(R.id.s1);
        setSupportActionBar(toolbar);
        if(func.equals("h2b"))
            getSupportActionBar().setTitle("Hexadecimal to Binary");
        else if(func.equals("o2b")) {
            getSupportActionBar().setTitle("Octal to Binary");
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
        else if (func.equals("o2d")){
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
            getSupportActionBar().setTitle("Octal to Decimal");
        }
        else if (func.equals("o2h")){
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
            getSupportActionBar().setTitle("Octal to Hexadecimal");
        }
        else if (func.equals("h2d"))
            getSupportActionBar().setTitle("Hexadecimal to Decimal");
        else if (func.equals("h2o"))
            getSupportActionBar().setTitle("Hexadecimal to Octal");
        else if (func.equals("b2d")){
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
            getSupportActionBar().setTitle("Binary to Decimal");
        }
        else if (func.equals("b2o")){
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
            getSupportActionBar().setTitle("Binary to Octal");
        }
        else if (func.equals("b2h")){
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
            getSupportActionBar().setTitle("Binary to Hexadecimal");
        }
        else if (func.equals("d2b")) {
            getSupportActionBar().setTitle("Decimal to Binary");
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
        else if (func.equals("d2o")){
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
            getSupportActionBar().setTitle("Decimal to Octal");
        }
        else if (func.equals("d2h")){
            input.setInputType(InputType.TYPE_CLASS_NUMBER);
            getSupportActionBar().setTitle("Decimal to Hexadecimal");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input.getText().toString().length() == 0)
                    inputl.setError("Please give valid input");
                else{
                    inputl.setError(null);

                if(func.equals("h2b")) {
                    getSupportActionBar().setTitle("Hexadecimal to Binary");
                    h2b();
                }
                else if(func.equals("o2b")) {
                    getSupportActionBar().setTitle("Octal to Binary");
                    o2b();
                }
                else if (func.equals("o2d")) {
                    getSupportActionBar().setTitle("Octal to Decimal");
                    o2d();
                }
                else if (func.equals("o2h")) {
                    getSupportActionBar().setTitle("Octal to Hexadecimal");
                    o2h();
                }
                else if (func.equals("h2d")) {
                    getSupportActionBar().setTitle("Hexadecimal to Decimal");
                    h2d();
                }
                else if (func.equals("h2o")) {
                    getSupportActionBar().setTitle("Hexadecimal to Octal");
                    h2o();
                }
                else if (func.equals("b2d")) {
                    getSupportActionBar().setTitle("Binary to Decimal");
                    b2d();
                }
                else if (func.equals("b2o")) {
                    getSupportActionBar().setTitle("Binary to Octal");
                    b2o();
                }
                else if (func.equals("b2h")) {
                    getSupportActionBar().setTitle("Binary to Hexadecimal");
                    b2h();
                }
                else if (func.equals("d2b")) {
                    getSupportActionBar().setTitle("Decimal to Binary");
                    d2b();
                }
                else if (func.equals("d2o")) {
                    getSupportActionBar().setTitle("Decimal to Octal");
                    d2o();
                }
                else if (func.equals("d2h")) {
                    getSupportActionBar().setTitle("Decimal to Hexadecimal");
                    d2h();
                }}
            }
        });

    }
    void h2b(){
        String s1="",s2="";
        String dec="";
        int i=0;
        char[] num=input.getText().toString().toCharArray();
        int t=num.length;
        while(i<t){
            if (num[i]=='0')
                dec=dec.concat("0000");
            else if(num[i]=='1')
                dec=dec.concat("0001");
            else if(num[i]=='2')
                dec=dec.concat("0010");
            else if(num[i]=='3')
                dec=dec.concat("0011");
            else if(num[i]=='4')
                dec=dec.concat("0100");
            else if(num[i]=='5')
                dec=dec.concat("0101");
            else if (num[i]=='6')
                dec=dec.concat("0110");
            else if(num[i]=='7')
                dec=dec.concat("0111");
            else if(num[i]=='8')
                dec=dec.concat("1000");
            else if(num[i]=='9')
                dec=dec.concat("1001");
            else if (num[i]=='A'|| num[i]=='a')
                dec=dec.concat("1010");
            else if(num[i]=='B'|| num[i]=='b')
                dec=dec.concat("1011");
            else if(num[i]=='C'|| num[i]=='c')
                dec=dec.concat("1100");
            else if(num[i]=='D'|| num[i]=='d')
                dec=dec.concat("1101");
            else if(num[i]=='E'|| num[i]=='e')
                dec=dec.concat("1110");
            else if(num[i]=='F'|| num[i]=='f')
                dec=dec.concat("1111");
            i++;
        }

        result.setText(dec);
    }
    void o2b(){
        String s1="";
        int dec=0;
        int i=0;
        int num=Integer.parseInt(input.getText().toString());

        while(num!=0){
            dec+=(num%10) * (int)Math.pow(8,i);
            i++;
            num/=10;
        }
        int x=dec;
        String s2="";

        while(dec!=0) {
            int a=(dec%2);
            s1=a+s1;
            dec/=2;
        }

        result.setText(s1);
    }
    void o2d() {
        String s1="";
        int dec=0;
        int i=0;
        int num=Integer.parseInt(input.getText().toString());

        while(num!=0){
            dec+=(num%10) * (int)Math.pow(8,i);
            i++;
            num/=10;
        }
        s1+=dec;
        result.setText(s1);
    }
    void o2h() {
        String Arr[]={"A","B","C","D","E","F"};
        String s1="";
        int dec=0;
        int i=0;
        int num=Integer.parseInt(input.getText().toString());

        while(num!=0){
            dec+=(num%10) * (int)Math.pow(8,i);
            i++;
            num/=10;
        }
        while (dec != 0) {
            int a = dec%16;
            if (a <= 9)
                s1=a+s1;
            else if (a >= 10 && a <= 15) {
                String x="";
                x=Arr[a-10];
                s1=x+s1;
            }
            dec/=16;
        }
        result.setText(s1);
    }
    void h2d() {
        String s1="",s2="";
        String dec="";
        int i=0,decimal=0;
        char[] num=input.getText().toString().toCharArray();
        int t=num.length;
        int sum=0,j=0;
        while(i<t){
            if (num[i]=='0')
                dec=dec.concat("0000");
            else if(num[i]=='1')
                dec=dec.concat("0001");
            else if(num[i]=='2')
                dec=dec.concat("0010");
            else if(num[i]=='3')
                dec=dec.concat("0011");
            else if(num[i]=='4')
                dec=dec.concat("0100");
            else if(num[i]=='5')
                dec=dec.concat("0101");
            else if (num[i]=='6')
                dec=dec.concat("0110");
            else if(num[i]=='7')
                dec=dec.concat("0111");
            else if(num[i]=='8')
                dec=dec.concat("1000");
            else if(num[i]=='9')
                dec=dec.concat("1001");
            else if (num[i]=='A' || num[i]=='a')
                dec=dec.concat("1010");
            else if(num[i]=='B'|| num[i]=='b')
                dec=dec.concat("1011");
            else if(num[i]=='C'|| num[i]=='c')
                dec=dec.concat("1100");
            else if(num[i]=='D'|| num[i]=='d')
                dec=dec.concat("1101");
            else if(num[i]=='E'|| num[i]=='e')
                dec=dec.concat("1110");
            else if(num[i]=='F'|| num[i]=='f')
                dec=dec.concat("1111");
            i++;
        }
        int c=0;
        for (i = dec.length() - 1; i >= 0; i--) {
            j=Character.getNumericValue(dec.charAt(i));
            sum += j * (int) Math.pow(2, c);
            c++;
        }
        result.setText(Integer.toString(sum));
    }
    void h2o() {
        String s1="",s2="";
        String dec="";
        int i=0,decimal=0;
        char[] num=input.getText().toString().toCharArray();
        int t=num.length;
        int sum=0,j=0;
        while(i<t){
            if (num[i]=='0')
                dec=dec.concat("0000");
            else if(num[i]=='1')
                dec=dec.concat("0001");
            else if(num[i]=='2')
                dec=dec.concat("0010");
            else if(num[i]=='3')
                dec=dec.concat("0011");
            else if(num[i]=='4')
                dec=dec.concat("0100");
            else if(num[i]=='5')
                dec=dec.concat("0101");
            else if (num[i]=='6')
                dec=dec.concat("0110");
            else if(num[i]=='7')
                dec=dec.concat("0111");
            else if(num[i]=='8')
                dec=dec.concat("1000");
            else if(num[i]=='9')
                dec=dec.concat("1001");
            else if (num[i]=='A'|| num[i]=='a')
                dec=dec.concat("1010");
            else if(num[i]=='B'|| num[i]=='b')
                dec=dec.concat("1011");
            else if(num[i]=='C'|| num[i]=='c')
                dec=dec.concat("1100");
            else if(num[i]=='D'|| num[i]=='d')
                dec=dec.concat("1101");
            else if(num[i]=='E'|| num[i]=='e')
                dec=dec.concat("1110");
            else if(num[i]=='F'|| num[i]=='f')
                dec=dec.concat("1111");
            i++;
        }
        int c=0;
        for (i = dec.length() - 1; i >= 0; i--) {
            j=Character.getNumericValue(dec.charAt(i));
            sum += j * (int) Math.pow(2, c);
            c++;
        }
        while (sum != 0) {
            int a1=sum%8;
            s2=a1+s2;
            sum/=8;
        }
        result.setText(s2);

    }
    void b2d() {
        String bin=input.getText().toString();
        int i=0,j=0,sum=0,c=0;
        for (i = 0; i < bin.length(); i++) {
            j=Character.getNumericValue(bin.charAt(i));
            if (j != 1 && j != 0) {
                inputl.setError("Please give valid input");
                break;
            }
            else
                inputl.setError(null);
        }
        i=0;
        j=0;
        for (i = bin.length() - 1; i >= 0; i--) {
            j=Character.getNumericValue(bin.charAt(i));
            sum += j * (int) Math.pow(2, c);
            c++;
        }
        result.setText(Integer.toString(sum));
    }
    void b2o() {
        String bin=input.getText().toString();
        String s1="";
        int i=0,j=0,sum=0,c=0;
        for (i = 0; i < bin.length(); i++) {
            j=Character.getNumericValue(bin.charAt(i));
            if (j != 1 && j != 0) {
                inputl.setError("Please give valid input");
                break;
            }
            else
                inputl.setError(null);
        }
        i=0;
        j=0;
        for (i = bin.length() - 1; i >= 0; i--) {
            j=Character.getNumericValue(bin.charAt(i));
            sum += j * (int) Math.pow(2, c);
            c++;
        }
        while (sum != 0) {
            int a = sum%8;
            s1=a+s1;
            sum/=8;
        }
        result.setText(s1);
    }
    void b2h() {
        String bin=input.getText().toString();
        String Arr[]={"A","B","C","D","E","F"};
        String s1="";
        int i=0,j=0,sum=0,c=0;
        for (i = 0; i < bin.length(); i++) {
            j=Character.getNumericValue(bin.charAt(i));
            if (j != 1 && j != 0) {
                inputl.setError("Please give valid input");
                break;
            }
            else
                inputl.setError(null);
        }
        i=0;
        j=0;
        for (i = bin.length() - 1; i >= 0; i--) {
            j=Character.getNumericValue(bin.charAt(i));
            sum += j * (int) Math.pow(2, c);
            c++;
        }
        while (sum != 0) {
            int a = sum%16;
            if (a <= 9)
                s1=a+s1;
            else if (a >= 10 && a <= 15) {
                String x="";
                x=Arr[a-10];
                s1=x+s1;
            }
            sum/=16;
        }
        result.setText(s1);
    }

    void d2b()
    {
        String dec=input.getText().toString();
        int num=Integer.parseInt(dec);
        String s1="";
        while(num!=0) {
            int a=(num%2);
            s1=a+s1;
            num/=2;
        }
        result.setText(s1);
    }

    void d2h() {
        String dec=input.getText().toString();
        int num=Integer.parseInt(dec);
        String Arr[]={"A","B","C","D","E","F"};
        String s1="";
        while (num != 0) {
            int a = num%16;
            if (a <= 9)
                s1=a+s1;
            else if (a >= 10 && a <= 15) {
                String x="";
                x=Arr[a-10];
                s1=x+s1;
            }
            num/=16;
        }
        result.setText(s1);
    }

    void d2o() {
        String dec=input.getText().toString();
        int num=Integer.parseInt(dec);
        String s1="";
        while (num != 0) {
            int a = num%8;
            s1=a+s1;
            num/=8;
        }
        result.setText(s1);
    }
}