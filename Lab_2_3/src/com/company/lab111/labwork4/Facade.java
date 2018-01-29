package com.company.lab111.labwork4;

import java.io.IOException;

/**
 * Class Facade
 */
public class Facade {

    DirectoryClass dir1 = new DirectoryClass("childdir");
    DirectoryClass dir2 = new DirectoryClass("childdir/child");
    FileClass file1 = new FileClass("File1.txt");
    FileClass file2 = new FileClass("childdir/child/File2.txt");
    FileClass file3 = new FileClass("File3.txt");

    /**
     * Method create()
     * for creating file system
     */
    public void create(){
        dir1.create();
        dir2.create();
        file1.open();
        file2.open();
        file3.open();
        try {
            file1.getFileOut().write("nvtjinubnrbjdbinvwejifjeirocj34");
        } catch (IOException e) {
            e.printStackTrace();
        }
        file1.close();
        file2.close();
        file3.close();

    }

    /**
     * Method destroy()
     * for destroying file system
     */
    public void destroy(){
        dir2.rmdir();
        dir1.rmdir();
        file1.delete();
        file2.delete();
        file3.delete();
    }
}
