package com.opm.pushchatboot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView pushMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pushMensaje = (TextView) findViewById(R.id.pushMensaje);

        if(getIntent().getExtras() != null){
            for (String key : getIntent().getExtras().keySet()) {
                String value = getIntent().getExtras().getString(key);
                Log.i("MSJ", key + " : " + value );
                pushMensaje.append(key + " : " + value + "\n"  );
            }
        }
    }
}
