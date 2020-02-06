package com.cofc.buttoncounter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // variable in appCountNum
    public int appCountNum = 0;
    public int progressInt = 0;
    public int percentUser = 100;
    public int DEFAULT_MAX = 100;

    Button btnAdd, btnSub, btnReset;
    TextView txtvDispCount;
    EditText userCapNum;
    ProgressBar userProgMax;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btnIncrease);
        btnSub = (Button) findViewById(R.id.btnDecrease);
        btnReset = (Button) findViewById(R.id.btnReset);

        txtvDispCount = (TextView) findViewById(R.id.txtCount);


        userProgMax = (ProgressBar) findViewById(R.id.determinateBar);
// integer.valueof()


        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                appCountNum++;
                userProgMax.setProgress(appCountNum);
                txtvDispCount.setText(Integer.toString(appCountNum));

                progressInt = progressInt + percentUser;



            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                appCountNum--;
                txtvDispCount.setText(Integer.toString(appCountNum));



            }
        });

        userCapNum.(new View.OnClickListener() {
            public void (View view) {
                appCountNum = 0;
                txtvDispCount.setText(Integer.toString(appCountNum));

            }
        });

        // set num given by user to be max for progress bar
        //if counter is above full progress bar stays full
        // change int A to be equal to the counter, set the progress status to A
        // or int version o
        // change a second int B is to take user input for max capacity for the pprogress bar



        //track increase and decreases every miunte (or hour ) from start to reset
        // when + is increased, start timer, when + is increased, save 1

        userCapNum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                appCountNum++;
                txtvDispCount.setText(Integer.toString(appCountNum));

            }
        });


    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        String value = txtvDispCount.getText().toString();
        outState.putString("key", value);
    }
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String value = savedInstanceState.getString("key");

        txtvDispCount.setText(value);
    }

}
