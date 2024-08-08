package com.mgshome.designPatterns.Prototype.ShallowDeep;

import java.util.List;

public class NetworkMain {

    public static void main(String[] args) {

        NeworkData data = new NeworkData();
        data.setConnectCount(12);
        data.loaddomains();

        /*
        Here is the difference between shallow copy and deep copy:
         * shallow is normal copy of object
         * means we want copy of object 
         * Network data = new Network();
         * NetworkData data2 = (NetworkData) data.clone();
         * Its no issue for normal object copy but in object one object like List that time only copy the reference of
         * that object not value so we try to apply any operation on that reference that affect on original object or others.
         * That problem we solve in deep copy
         * we write custom logic in clone method
         */

        System.out.println(data.toString());

        try {
            NeworkData data2 = (NeworkData) data.clone();
            NeworkData data3 = (NeworkData) data.clone();
            data.getDomains().remove(0);
            System.out.println(data.toString());
            System.out.println(data2.toString());
            System.out.println(data3.toString());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
