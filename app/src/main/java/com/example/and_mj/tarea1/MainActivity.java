package com.example.and_mj.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG_ACTIVITY = "MainActivity";

    private static final int REQUEST_OTHER_ACTIVITY = 1;

    Button btOpenActivity;
    TextView txtResponse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOpenActivity = findViewById(R.id.btOpenActivity);
        txtResponse = findViewById(R.id.txtResponse);

        btOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OtherActivity.class );
                startActivityForResult(intent, REQUEST_OTHER_ACTIVITY);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_OTHER_ACTIVITY && resultCode == RESULT_OK ){
            Bundle extras = data.getExtras();
            txtResponse.setText(extras.get("dato").toString());
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG_ACTIVITY, "Enter onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG_ACTIVITY, "Enter onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG_ACTIVITY, "Enter onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_ACTIVITY, "Enter onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG_ACTIVITY, "Enter onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG_ACTIVITY, "Enter onDestroy");
    }

}
