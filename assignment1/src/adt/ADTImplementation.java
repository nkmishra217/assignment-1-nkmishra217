package adt;

public interface ADTImplementation<E> {
    // creating a abstract method to add , delete, search, view and exit contacts
    public void add(E f_name, E l_name, E phone, E email);

    public E delete();

    public E search();

    public void view();

    public void exit();
}
