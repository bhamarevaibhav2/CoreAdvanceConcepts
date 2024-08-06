package com.mgshome.designPatterns.Factory;

//factory design pattern
public class DeveloperFactory {

    public static Developers getDevelopers(String developerName) {

        if(developerName.trim().equalsIgnoreCase("Android Developer"))
            return new AndroidDeveloper();
        else if(developerName.trim().equalsIgnoreCase("Web Developer"))
            return new WebDeveloper();
        else
            return null;
    }
}
