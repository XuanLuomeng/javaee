package com.javaee.po;

public class Idcard {
    private int id;
    private String cardNo;
    private String cardName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "Idcard{" +
                "id=" + id +
                ", cardNo='" + cardNo + '\'' +
                ", cardName='" + cardName + '\'' +
                '}';
    }
}
