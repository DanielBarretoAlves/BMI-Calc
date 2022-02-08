package com.example.bmicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ageVal;
    private int ageNumber;
    //TODO:Mudar o card de peso e trocar os botões por linha digitavel ou até uma tela propria para isso

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ageNumber = 0;
        ageVal = findViewById(R.id.ageVal);
        ageVal.setText(""+ageNumber);

    }

    public void test(View view)
    {
        ageNumber++;
        ageVal.setText(""+ageNumber);
    }

    public void setValues(View view)
    {
    double startValue = 0.0;
        ageVal.setText("0");
    }

}