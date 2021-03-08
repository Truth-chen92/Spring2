package cn.tedu.bean;

import java.io.Serializable;

public class Saw implements Serializable {
    private String name="寒冰锯";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
