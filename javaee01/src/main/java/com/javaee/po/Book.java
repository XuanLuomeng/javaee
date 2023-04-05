package com.javaee.po;

public class Book {
    private int id;
    private String bname;
    private double price;
    private String pub;

    public Book(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", pub='" + pub + '\'' +
                '}';
    }
}
