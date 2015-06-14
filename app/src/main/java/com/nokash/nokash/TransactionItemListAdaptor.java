package com.nokash.nokash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by MohammadHossein on 14/6/2015.
 */
public class TransactionItemListAdaptor extends ArrayAdapter<TransactionItemClass> {

    private final Context context;
    private final ArrayList<TransactionItemClass> values;

    public TransactionItemListAdaptor(Context context, int resource, ArrayList<TransactionItemClass> objects) {
        super(context, resource, objects);
        this.context = context;
        this.values = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.transaction_item_template, parent, false);

        ImageView imageView= (ImageView) rowView.findViewById(R.id.transaction_image);
        TextView name_TextView=(TextView) rowView.findViewById(R.id.transaction_name);
        TextView status_TextView=(TextView) rowView.findViewById(R.id.transaction_status);
        TextView amount_TextView=(TextView) rowView.findViewById(R.id.transaction_amount);

        TransactionItemClass item=values.get(position);
        if (item.Status==1){
            status_TextView.setText("Sent");
            imageView.setImageResource(R.drawable.green_transaction);
        }else{
            status_TextView.setText("Pending");
            imageView.setImageResource(R.drawable.orange_transaction);
        }

        name_TextView.setText(item.Name);
        amount_TextView.setText(""+item.Amount);

        return rowView;


    }
}
