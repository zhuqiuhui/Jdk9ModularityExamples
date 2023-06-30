module com.zqh.people.female {
    requires com.zqh.people.api;
    provides javamodularity.com.zqh.people.api.People with javamodularity.com.zqh.people.female.Female;
}