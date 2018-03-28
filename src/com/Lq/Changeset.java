package com.Lq;

public class Changeset {
    int startValue;
    String author;
    String moduleName;
    int changesetNumber;

    Changeset(int startValue, String author, String moduleName){
        this.startValue = startValue;
        this.author = author;
        this.moduleName = moduleName;
    }
}
