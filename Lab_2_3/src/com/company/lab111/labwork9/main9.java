package com.company.lab111.labwork9;

import com.company.lab111.labwork3.Leaf;

public class main9 {
    public static void main(String[] args){
        Loader loader = new Loader();
        Builder build = new ConcrBuilder();
        Scheme chm = loader.Load(build);
        System.out.println(chm.toString());
    }
}
