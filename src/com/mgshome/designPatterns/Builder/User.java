package com.mgshome.designPatterns.Builder;

//immutable class
public class User {

    private final String name;
    private final int age;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age =  builder.age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    //inner class static
    static class UserBuilder {

        public String name;
        public int age;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
