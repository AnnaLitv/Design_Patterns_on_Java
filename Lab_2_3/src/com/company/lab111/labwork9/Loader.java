package com.company.lab111.labwork9;

/**
 * class Loader
 */
public class Loader {

    /**
     * method Load()
     * for load some system what have built
     * @param builder
     * @return
     */
    public Scheme Load(Builder builder){
       String descr="CREATE TABLE 'Students': PK id_stud, Name(STRING), Age(INT), Sex(STRING)/n"+
                "CREATE TABLE 'Marks': PK id_marks, FK Students, Math(INT), Programming(INT), Algorithms(INT)/n"+
                "CREATE TABLE 'Sports': PK id_sport, FK Students, FK Marks, Sport_Name(STRING)";
        builder.CreateScheme(descr);
        for(int i=0;i<builder.mas_size;i++){
            RelTable tab = builder.addTable(i);
            builder.add_pk(i, tab);
            builder.add_fk(i, tab);
            builder.add_fields(i, tab);
        }

        return builder.scheme;
    }
}
