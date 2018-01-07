package com.guava.domain;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ComparisonChain;

/**
 * @author created by wangyong on 17-12-14
 */
public class User implements Comparable<User> {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }

    @Override
    public int compareTo(User user) {
//        int nameCompareNum = this.name.compareTo(user.getName());
//        if (nameCompareNum != 0) {
//            return nameCompareNum;
//        }
//
//        return Integer.compare(this.age, user.getAge());

        return ComparisonChain.start()
                .compare(this.name, user.name)
                .compare(this.age, user.age)
                .result();

    }
}
