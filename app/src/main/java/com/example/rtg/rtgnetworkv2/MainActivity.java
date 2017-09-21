package com.example.rtg.rtgnetworkv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tap, add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tap = (Button) findViewById(R.id.tap);
        tap.setOnClickListener(this);

        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tap:
                startActivity(new Intent(this, website.class));
                break;
            case R.id.add:
                startActivity(new Intent(this, add_stuffs.class));
                break;
        }
    }
}
