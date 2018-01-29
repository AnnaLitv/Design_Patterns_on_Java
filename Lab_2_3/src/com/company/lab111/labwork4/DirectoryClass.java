package com.company.lab111.labwork4;

import java.io.File;

/**
 * Class DirectoryClass implements Directory
 */
public class DirectoryClass implements Directory {
    /**directory path*/
     private String path;
     /**directory file*/
     private File dir;

    /**
     * Constructor for DirectoryClass
     * @param path
     */
    public DirectoryClass(String path){
        this.path = path;
        dir = new File(path);
    }

    /**
     * Override method create()
     * for creating new directory
     * @see Directory#create()
     */
    @Override
    public void create() {
        if(!dir.exists()){
            if(dir.mkdirs())
             System.out.println( path+" директория создана!");
            else
                System.out.println( path+" директория НЕ создана!");
        }
    }

    /**
     * Override method rmdir()
     * for removing directory
     * @see Directory#rmdir()
     */
    @Override
    public void rmdir() {
        recursDel(dir);
    }

    /**
     * Method recursDel(file)
     * for recursive deleting files and directories
     * @param file
     */
    private void recursDel(File file) {
        boolean flag;
        // до конца рекурсивного цикла
        if (!file.exists())
            return;

        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                recursDel(f);
            }
        }

        if(file.isDirectory())
            flag=true;
        else flag=false;

        file.delete();
        if(flag)
        System.out.println("Удалена папка: " + file.getAbsolutePath());
        else
            System.out.println("Удален файл " + file.getAbsolutePath());
    }
}
