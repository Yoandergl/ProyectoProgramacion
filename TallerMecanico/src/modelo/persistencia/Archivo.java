package modelo.persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class Archivo {

    protected File archivo;
    protected FileWriter wr;
    protected Scanner rd;
    
    public Archivo(String ruta){this.archivo = new File(ruta);}
    public File getArchivo() {return archivo;}
    public void setArchivo(File archivo) {this.archivo = archivo;}
    protected void renombrarArchivo(File tmp) throws IOException{
        if(!tmp.exists())
            throw new IOException("El archivo temporal no existe");
            
        if(!this.archivo.delete()){
            tmp.delete();
            throw new IOException("No es posible eliminar el archivo original");
        }
        
        if(!tmp.renameTo(this.archivo)){
            throw new IOException("No es posible renombrar el archivo temporal");
        }    
    }   
}
