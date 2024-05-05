package com.android.myscraper.domain.dtos;

public class Wallet {

    private String address;

    public Wallet(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "address='" + address + '\'' +
                '}';
    }
}
