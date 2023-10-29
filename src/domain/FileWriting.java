
import java.io.*;
import java.util.Formatter;

public class FileWriting {

    private Formatter out;

    public FileWriting(String unNombre) {
        try {
            out = new Formatter(unNombre);
        } catch (FileNotFoundException e) {
            System.out.println("no se puede crear");
            System.exit(1);
        } 
    }

    public FileWriting(String unNombre, boolean ext) {
	// si el parametro viene en true, indica que se extiende
	// si es false, se sobreescribe
        try {
            FileWriter f = new FileWriter(unNombre, ext);
            out = new Formatter(f);
        } catch (IOException e) {
            System.out.println("no se puede crear/extender");
            System.exit(1);
        } 
    }

    public void grabarLinea(String linea) {
        out.format("%s%n", linea);
    }

    public void cerrar() {
        out.close();
    }
}
