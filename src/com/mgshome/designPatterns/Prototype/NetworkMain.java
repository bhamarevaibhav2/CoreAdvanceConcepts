package com.mgshome.designPatterns.Prototype;

public class NetworkMain {

    public static void main(String[] args) {

        NeworkData data = new NeworkData();
        data.setConnectData("AAAA");
        data.setConnectCount(12);

        System.out.println(data.toString());

        try {
            NeworkData data2 = (NeworkData) data.clone();
            System.out.println(data2.toString());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
