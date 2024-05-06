package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creating sample users
        User user1 = new User("User 1", "Male", 16);
        User user2 = new User("User 2", "Female", 16);
        User user3 = new User("User 3", "Male", 18);
        User user4 = new User("User 4", "Female", 20);
        User user5 = new User("User 5", "Male", 24);

        // Creating specifications
        GenderSpecification genderSpecification = new GenderSpecification();
        AgeSpecification ageSpecification = new AgeSpecification();

        // Creating Composite Specification
        AndSpecification<User> userAndSpecification = new AndSpecification<>(genderSpecification, ageSpecification);

        // Filtering users based on the Specification criteria
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        List<User> filteredUsers = filterUsers(users, userAndSpecification);

        // Displaying filtered users
        System.out.println("Filtered users: ");
        for (User user : filteredUsers) {
            System.out.println(user.name + " " + user.age + " " + user.gender);
        }
    }

    private static List<User> filterUsers(List<User> list, Specification<User> specification){
        ArrayList<User> users = new ArrayList<>();
        for (User user : list) {
            if (specification.isSatisfiedBy(user)){
                users.add(user);
            }
        }
        return users;
    }
}
