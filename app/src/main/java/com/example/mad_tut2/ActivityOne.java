package com.example.mad_tut2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        textView = findViewById(R.id.textView3);
        textView.setText(R.string.msg2);

        Log.i("Lifecycle","onCreate() invoked");
    }

    public void onStart(){
        super.onStart();
        Log.i("Lifecycle","onStart() invoked");
    }

    public void onRestart(){
        super.onRestart();
        Log.i("Lifecycle", "onRestart() invoked");
    }

    public void onPause(){
        super.onPause();
        Log.i("Lifecycle","onPause() invoked");
    }

    public void onStop(){
        super.onStop();
        Log.i("Lifecycle","onStop() invoked");
    }

    public void onResume(){
        super.onResume();
        Log.i("Lifecycle", "onResume() invoked");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.i("Lifecycle" , "onDestroy() invoked");
    }
}