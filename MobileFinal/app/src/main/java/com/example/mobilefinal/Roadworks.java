package com.example.mobilefinal;
//Name: Ross McGregor Matric Number: S1510552
public class Roadworks {
    private String title;
    private String description;

    public Roadworks() {
        title = "";
        description = "";
    }

    public Roadworks(String atitle, String adescription) {
        title = atitle;
        description = adescription;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String atitle) {
        title = atitle;
    }

    public void setDescription(String adescription) {
        description = adescription;
    }

    public String toString() {
        String temp;
        temp = title + " " + description;
        return temp;
    }
}