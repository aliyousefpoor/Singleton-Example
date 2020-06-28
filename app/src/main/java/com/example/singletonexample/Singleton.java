package com.example.singletonexample;

import android.content.Context;
import android.widget.Toast;

public class Singleton {
    private static Singleton instance = new Singleton();
    int count= 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showToast(Context context) {
        Toast.makeText(context, "First Toast Method Called ", Toast.LENGTH_LONG).show();
    }

    public void showSecondToast(Context context) {
        Toast.makeText(context, " Second Toast Method Called ", Toast.LENGTH_LONG).show();
    }

    public void showThirdToast(Context context) {
        Toast.makeText(context, "Third Toast Method Called", Toast.LENGTH_LONG).show();
    }

    public void counter(Context context){

        count= count+4;
        Toast.makeText(context,"Count :" +count,Toast.LENGTH_LONG).show();
    }

}
