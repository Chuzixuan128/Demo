package com.example.lenovo.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBnt;
    /**
     * Hello World!
     */
    private TextView mIt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBnt = (Button) findViewById(R.id.bnt);
        mBnt.setOnClickListener(this);
        mIt = (TextView) findViewById(R.id.it);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bnt:
                initdata();
                break;
        }
    }

    private void initdata() {
            mIt.setText("阿萨德加");
    }
}
