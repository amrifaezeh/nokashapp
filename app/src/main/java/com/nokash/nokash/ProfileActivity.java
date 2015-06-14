package com.nokash.nokash;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;


public class ProfileActivity extends ActionBarActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.4F);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        ImageButton imageButton=(ImageButton) findViewById(R.id.payRequsetBtn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent = new Intent(getApplicationContext(), PayActivity.class);
                startActivity(intent);
            }
        });

        ImageButton contactButton=(ImageButton) findViewById(R.id.profile_contacts);
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent = new Intent(getApplicationContext(), ContactsActivity.class);
                startActivity(intent);
            }
        });

        ImageButton topUp=(ImageButton) findViewById(R.id.top_up_imageBtn);
        topUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent=new Intent(getApplicationContext(), TopUpActivity.class);
                startActivity(intent);
            }
        });

        ImageButton cashOut=(ImageButton) findViewById(R.id.cash_out_imagebtn);
        cashOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent=new Intent(getApplicationContext(), CashOutActivity.class);
                startActivity(intent);
            }
        });


        ImageButton transaction=(ImageButton) findViewById(R.id.profile_transaction);
        transaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent=new Intent(getApplicationContext(), TransactionActivity.class);
                startActivity(intent);
            }
        });

        ImageButton profile_notification=(ImageButton) findViewById(R.id.profile_notification_icon);
        profile_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent=new Intent(getApplicationContext(), TransactionActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_summary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
