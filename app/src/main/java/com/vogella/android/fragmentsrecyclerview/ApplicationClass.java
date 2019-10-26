package com.vogella.android.fragmentsrecyclerview;

import android.app.Application;

import java.util.ArrayList;

// Application class is a class that will run right at the beginning
// even before your main activity starts, When everything ends, the application
// class is also the last thing to be destroyed
public class ApplicationClass extends Application {

    public static ArrayList<Person> people;

    @Override
    public void onCreate() {
        super.onCreate();

        people = new ArrayList<>();
        people.add(new Person("Chuck Norris", "9565824478"));
        people.add(new Person("Jane Mills", "9244788756"));
        people.add(new Person("Yilda Jones", "9752247965"));
        people.add(new Person("Irving Jackson", "5871145963"));
        people.add(new Person("Jake Smith", "7512248967"));


    }
}
