package com.company.lab111.labwork6;

/**
 * Class Table which describing table structure
 */
public class Table {
    /**name field*/
    private String name;
    /**age field*/
    private int age;

    /**
     * Constructor for Table
     * @param name
     * @param age
     */
    Table(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
