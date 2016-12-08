package com.guylaf.cv;

/**
 * Created by guyla on 08/12/2016.
 */

public class Education {
    String libel;

    public Education(String libel) {
        this.libel = libel;
    }

    public String getLibel() {
        return libel;
    }

    public void setLibel(String libel) {
        this.libel = libel;
    }

    @Override
    public String toString() {
        return "Education{" +
                "libel='" + libel + '\'' +
                '}';
    }
}
