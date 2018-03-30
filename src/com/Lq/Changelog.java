package com.Lq;
import java.io.File;
import java.io.IOException;

public class Changelog {
    public int value;

    Changelog(int value){
        this.value = value;
        OpenFile(value);
    }
    public static void OpenFile(int value) {
        String pathName = "D:\\src\\changelog\\changelog-release-1-file-" + value + ".xml" ;
        System.out.println(pathName);
    }

}
