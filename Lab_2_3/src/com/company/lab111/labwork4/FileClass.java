package com.company.lab111.labwork4;
import java.io.*;

/**
 * Class FileClass implements FileInt
 * for file metods
 */
public class FileClass implements FileInt {

    /**path to file*/
    private String path;
    /**file writer*/
    private FileWriter fileOut;
    /**file file*/
    private File file;

    /**
     * Constructor for FileClass
     * @param path
     */
    public FileClass(String path){
        this.path = path;
        file = new File(path);
    }

    /**
     * getter for fileOut
     * @return
     */
    public FileWriter getFileOut() {
        return fileOut;
    }

    /**
     * Override method open()
     * it opens file for writing
     * or ifNotExist=true creates new file
     * @see FileInt#open()
     */
    @Override
    public void open() {
        try {
           if(createIfNotExist(file)){
               file.createNewFile();
               System.out.println(path+" файл создан!");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileOut = new FileWriter(path);
            System.out.println(path+" файл открыт для записи!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Override method close()
     * for closing file stream
     * @see FileInt#close()
     */
    @Override
    public void close() {
        try {
            fileOut.close();
            System.out.println(path+" файл закрыт для записи!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Override method delete()
     * for deleting file
     * @see FileInt#delete()
     */
    @Override
    public void delete() {
        File file = new File(path);
        if(file.delete()){
            System.out.println(path + " файл был удален");
        }else System.out.println("Файл "+path+" не был найден");
    }

    /**
     * Method createIfNotExist()
     * for checking file existing
     * @param file
     * @return
     */
    boolean createIfNotExist(File file){
        if(file.exists()&&file.length()==0){
            return true;
        } else if(!file.exists())
            return true;
        else
        return false;
    }
}
