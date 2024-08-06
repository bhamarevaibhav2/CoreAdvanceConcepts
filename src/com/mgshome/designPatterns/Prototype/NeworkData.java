package com.mgshome.designPatterns.Prototype;

public class NeworkData implements Cloneable {

    public String connectData;
    public int connectCount;

    public void setConnectData(String connectData) {
        this.connectData = connectData;
    }

    public void setConnectCount(int connectCount) {
        this.connectCount = connectCount;
    }

    @Override
    public String toString() {
        return "NeworkData{" +
                "connectData='" + connectData + '\'' +
                ", connectCount=" + connectCount +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
