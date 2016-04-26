package com.example.administrator.broadcastreceiveeeer;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class EvilActivity extends AppCompatActivity {

    EvilReceiver bob; //I called the instance of the receiver bob so its like a person receiving it
    //an evil person. who is named bob now

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        IntentFilter filter = new IntentFilter("MirEvilShopping"); //the text here has to match the text i sent with the intent
        //otherwise other things might be looking for it

        bob = new EvilReceiver(); //actually have to make it an evil receiver.
        registerReceiver(bob, filter);

    }

}
