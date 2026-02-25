package com.finance.financespringmodulith.reports.domain;


public class Report {

    private String title;
    private Object data;

    public Report(String title, Object data) {
        this.title = title;
        this.data = data;
    }

    // Getters e Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

