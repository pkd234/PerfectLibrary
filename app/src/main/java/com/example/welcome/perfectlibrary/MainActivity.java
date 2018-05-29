package com.example.welcome.perfectlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.perfectlib.ToastGenerator;


public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // ToastGenerator.errorToast(getApplicationContext(),"Some error has occured");
                ToastGenerator.infoToast(getApplicationContext(),"Yipee task is completed");

            }
        });


    }
}
