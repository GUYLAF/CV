package com.guylaf.cv;

/**
 * Created by guyla on 07/12/2016.
 */

public class Experience {
    String libel;
    String libelDetail;

    public Experience(String libel, String libelDetail) {
        this.libel = libel;
        this.libelDetail = libelDetail;
    }

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    public String getLibelDetail() {
        return libelDetail;
    }

    public void setLibelDetail(String libelDetail) {
        this.libelDetail = libelDetail;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "libel='" + libel + '\'' +
                ", libelDetail='" + libelDetail + '\'' +
                '}';
    }
}
