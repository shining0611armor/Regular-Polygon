package com.shiningarmor.regularpolygon;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class Calculationclass {

    private Activity activity;
    private int n;
    public Calculationclass(Activity activity, int n){

        this.activity=activity;
        this.n=n;


    }
    public int betavane2(){
        n=n*n;
       return n;

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }




}





