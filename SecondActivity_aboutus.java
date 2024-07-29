package com.shiningarmor.regularpolygon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SecondActivity_aboutus extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__aboutus);
        EditText et_n=(EditText) findViewById(R.id.please_enter_an_arbitrary_n);
        TextView tv_squarenumber=(TextView) findViewById(R.id.n_betavane2);
            int number =3;

            Calculationclass calculationclass = new Calculationclass(this, number);
            number = calculationclass.betavane2();
            tv_squarenumber.setText(number);

        }


    
}
