package com.example.mytest04;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mytest04.activity.FragActivity;
import com.example.mytest04.activity.MyBroadcastActivity;
import com.example.mytest04.activity.MyServiceActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView tv_1,tv_2,tv_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_1.setOnClickListener(this);
        tv_2 = (TextView) findViewById(R.id.tv_2);
        tv_2.setOnClickListener(this);
        tv_3 = (TextView) findViewById(R.id.tv_3);
        tv_3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"你点击了"+item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"你点击了"+item.getTitle().toString(),Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_1:
                startActivity(new Intent(this, FragActivity.class));
                break;
            case R.id.tv_2:
                startActivity(new Intent(this, MyBroadcastActivity.class));
            break;
            case R.id.tv_3:
                startActivity(new Intent(this, MyServiceActivity.class));
            break;
            default:
                break;
        }
    }
}
