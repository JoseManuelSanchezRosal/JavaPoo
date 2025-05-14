package ejercicio2;
import java.io.File;

public class RenombrarArchivo {
    public static void main(String[] args) {
        // TODO: Renombrar el archivo "resources/info9.txt" a "resources/datos9.txt" si existe
        File original = new File("resources/info9.txt");
        File renombrado = new File("resources/datos9.txt");

        try {
            if(original.exists()) {
                original.renameTo(renombrado);
                System.out.println("Archivo renombrado");
            }else {
                System.out.println("El archivo no existe");
            }
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}