package com.example.rtg.rtgnetworkv2;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class add_stuffs extends AppCompatActivity implements View.OnClickListener {

    private EditText name, number;
    private TextView tvadd, tvnum;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_stuffs);

        name = (EditText) findViewById(R.id.name);
        number = (EditText) findViewById(R.id.number);

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(this);

        tvadd = (TextView) findViewById(R.id.tvadd);
        tvnum = (TextView) findViewById(R.id.tvnum);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.submit:
                tvadd.setText(name.getText());
                tvnum.setText(number.getText());
                break;
        }
    }
}
