package edu.birzeit.taskone;

import java.util.ArrayList;

public class jym {
private String jymname;
private String place;
private int price;
ArrayList<String> nameofperson;




    public jym(String jymname, String place, int price) {
        this.jymname = jymname;
        this.place = place;
        this.price = price;
    }
    public void setNameofperson(String nameofperson) {
        this.nameofperson.add(nameofperson);
    }

    public String getJymname() {
        return jymname;
    }

    public void setJymname(String jymname) {
        this.jymname = jymname;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.jymname;

    }

    public String toString2() {
       return  "jym{" +
                "jymname='" + jymname + '\'' +
                ", place='" + place + '\'' +
                ", price=" + price +
                ", nameofperson=" + nameofperson +
                '}';
    }


}
