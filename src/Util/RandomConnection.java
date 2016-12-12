/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *
 * @author Reymundo Tenorio
 */
public class RandomConnection {
    
    private File file;
    private static RandomAccessFile raf;
    private String filename;

    public RandomConnection(String filename) {
        this.filename = filename;
    }
    
    public void Conectar() throws FileNotFoundException, IOException
    {
        file = new File(filename);
        if(file.exists())
        {
            raf = new RandomAccessFile(file, "rw");
        }
        else
        {
            raf = new RandomAccessFile(file, "rw");
            raf.seek(0);
            raf.writeInt(0);
        }
    }
    
    public static RandomAccessFile GetCurrentConnection()
    {
        return raf;
    }
    
}
