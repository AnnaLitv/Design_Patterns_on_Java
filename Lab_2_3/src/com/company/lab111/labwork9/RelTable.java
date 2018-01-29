package com.company.lab111.labwork9;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * class RelTable
 */
public class RelTable {

    private String name;
    private String pk;
    private ArrayList<String> fk;
    private HashMap<String,String> fields;

    /**
     * Constructor for RelTable
     * @param name
     */
    RelTable(String name){
        this.name = name;
        fk = new ArrayList<>();
        fields = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public ArrayList getFk() {
        return fk;
    }

    public void addFk(String fk) {
        this.fk.add(fk);
    }

    public HashMap<String, String> getFields() {
        return fields;
    }

    public void addField(String name, String type) {
        this.fields.put(name,type);
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(this.name+", PK: "+this.pk);
        for (String s:fk){
            str.append(", FK: "+s);
        }
            str.append(", Fields: "+fields.toString());
        return str.toString();
    }

}
