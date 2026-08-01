package com.arraylist.comparator;

import java.util.Comparator;

public  class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1,Employee o1)
    {
        return e1.getName().compareTo(o1.getName());
    }
}
