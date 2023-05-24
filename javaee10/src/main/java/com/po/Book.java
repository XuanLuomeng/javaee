package com.po;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:38
 */
public class Book {
    private int bno;
    String bname;
    String pub;
    float price;
    // 省略了Getter方法和Setter方法

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bno=" + bno +
                ", bname='" + bname + '\'' +
                ", pub='" + pub + '\'' +
                ", price=" + price +
                '}';
    }
}

