package com.example.user.trash.Login;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemObjectLogin {
    @SerializedName("trash")
    public List<Children> trash;

    public class Children{
        @SerializedName("username")
        public String username;

        @SerializedName("password")
        public String password;

        @SerializedName("saldo")
        public String saldo;

        @SerializedName("fullname")
        public String fullname;

        @SerializedName("phonenumber")
        public String phonenumber;

        @SerializedName("email")
        public String email;
    }
}
