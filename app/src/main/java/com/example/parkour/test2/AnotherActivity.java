package com.example.parkour.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        final TextView textView = (TextView)findViewById(R.id.text3);
        final Intent intent = getIntent();
        TextView t3 = (TextView) findViewById(R.id.text3);
        String name = intent.getStringExtra("name");
        t3.setText(name);

        final EditText editText = (EditText)findViewById(R.id.editText);

        Button button2=(Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("result",editText.getText().toString());
                setResult(0,intent);
                finish();
            }
        });

    }



}
