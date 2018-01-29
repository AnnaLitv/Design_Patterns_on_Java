package com.company.lab111.labwork4;

/**
 * Interface FileInt
 */
public interface FileInt {

    /**
     * Method open()
     * it opens file for writing
     * or ifNotExist=true creates new file
     */
    void open();

    /**
     * Override method close()
     * for closing file stream
     */
    void close();

    /**
     * Override method delete()
     * for deleting file
     */
    void delete();
}
