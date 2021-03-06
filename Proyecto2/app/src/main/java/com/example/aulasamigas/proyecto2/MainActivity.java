package com.example.aulasamigas.proyecto2;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radioGrupo);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.radioButton){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 1",Toast.LENGTH_SHORT);
                }else if(checkedId == R.id.radioButton2){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 2",Toast.LENGTH_SHORT);
                }else if(checkedId == R.id.radioButton3){
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 3",Toast.LENGTH_SHORT);
                }else{
                    Toast.makeText(getApplicationContext(),"usted oprimio el boton 4",Toast.LENGTH_SHORT);
                }
            }
        });

    }
    @Override
    public void onClick(View v){
        super.onBackPressed();
    }
}
