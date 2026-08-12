package com.treeset.student;

public class Student /*implements <Student>*/ {
    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

/*    @Override
    public int compareTo(Student o) {
       if(this.id< o.id)
       {
           return -1;
       }else if(this.id==o.id) {
           return 0;
       }else{
           return 1;
       }
    }*/
}
