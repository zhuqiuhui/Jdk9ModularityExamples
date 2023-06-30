package javamodularity.com.zqh.people.female;

import javamodularity.com.zqh.people.api.People;

public class Female implements People {

    public Female() {
        // 必须有构造函数
    }

    @Override
    public String speak() {
        return "I am female!";
    }

    @Override
    public String run() {
        return "I can run 1KM!";
    }
}
