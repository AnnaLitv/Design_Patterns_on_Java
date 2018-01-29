package com.company.lab111.labwork9;

import java.util.ArrayList;

/**
 * class Scheme
 */
public class Scheme {

    /**
     * Array list for saving tables in scheme
     */
    ArrayList<RelTable> system = new ArrayList<>();

    private static  Scheme instance;
    private String name;
    private String descript;


    /**
     * constructor for Scheme
     * @param name
     */
    private Scheme(String name, String descript){
        this.name = name;
        this.descript = descript;
    }

    /**
     * method getInstance()
     * for getting new or existing object of Scheme class
     * @param name
     * @return
     */
    public static Scheme getInstance(String name, String descript){
        if (instance == null)
            instance = new Scheme(name, descript);
        return instance;
    }

    /**
     * method toString()
     * converts Scheme system to string
     * @return
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Схема базы даных ( "+this.name+" ) включает: "+"\n");
        for(int i=0;i<system.size();i++){
            sb.append("таблица "+system.get(i).toString()+"\n");
        }

        return sb.toString();
    }

    /**
     * method add()
     * for adding new table to scheme
     * @param tab
     */
    public void add(RelTable tab){
        system.add(tab);
    }

    /**
     * method remove()
     * for removing element from table()
     * @param tab
     */
    public void remove(RelTable tab){
        system.remove(tab);
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

}
