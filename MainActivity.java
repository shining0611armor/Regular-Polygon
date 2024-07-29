package com.shiningarmor.regularpolygon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float f_angle_san  ;
    float f_cos_hasel ;
    float f_radius_for_n_even ;
    float f_given_diameter_even_n = 0;




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button bt_calculate =findViewById(R.id.b_MainActivity_calculate);
        ImageView iv_asli = findViewById(R.id.iv_MainActivity_asli);
        final EditText et_diameter = findViewById(R.id.et_MainActivity_diameter_even);
        final EditText et_numberpoly = findViewById(R.id.et_MainActivity_numberpoly);
        final TextView tv_sidesize = findViewById(R.id.tv_MainActivity_polygon_sidesize);
        final TextView tv_angledeger = findViewById(R.id.tv_MainActivity_polygon_name);
        final ImageView iv_MainActivity_tasvir = findViewById(R.id.iv_MainActivity_asli);

        final float final_given_diameter_even_n = f_given_diameter_even_n;
        bt_calculate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {



               String string_diameter_even=et_diameter.getText().toString();
               String string_number_varedshode=et_numberpoly.getText().toString();
               if(string_number_varedshode.equals("")){
                   Toast.makeText(MainActivity.this, "Please enter the number of sides", Toast.LENGTH_SHORT).show();}
               if(string_diameter_even.equals("")){
                   Toast.makeText(MainActivity.this, "Please enter the diameter", Toast.LENGTH_SHORT).show();}
               if(!string_number_varedshode.equals("")&& !string_diameter_even.equals("")){
               float f_diameter = Float.parseFloat(string_diameter_even);
               int i_number_varedshode = Integer.parseInt(string_number_varedshode);

               if ((i_number_varedshode <= 100 | i_number_varedshode >= 3 )) {

//startin calculation for even

                       f_angle_san = (float) (360.000 / i_number_varedshode);
                       tv_angledeger.setText(f_angle_san + "");
                       f_angle_san = (float) (Math.PI * f_angle_san / 180);
                       f_cos_hasel = (float) Math.cos(f_angle_san);
//diameter
                       f_radius_for_n_even = f_diameter / 2;
                       f_radius_for_n_even = f_radius_for_n_even * f_radius_for_n_even;
                       f_cos_hasel = 2 * f_radius_for_n_even * f_cos_hasel;
                       f_radius_for_n_even = 2 * f_radius_for_n_even;
                       f_radius_for_n_even = f_radius_for_n_even - f_cos_hasel;
                       f_radius_for_n_even = (float) Math.sqrt(f_radius_for_n_even);
                       tv_sidesize.setText(f_radius_for_n_even + "");
//ending calculation for even
                       switch (i_number_varedshode) {
                           case 5:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon5);
                               break;
                           case 7:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon7);
                               break;
                           case 9:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon9);
                               break;
                           case 11:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon11);
                               break;
                           case 13:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon13);
                               break;
                           case 15:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon15);
                               break;
                           case 17:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon17);
                               break;
                           case 19:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon19);
                               break;
                           case 4:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon4);
                               break;
                           case 6:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon6);
                               break;
                           case 8:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon8);
                               break;
                           case 10:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon10);
                               break;
                           case 12:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon12);
                               break;
                           case 14:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon14);
                               break;
                           case 16:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon16);
                               break;
                           case 18:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon18);
                               break;
                           case 20:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.ploygon20);
                               break;
                           default:
                               iv_MainActivity_tasvir.setImageResource(R.drawable.asli);
                               break;
                       }

                       //the cosine low is writed



               }
                   else {
                       Toast.makeText(MainActivity.this, "please enter the correct value", Toast.LENGTH_SHORT).show();}

           }}


       });









    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.menu1_AllActivities_help){

        }
        if (item.getItemId()==R.id.menu1_AllActivities_supportus){


        }
        if(item.getItemId()==R.id.menu1_MainActivities_info){
            Intent intent1 = new Intent(MainActivity.this, SecondActivity_aboutus.class);
            startActivity(intent1);

        }

        return super.onOptionsItemSelected(item);
    }




}
