package com.example.codinggridexample;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.codinggridexample.shortestpath.MinCostPath;


public class ShortestPathActivity extends AppCompatActivity {


    GridLayout matrixInput = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shortest_path);

        matrixInput = (GridLayout) findViewById(R.id.matrixInput);
        final int size = 10;
        designMatrix(size);


        final Button btnSubmit = (Button) findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MinCostPath matrixClass = new MinCostPath();
                int[][] userMatrix = null;

                for(int i = 0; i < matrixInput.getChildCount(); i++){
                    EditText editText = (EditText) matrixInput.getChildAt(i);

                }
                for(int r = 0; r < size; r++){
                    for(int c = 0; c < size; c++) {


                    }
                }
            }
        });

    }

    public void designMatrix(int size) {

        for(int r = 0; r < size; r++){
            for(int c = 0; c < size; c++) {
                EditText editText = new EditText(this);
                editText.setId(Integer.parseInt(r + "" + c));
                GridLayout.LayoutParams param = new GridLayout.LayoutParams();
                param.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                param.width = GridLayout.LayoutParams.WRAP_CONTENT;
                param.rowSpec = GridLayout.spec(r);
                param.columnSpec = GridLayout.spec(c);
                editText.setLayoutParams(param);


                matrixInput.addView(editText);
            }

        }

    }


}
