package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Ageable> implements Iterable<Ageable>{

    List<Ageable> memebers;

    public Shelter() {
        memebers = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return memebers.size();
    }

    public void add(Ageable object) {
        memebers.add(object);
    }

    public Boolean contains(Ageable object) {
        return memebers.contains(object);
    }

    public void remove(Ageable object) {
        memebers.remove(object);
    }

    public Object get(Integer index) {
        return memebers.get(index);
    }

    public Integer getIndexOf(Ageable ageable) {
        return memebers.indexOf(ageable);
    }

    @Override
    public Iterator<Ageable> iterator() {
        return memebers.iterator();
    }
}