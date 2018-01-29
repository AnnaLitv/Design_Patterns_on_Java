package com.company.lab111.labwork9;

/**
 * class ConcrBuilder extends Builder
 */
public class ConcrBuilder extends Builder {

    /**
     * Override method addTable()
     * for adding tables to Scheme
     * @see Builder#addTable(int)
     */
    @Override
    public RelTable addTable(int numb) {
        String str = mas[numb];
        int fir = str.indexOf("'");
        int las = str.lastIndexOf("'");
        String name_tab = str.substring(fir+1,las);
        RelTable newone = new RelTable(name_tab);
        scheme.add(newone);
        return newone;
    }

    public void add_pk(int  numb, RelTable table){
        String str = mas[numb];
        if(str.contains("PK")){
            int pk_i = str.indexOf("PK")+3;
            int skob = str.indexOf(",");
            String pk = str.substring(pk_i,skob);
            table.setPk(pk);
        }
    }

    public void add_fk(int numb, RelTable table){
        String str = mas[numb];
        if(str.contains("FK")) {
            String[] str1 = str.split(",");
            for(int i=1;i<str1.length;i++){
                if(str1[i].contains("FK")){
                    int fir = str1[i].indexOf("FK")+3;
                    int las = str1[i].length()-1;
                    String fk = str1[i].substring(fir, las);
                    table.addFk(fk);
                }
            }
        }
    }

    public void add_fields(int numb, RelTable table){
        String str = mas[numb];
        String[] str1 = str.split(",");
        for(int i=0;i<str1.length;i++){
            if(!str1[i].contains("FK")&&!str1[i].contains("PK")&&!str1[i].contains("CREATE TABLE")){
                int scob = str1[i].indexOf("(");
                String name = str1[i].substring(1,scob);
                int scob2 = str1[i].indexOf(")");
                String type = str1[i].substring(scob+1,scob2);
                table.addField(name,type);
            }
        }
    }
}
