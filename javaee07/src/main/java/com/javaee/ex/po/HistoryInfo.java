package com.javaee.ex.po;

public class HistoryInfo {
    private int id;
    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "HistoryInfo{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
