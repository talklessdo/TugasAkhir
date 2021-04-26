package com.example.tugasakhir.Response;

public class LoginResponse {
    Data data;
    String kode;

    public LoginResponse(Data data, String kode) {
        this.data = data;
        this.kode = kode;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}
