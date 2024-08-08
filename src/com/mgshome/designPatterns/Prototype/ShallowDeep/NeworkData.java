package com.mgshome.designPatterns.Prototype.ShallowDeep;

import java.util.ArrayList;
import java.util.List;

public class NeworkData implements Cloneable {

    public int connectCount;
    public List<String> domains = new ArrayList<String>();

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }


    public int getConnectCount() {
        return connectCount;
    }

    public void setConnectCount(int connectCount) {
        this.connectCount = connectCount;
    }

    @Override
    public String toString() {
        return "NeworkData{" +
                ", connectCount=" + connectCount +
                ", domains=" + domains +
                '}';
    }

    public void loaddomains(){
        domains.add("www.google.com");
        domains.add("www.baidu.com");
        domains.add("wwww.rajaji.com");
        domains.add("www.learnwithdurgesh.com");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //this logic called deep copy because of our customize logic
        NeworkData data = new NeworkData();
        data.setConnectCount(this.getConnectCount());
        for (String d : this.getDomains()) {
            data.getDomains().add(d);
        }

        return data;

        //shallow copy
        //return super.clone();
    }
}
