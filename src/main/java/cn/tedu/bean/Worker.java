package cn.tedu.bean;

import java.io.Serializable;

public class Worker implements Serializable {
    private String name="光头强";
    private Saw saw;
    public void work() {
        System.out.println(name+"使用"+saw+"砍树...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Saw getSaw() {
        return saw;
    }

    public void setSaw(Saw saw) {
        this.saw = saw;
    }
}
