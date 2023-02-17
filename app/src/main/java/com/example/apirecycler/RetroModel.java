package com.example.apirecycler;

public class RetroModel {
    private String title;
    private String body;  //this name must be same as the name that you want to

    public RetroModel(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
    // extract from free api - json file. here i am only extracting two.
}
