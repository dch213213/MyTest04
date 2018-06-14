package com.example.mytest04.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.mytest04.R;

public class MyServiceActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mSendMessage,mStartService,mStopService,mBindService,mUnbindService;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 0x11:
                    mSendMessage.setText("send");
                    break;
                default:
                    break;

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_service);
        mSendMessage = (Button) findViewById(R.id.sendMessage);
        mStartService = (Button) findViewById(R.id.startService);
        mStopService = (Button) findViewById(R.id.stopService);
        mBindService = (Button) findViewById(R.id.bindService);
        mUnbindService = (Button) findViewById(R.id.unbindService);
        mSendMessage.setOnClickListener(this);
        mStartService.setOnClickListener(this);
        mStopService.setOnClickListener(this);
        mBindService.setOnClickListener(this);
        mUnbindService.setOnClickListener(this);
        Log.i("MyServiceActivity","dch");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.sendMessage:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        Message message =Message.obtain();
                        message.what = 0x11;
                        handler.sendMessage(message);
                    }
                }).start();
                break;
            case R.id.startService:
                break;
            case R.id.stopService:
                break;
            case R.id.bindService:
                break;
            case R.id.unbindService:
                break;
            default:
                break;
        }


    }
}
