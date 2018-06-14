package com.example.mytest04.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mytest04.R;
import com.example.mytest04.fragment.RightFragment;

public class FragActivity extends AppCompatActivity {
    private TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
        tv1 = (TextView) findViewById(R.id.left);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.leftFragment,new RightFragment()).commit();
            }
        });
        tv2 = (TextView) findViewById(R.id.right);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("dch");
            }
        });
    }
}
