package org.example;

/**
 * Created by Abdulaziz Pulatjonov
 * Date: 05/06/2024 15:59
 */


public class AndSpecification<T> implements Specification<T> {

    private Specification<T> specification1;
    private Specification<T> specification2;

    public AndSpecification(Specification<T> specification1, Specification<T> specification2) {
        this.specification1 = specification1;
        this.specification2 = specification2;
    }

    @Override
    public boolean isSatisfiedBy(T item) {
        return specification1.isSatisfiedBy(item) && specification2.isSatisfiedBy(item);
    }

}
