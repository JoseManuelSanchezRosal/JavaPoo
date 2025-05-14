package EjerciciosFicheros2.Carpetas;

import java.io.File;
import java.util.Scanner;

//Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar
public class crearBorrarDesdeRuta {
    public static void main(String[] args) {
        //1. Declaramos la ruta de nuestra carpeta DOCUMENTOS"
        String ruta = new String("EjerciciosFicheros2/Carpetas/carpetaCreada/subcarpetaCreada/carpetaFinal");
        File directorios = new File(ruta);
        //2. Creamos directorios con MKDIRS, si no existe lo crea.
        if (!directorios.exists()){
            boolean creadas = directorios.mkdirs(); //MKDIRS CREA DIRECTORIOS Y SUBDIRECTORIOS.
            if(creadas){
                System.out.println("Directorios Creados en la ruta: "+ruta);
            }else{
                System.out.println("No se pudieron crear los directorios");
            }
        }else {
            System.out.println("La ruta y directorios ya existen");
        }
        // 3. Borrar un archivo que se pase por parametro:
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca ruta del archivo a borrar: ");
        String rutarchivo = sc.nextLine();
        File archivoAborrar = new File(rutarchivo);

        if(archivoAborrar.exists()){
            archivoAborrar.delete();
            System.out.println("Archivo borrado");
        }else {
            System.out.println("El archivo no existe");
        }

        //4. Borrar una carpeta pedida al usuario:
        System.out.println("Introduzca ruta de carpeta a borrar");
        String rutacarpeta = sc.nextLine();
        File carpeta = new File(rutacarpeta);

        if (carpeta.exists()) {
            carpeta.delete();
            System.out.println("Carpeta borrada");
        }else {
            System.out.println("La ruta o carpeta no existe");
        }

        // 5. Listar archivos o directorios de una ruta o carpeta en concreto pasada por parametro:
        System.out.println("Introduzca ruta a listar: ");
        String rutaalistar = sc.nextLine();
        File directorioAlistar = new File(rutaalistar);

        File[] elementos = directorioAlistar.listFiles();
        if(elementos != null){
            for(File elemento : elementos){
                if (elemento.isDirectory()){
                    System.out.println("El elemento "+ elemento.getName()+" es directorio");
                } else if (elemento.isFile()){
                    System.out.println("El elemento "+ elemento.getName()+" es un archivo");
                }
            }
        }
        else {
            System.out.println("No hay nada que listar");
        }
    }
}














