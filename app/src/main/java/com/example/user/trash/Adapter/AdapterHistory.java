package com.example.user.trash.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import com.example.user.trash.Holder.HolderHistory;
import com.example.user.trash.ItemObject.ItemObjectHistoryOffline;
import com.example.user.trash.R;

public class AdapterHistory extends RecyclerView.Adapter<HolderHistory> {

    List<ItemObjectHistoryOffline> itemObjectHistoryOfflineList;
    Context context;

    public AdapterHistory (Context context, List<ItemObjectHistoryOffline> itemObjectHistoryOfflineList) {
        this.context = context;
        this.itemObjectHistoryOfflineList = itemObjectHistoryOfflineList;
    }

    @Override
    public HolderHistory onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item_history, null);
        return new HolderHistory(view);
    }

    @Override
    public void onBindViewHolder(HolderHistory holder, int position) {
        holder.txtNamaSampah.setText(itemObjectHistoryOfflineList.get(position).nama);
        holder.txtJumlahSampah.setText(itemObjectHistoryOfflineList.get(position).jumlah);
        holder.txtHour.setText(itemObjectHistoryOfflineList.get(position).jam);
        holder.txtDate.setText(itemObjectHistoryOfflineList.get(position).tanggal);

    }

    @Override
    public int getItemCount() {
        return itemObjectHistoryOfflineList.size();
    }
}
