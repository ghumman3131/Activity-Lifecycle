package com.inception.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(MainActivity.this , "i am in on start" , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this , "i am in on create" , Toast.LENGTH_SHORT).show();

    }




    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(MainActivity.this , "i am in on resume" , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(MainActivity.this , "i am in on pause" , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(MainActivity.this , "i am in on stop" , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(MainActivity.this , "i am in on destroy" , Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(MainActivity.this , "i am in on restart" , Toast.LENGTH_SHORT).show();

    }


}
