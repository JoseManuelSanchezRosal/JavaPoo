package EjerciciosFicheros2.Documentos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’.
// Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar
public class ejercicioA {
    public static void main(String[] args) {
        //1. Crear carpetas DOCUMENTOS si no existe:
        String rutaDoc = new String("EjerciciosFicheros2/Documentos");
        File carpetaDoc = new File(rutaDoc);
        if (!carpetaDoc.exists()) {
            carpetaDoc.mkdirs();
        } else {
            System.out.println("La carpeta ya existe");
        }
        //2. Crear carpetas MIS COSAS y ALFABETO dentro de DOCUMENTOS:
        File miscosas = new File(carpetaDoc, "Mis cosas");
        File alfabeto = new File(carpetaDoc, "Alfabeto");
        if (!miscosas.exists()) {
            miscosas.mkdir();
            System.out.println("Carpeta " + miscosas.getName() + " creada correctamente");
        } else {
            System.out.println("La carpeta ya existe");
        }
        if (!alfabeto.exists()) {
            alfabeto.mkdir();
            System.out.println("Carpeta " + alfabeto.getName() + " creada correctamente");
        } else {
            System.out.println("La carpeta ya existe");
        }
        //2. Mover las carpetas LIBROS y FOTOGRAFIAS dentro de la carpeta MIS COSAS:
        Path fotoOrigen = Paths.get("EjerciciosFicheros2/Documentos/Fotografias");
        Path libroOrigen = Paths.get("EjerciciosFicheros2/Documentos/Libros");

        Path miscosasDestino = Paths.get("EjerciciosFicheros2/Documentos/Mis cosas");
        //Aseguramos que el destino exista:
        try {
            if(!Files.exists(miscosasDestino)){
                Files.createDirectories(miscosasDestino);
            }
            //Movemos carpeta Fotografias:
            Files.move(fotoOrigen, miscosasDestino.resolve(fotoOrigen.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Carpeta Fotografias movida correctamente");
            //Movemos carpeta Libros:
            Files.move(libroOrigen, miscosasDestino.resolve(libroOrigen.getFileName()), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Carpeta Libros movida correctamente");
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());
        }
        //3. Crear carpetas de la A a la Z dentro de la carpeta ALFABETO:
        // Se asegura que la carpeta ALFABETO exista, sino la crea
        Path carpetaAlfabeto = Paths.get("EjerciciosFicheros2/Documentos/Alfabeto");
        try {
            if(!Files.exists(carpetaAlfabeto)){
                Files.createDirectories(carpetaAlfabeto);
                System.out.println("Carpeta Alfabeto creada");
            }else {
                System.out.println("La carpeta Alfabeto existe");
            }
            //Crea dentro de ALFABETO las carpetas de la A a la Z
            for (char letra = 'A'; letra<='Z'; letra++){
                Path subcarpeta = carpetaAlfabeto.resolve(String.valueOf(letra));
                Files.createDirectories(subcarpeta);
                System.out.println("Carpeta "+ subcarpeta.toString()+" creada");
            }
        } catch (Exception e) {
            System.out.println("Error "+ e.getMessage());
        }
    }
}