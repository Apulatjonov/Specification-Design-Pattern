package org.example;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/06/2024 15:56
 */

public class AgeSpecification implements Specification<User>{

    @Override
    public boolean isSatisfiedBy(User item) {
        return item.age >= 18;
    }

}
