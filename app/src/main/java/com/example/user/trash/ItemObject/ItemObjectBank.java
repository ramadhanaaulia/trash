package com.example.user.trash.ItemObject;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Isfahani on 10-Agu-16.
 */
public class ItemObjectBank {
    @SerializedName("trash")
    public List<Children> trash;

    public class Children {
        @SerializedName("nama_bank")
        public String nama_bank;

        @SerializedName("lokasi")
        public String lokasi;

        @SerializedName("lokasi_gps")
        public String lokasi_gps;

        @SerializedName("deskripsi")
        public String deskripsi;

        @SerializedName("foto")
        public String foto;
    }
}
