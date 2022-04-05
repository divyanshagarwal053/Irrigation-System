package com.example.techirrigator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class dataBase extends AppCompatActivity {

    EditText input1, input2, input3, input4;
    TextView message1, message2, message3, message4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);

        input1 = (EditText) findViewById(R.id.input1);
        input2= (EditText) findViewById(R.id.input2);
        input3 = (EditText) findViewById(R.id.input3);
        input4 = (EditText) findViewById(R.id.input4);

        message1 = (TextView) findViewById(R.id.message1);
        message2 = (TextView) findViewById(R.id.message2);
        message3 = (TextView) findViewById(R.id.message3);
        message4 = (TextView) findViewById(R.id.message4);

    }

    public void guessClicked(View v) {

        double ph=Double.parseDouble(input1.getText().toString());
        double calcium=Double.parseDouble(input2.getText().toString());
        double magnesium=Double.parseDouble(input3.getText().toString());
        double sulphur=Double.parseDouble(input4.getText().toString());


        if(ph>=6.0 && ph<=7.0)
        {message1.setText("The PH of soil is suitable for growing crops\n");
        }
        else if(ph<6.0)
        {
            message1.setText("The PH of soil is low\n ");
        }
        else if(ph>7.0)
        {
            message1.setText("The PH of soil is high\n");
        }
        if(calcium>=26.0 && calcium<=27.0)
        {
            message2.setText("The calcium content of soil is suitable for growing crops\n");
        }
        else if(calcium<26.0)
        {
            message2.setText("The calcium content of soil is low\n ");
        }
        else if(calcium>27.0)
        {
            message2.setText("The calcium content of soil is high\n ");
        }
        if( magnesium>=2.0 && magnesium<=3.0)
        {
            message3.setText("The magnesium content of soil is suitable for growing crops\n");
        }
        else if(magnesium<2.0 )
        {
            message3.setText("The magnesium content of soil is low\n ");
        }
        else if(magnesium>3.0 )
        {
            message3.setText("The magnesium content of soil is high\n ");
        }
        if(sulphur>=8.0 && sulphur<=9.0)
        {
            message4.setText("The sulphur content of soil is suitable for growing crops\n");
        }
        else if(sulphur<8.0 )
        {
            message4.setText("The sulphur content of soil is low\n ");
        }
        else if(sulphur>9.0 )
        {
            message4.setText("The sulphur content of soil is high\n ");
        }
    }
}