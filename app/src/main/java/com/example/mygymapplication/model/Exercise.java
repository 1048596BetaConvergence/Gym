package com.example.mygymapplication.model;

public abstract class Exercise {
    private String name;
    private String imageURL;

    private String notes;

    public String getName() {
        return this.name;
    }

    public String getImageURL() {
        return this.imageURL;
    }
    public String getNotes() {
        return this.notes;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setNotes (String notes) {
        this.notes = notes;
    }
}
