package org.example;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/06/2024 15:56
 */

public class GenderSpecification implements Specification<User>{

    @Override
    public boolean isSatisfiedBy(User item) {
        return item.gender.equalsIgnoreCase("male");
    }

}
