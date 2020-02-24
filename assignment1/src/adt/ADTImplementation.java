package adt;

import personContact.Person;
public interface ADTImplementation<E> {
    // creating a abstract method to add , delete, search, view and exit contacts
    public void add(Person data);

    void delete(Person data);

    Person search(String firstName);

    public void view();

}
