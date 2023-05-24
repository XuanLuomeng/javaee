package com.po;

/**
 * @author LuoXuanwei
 * @date 2023/5/25 0:44
 */
public class IDCard {
    private String id;
    private String card;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id='" + id + '\'' +
                ", card='" + card + '\'' +
                '}';
    }
}
