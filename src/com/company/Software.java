package com.company;

import java.util.Objects;

public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Software software = (Software) o;
        return Objects.equals(programmer, software.programmer) &&
                Objects.equals(platform, software.platform) &&
                Objects.equals(os, software.os);
    }

    @Override
    public String toString(){
        return "Software written by " + programmer;
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}