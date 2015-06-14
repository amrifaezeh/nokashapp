package com.nokash.nokash;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ListView;

import java.util.ArrayList;


public class TransactionActivity extends ActionBarActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.4F);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);

        final ListView listview = (ListView) findViewById(R.id.list);
        String[] _status={"Sent", "Pending"};
        String[] _picture={"1","2"};
        String[] names={"Rikia", "jon","Kelvin", "Hossein", "Arif", "Irshad","Rikia", "jon","Kelvin", "Hossein", "Arif", "Irshad"};
        int[]   status={1, 2, 2, 1, 1,1,1, 2, 2, 1, 1,1};
        float[] amount={27.00f, 50.00f, 70.00f, 130.00f, 5.50f , 8.30f,27.00f, 50.00f, 70.00f, 130.00f, 5.50f , 8.30f };

        ArrayList<TransactionItemClass> transactionArrayList=new ArrayList<TransactionItemClass>();

        for (int i=0; i<names.length; i++){
            TransactionItemClass tra=new TransactionItemClass();
            tra.Name=names[i];
            tra.Status=status[i];
            tra.Amount=amount[i];
            transactionArrayList.add(tra);
        }

        final TransactionItemListAdaptor adapter = new TransactionItemListAdaptor(this,
                R.layout.transaction_item_template, transactionArrayList);
        listview.setAdapter(adapter);

    }

    public void goBack(View v){
        v.startAnimation(buttonClick);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_transaction, menu);
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
