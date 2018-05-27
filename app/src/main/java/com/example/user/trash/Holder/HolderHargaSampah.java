package com.example.user.trash.Holder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.trash.R;

public class HolderHargaSampah extends RecyclerView.ViewHolder {

    public TextView txtNamaSampah, txtHargaSampah;
    public CardView cardview_hargaSampah;

    public HolderHargaSampah(View itemView) {
        super(itemView);
        txtNamaSampah = (TextView) itemView.findViewById(R.id.txtNamaSampah);
        txtHargaSampah = (TextView) itemView.findViewById(R.id.txtHargaSampah);
        cardview_hargaSampah = (CardView) itemView.findViewById(R.id.cardview_hargaSampah);
    }
}
