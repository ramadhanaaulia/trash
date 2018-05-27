package com.example.user.trash.Holder;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user.trash.R;

public class HolderHistory extends RecyclerView.ViewHolder {

    public CardView cardview_history;
    public TextView txtNamaSampah, txtJumlahSampah, txtHour, txtDate;

    public HolderHistory(View itemView) {
        super(itemView);
        cardview_history = (CardView) itemView.findViewById(R.id.cardview_history);
        txtNamaSampah = (TextView) itemView.findViewById(R.id.txtNamaSampah);
        txtJumlahSampah = (TextView) itemView.findViewById(R.id.txtJumlahSampah);
        txtHour = (TextView) itemView.findViewById(R.id.txtHour);
        txtDate = (TextView) itemView.findViewById(R.id.txtDate);
    }
}
