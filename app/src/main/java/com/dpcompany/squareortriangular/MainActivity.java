package com.dpcompany.squareortriangular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{
        int number;

        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);
            if(squareRoot == Math.floor(squareRoot)) {
                return true;
            }
            else {
                return false;
            }
            }

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber = triangularNumber + x;
            }
            if(triangularNumber == number){
                return true;
            }
            else{
                return false;
            }
        }
        }

    public void testNumber(View view){
        EditText usersNumber = (EditText)findViewById(R.id.usersNumber);
        String message;
        if(usersNumber.getText().toString().isEmpty()){
            message = "Please enter the number";
        }
        else {
            Number myNumber = new Number();
            myNumber.number = (Integer.parseInt(usersNumber.getText().toString()));
            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    message = "The number is both triangular and square";
                } else {
                    message = "The number is a square number";
                }
            } else {
                if (myNumber.isTriangular()) {
                    message = "The number is a triangular number";
                } else {
                    message = "The number is not triangular as well as square";
                }
            }

            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            System.out.println(myNumber.isSquare());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
