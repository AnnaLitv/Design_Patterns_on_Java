package com.company.lab111.labwork9;

import java.util.ArrayList;

/**
 * abstract class Builder
 */
public abstract class Builder {

    public Scheme scheme;
    public String[] mas;
    public String descr;
    public int mas_size;
    /**
     * method CreateScheme()
     * for creating Scheme
     */
    public void CreateScheme(String descr){
        scheme = scheme.getInstance("База даных1", descr);
        mas = descr.split("/n");
        mas_size = mas.length;
    }

    /**
     * Override method addTable()
     * for adding tables to Scheme
     * @see Builder#addTable(int)
     */
    public abstract RelTable addTable(int numb);

    public abstract void add_pk(int numb, RelTable table);

    public abstract void add_fk(int numb, RelTable table);

    public abstract void add_fields(int numb, RelTable table);
}
