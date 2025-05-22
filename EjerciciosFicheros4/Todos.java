package EjerciciosFicheros4;

import java.io.*;
import java.util.Arrays;

public class Todos {
    public static void main(String[] args) {
        //Ejercicios de Ficheros en Java
        //Ejercicio 1: Crear y escribir en un archivo
        //Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.
        try {
            FileWriter archivo = new FileWriter("EjercicioFicheros4/datos.txt");
            archivo.write("Este es un mensaje escrito desde el ejercicio 1" + System.lineSeparator());
            archivo.write("Otro mensaje escrito desde el ejercicio 1");
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 2: Leer un archivo carácter por carácter
        //Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.
        try {
            FileReader archivo = new FileReader("EjercicioFicheros4/datos.txt");
            int letra;
            while ((letra = archivo.read()) != -1) {
                System.out.print((char) letra);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 3: Leer un archivo línea por línea
        //Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.
        try {
            BufferedReader br = new BufferedReader(new FileReader("EjercicioFicheros4/datos.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 4: Agregar contenido a un archivo
        //Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.
        try {
            FileWriter fw = new FileWriter("EjercicioFicheros4/datos.txt", true);
            fw.write("\nEste es otro mensaje anadido desde el ejercicio 4");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 5: Contar palabras en un archivo
        //Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado en la consola.
        try {
            BufferedReader br = new BufferedReader(new FileReader("EjerciciosFicheros4/datos.txt"));
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                contador += linea.split(" ").length;
            }
            br.close();
            System.out.println("En el documento hay un total de " + contador + " palabras");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        //Ejercicio 6: Copiar el contenido de un archivo a otro
        //Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato.
        try {
            BufferedReader br = new BufferedReader(new FileReader("EjerciciosFicheros4/datos.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("EjerciciosFicheros4/datosCopia.txt"));
            int letra;
            while ((letra = br.read()) != -1) {
                bw.write(letra);

            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 7: Buscar una palabra en un archivo
        //Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.
        try {
            BufferedReader br = new BufferedReader(new FileReader("EjerciciosFicheros4/datos.txt"));
            String palabraBuscada = "es";
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                String[] texto = linea.split(" ");
                for (String palabra : texto) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        contador++;
                    }
                }
            }
            br.close();
            System.out.println("La palabra buscada " + palabraBuscada + " aparece " + contador + " veces");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 8: Contar la cantidad de líneas en un archivo
        //Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.
        try {
            BufferedReader br = new BufferedReader(new FileReader("EjerciciosFicheros4/datos.txt"));
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                contador++;
            }
            System.out.println("El archivo contiene " + contador + " lineas");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 9: Renombrar un archivo
        //Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.
        File archivo = new File("EjerciciosFicheros4/datos.txt");
        archivo.renameTo(new File("EjerciciosFicheros4/info.txt"));


        //Ejercicio 10: Eliminar un archivo
        //Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.
        File archivo = new File("EjerciciosFicheros4/info.txt");
        archivo.delete();

        //Ejercicio 11: Listar archivos en un directorio
        //Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
        File directorio = new File("EjerciciosFicheros3");
        File[] elementos = directorio.listFiles();
        for (File elemento : elementos) {
            if (elemento.isDirectory()) {
                System.out.println("El archivo " + elemento.getName() + " es un DIRECTORIO");
            }
            if (elemento.isFile()) {
                System.out.println("El archivo " + elemento.getName() + " es un ARCHIVO");
            }
        }

        //Ejercicio 12: Leer un archivo CSV y mostrar los datos
        //Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.
        try {
            BufferedReader bf = new BufferedReader(new FileReader("EjerciciosFicheros4/datos.csv"));
            String linea;
            while ((linea = bf.readLine()) != null) {
                String[] texto = linea.split(",");
                for (String palabra : texto) {
                    if (palabra.isEmpty()) {
                        System.out.printf("                    ");
                    } else {
                        System.out.printf("%-20s", palabra);
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 13: Copiar un archivo binario (imagen o vídeo)
        //Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.
        try {
            FileInputStream in = new FileInputStream("EjerciciosFicheros4/playa.jpeg");
            FileOutputStream out = new FileOutputStream("EjerciciosFicheros4/playaCopia.jpeg");
            int letra;
            while ((letra = in.read()) != -1) {
                out.write(letra);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 14: Serializar Objeto:
        Persona persona1 = new Persona("Jose", 39, "josematroll@gmail.com");
        String ruta = new String("EjerciciosFicheros4/persona.dat");
        try {
            ObjectOutputStream serializar = new ObjectOutputStream(new FileOutputStream(ruta));
            serializar.writeObject(persona1);
            serializar.close();
            System.out.println("Objeto Serializado");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Ejercicio 15: Deserializar archivo:
        String archivo = new String("EjerciciosFicheros4/persona.dat");
        try {
            ObjectInputStream deserializar = new ObjectInputStream(new FileInputStream(archivo));
            Persona persona2 = (Persona) deserializar.readObject();
            deserializar.close();
            System.out.println(persona2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}