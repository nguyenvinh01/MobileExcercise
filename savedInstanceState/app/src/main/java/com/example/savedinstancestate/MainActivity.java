package com.example.savedinstancestate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    EditText etFirstNumber,etSecondNumber;
    TextView tvResult;
    Button sum;
    int firstNumber;
    int SecondNumber;
    int Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);
        etFirstNumber = findViewById(R.id.etFirstNumber);
        etSecondNumber = findViewById(R.id.etSecondNumber);
        tvResult = findViewById(R.id.tvResult);
        sum = findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == sum){
                    if (etFirstNumber.getText().toString().isEmpty() ||
                            etSecondNumber.getText().toString().isEmpty()){
                        Toast.makeText(getBaseContext(),"moi ban nhap so",Toast.LENGTH_LONG).show();
                    }else {
                        firstNumber =
                                Integer.parseInt(etFirstNumber.getText().toString());
                        SecondNumber =
                                Integer.parseInt(etSecondNumber.getText().toString());
                        Result = firstNumber + SecondNumber;
                        tvResult.setText(String.valueOf(Result));
                    }
                }
            }
        });
        if (savedInstanceState != null) {
            etFirstNumber.setText(String.valueOf(savedInstanceState.getInt("firstNumber")));
            etSecondNumber.setText(String.valueOf(savedInstanceState.getInt("SecondNumber")));
            tvResult.setText(String.valueOf(savedInstanceState.getInt("Result")));
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (!tvResult.getText().toString().isEmpty()) {
            outState.putInt("firstNumber",
                    Integer.parseInt(etFirstNumber.getText().toString()));
            outState.putInt("SecondNumber",
                    Integer.parseInt(etSecondNumber.getText().toString()));outState.putInt("Result",
                    Integer.parseInt(tvResult.getText().toString()));
        }
        super.onSaveInstanceState(outState);
    }
}
