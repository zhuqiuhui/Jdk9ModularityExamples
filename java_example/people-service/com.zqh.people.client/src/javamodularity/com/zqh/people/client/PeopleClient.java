package javamodularity.com.zqh.people.client;

import javamodularity.com.zqh.people.api.People;

import java.util.ServiceLoader;

public class PeopleClient {

    public static void main(String[] args) {
        // 遍历服务
        Iterable<People> peoples = ServiceLoader.load(People.class);
        for (People people: peoples) {
            System.out.println(people.speak());
            System.out.println(people.run());
        }
    }
}
