package com.Lq;

public class Column {
    String name;
    String type;
    int maxSize;
    int isNullable;

    Column(String name, String type, int maxSize, int isNullable){
        this.name = name;
        this.type = type;
        this.maxSize = maxSize;
        this.isNullable = isNullable;
    }

    Column(String name, String type, int isNullable){
        this.name = name;
        this.type = type;
        this.isNullable = isNullable;
    }
}
