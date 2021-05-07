package com.example.app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class second extends AppCompatActivity {
    private Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1=(Button) findViewById(R.id.button4);
        button2=(Button) findViewById(R.id.button6);
        button3=(Button) findViewById(R.id.button7);
        alert("Please select your district");


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                openActivity3();
                Toast.makeText(second.this,"Welcome To Raigad",Toast.LENGTH_LONG).show();
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
                Toast.makeText(second.this,"Welcome To Ratnagiri",Toast.LENGTH_LONG).show();}

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
                Toast.makeText(second.this,"Welcome To Sindudurga",Toast.LENGTH_LONG).show();}

        });
    }

    private void openActivity3() {
        Intent intent =new Intent(this, third.class);

        startActivity(intent);
    }
    private void openActivity4() {
        Intent intent1 =new Intent(this, forth.class);

        startActivity(intent1);
    }
    private void openActivity5() {
        Intent intent2=new Intent(this, fifth.class);

        startActivity(intent2);
    }
    private void alert(String message){
        AlertDialog dig=new AlertDialog.Builder(second.this)
                .setTitle("Message")
                .setCancelable(true)
                .setMessage(message)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .create();
        dig.show();
    }

}