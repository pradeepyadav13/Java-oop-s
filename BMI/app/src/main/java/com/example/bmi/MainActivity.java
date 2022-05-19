package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcutate;
        LinearLayout mainlayout;
        TextView txtresult;
        EditText edtweight,edtheight,edtinch;

        calcutate=findViewById(R.id.calculate);
        txtresult=findViewById(R.id.txtresult);
        edtweight=findViewById(R.id.edtweight);
        edtheight=findViewById(R.id.edtheight);
        edtinch=findViewById(R.id.edtinch);
        mainlayout=findViewById(R.id.mainlayout);


        calcutate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int weight=Integer.parseInt(edtweight.getText().toString());
                int heightF=Integer.parseInt(edtheight.getText().toString());
                int heightI=Integer.parseInt(edtinch.getText().toString());

                int totalIn =heightF*12 + heightI;
                double totalCm=totalIn*2.53;
                double totalIm=totalCm/100;
                double bmi = weight/(totalIm*totalIm);
                if (bmi>25){
                    txtresult.setText("You're Overweigh");
                    mainlayout.setBackgroundColor(getResources().getColor(R.color.colorOW));
                }
                else if (bmi<18){
                    txtresult.setText("you're underweight");
                    mainlayout.setBackgroundColor(getResources().getColor(R.color.colorUW));

                }
                else {
                    txtresult.setText("You're Healthy");
                    mainlayout.setBackgroundColor(getResources().getColor(R.color.colorHL));
                }
            }
        });
    }
}