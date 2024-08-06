package com.mgshome.designPatterns.Builder;

public class UserMain {
    public static void main(String[] args) {

        //method chaining and immutable object
      User user =  new User.UserBuilder().setAge(23).setName("Vaibhav").build();

        System.out.println(user);
    }
}
