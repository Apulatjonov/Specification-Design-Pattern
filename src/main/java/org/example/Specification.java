package org.example;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/06/2024 15:53
 */

public interface Specification<T> {

    boolean isSatisfiedBy(T item);

}
