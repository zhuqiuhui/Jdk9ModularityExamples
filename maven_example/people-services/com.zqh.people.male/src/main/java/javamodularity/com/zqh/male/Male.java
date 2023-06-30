package javamodularity.com.zqh.male;

import javamodularity.com.zqh.people.api.People;

public class Male implements People {

    public Male() {
        // 必须有构造函数
    }

    @Override
    public String speak() {
        return "I am male!";
    }

    @Override
    public String run() {
        return "I can run 3KM!";
    }
}
