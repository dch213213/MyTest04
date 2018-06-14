package com.example.mytest04.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mytest04.R;

public class MyBroadcastActivity extends AppCompatActivity {

    private IntentFilter mIntentFilter;
    private MyBroadCast mBroadCast;

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_broadcast);
        mIntentFilter = new IntentFilter();
        mIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        mBroadCast = new MyBroadCast();
        registerReceiver(mBroadCast,mIntentFilter);
        Log.d("2222","2222");
        sendBroadcastReceiver();
    }

    protected void sendBroadcastReceiver(){
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendBroadcast(new Intent("com.DCH"));
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mBroadCast);
    }

    class MyBroadCast extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context,"aaaaaa",Toast.LENGTH_SHORT).show();
            Log.d("2222","3333");
        }
    }
}
