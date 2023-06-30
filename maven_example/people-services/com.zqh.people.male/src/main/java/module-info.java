module com.zqh.people.male {
    requires com.zqh.people.api;
    provides javamodularity.com.zqh.people.api.People with javamodularity.com.zqh.male.Male;
}