package com.company;

/**
 * Created by 150101002 on 6/3/2017.
 */
public class Singleton {
    private  static  Singleton singleton = new Singleton();
    private  Singleton(){

    }

    public static Singleton getSingleton() {
        return singleton;
    }

    private int x;

    public void setX (int x){
        this.x = x;
    }
    public int getX (){
        return x;
}
public void add(int val){
        x +=val;
}
}