package myapp;

import myapp.presentation.MainUI;

/**
 * Created by bruno.devesa on 04-07-2015.
 */
public class MyAppManager {

    private MyAppManager(){
        // to make sure this is a utility class
    }

    public static void main(String[] args) {
        MainUI mainUI = new MainUI();
        mainUI.run();
    }
}
