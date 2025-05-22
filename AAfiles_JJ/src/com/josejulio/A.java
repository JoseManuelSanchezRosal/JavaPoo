package AAfiles_JJ.src.com.josejulio;

import java.io.*;

public class A {
    public static void main(String[] args) {
        // Ejercicio 1: Crear y escribir en un archivo
        //Crea un programa en Java que cree un archivo de texto llamado datos.txt y escriba dentro de él un mensaje de bienvenida.
        try {
            FileWriter fileWriter = new FileWriter("datos.txt");
            fileWriter.write("Hola Mundo");
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Ejercicio 2: Leer un archivo carácter por carácter
        //Escribe un programa en Java que lea el archivo datos.txt carácter por carácter y muestre el contenido en la pantalla.
        /*try {
            FileReader fileReader = new FileReader("datos.txt");
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //Ejercicio 3: Leer un archivo línea por línea
        //Desarrolla un programa en Java que lea el archivo datos.txt línea por línea e imprima cada línea en la consola.
        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
            bufferedReader.close();
        } catch (Exception e) {

        }*/

        //Ejercicio 4: Agregar contenido a un archivo
        //Modifica el archivo datos.txt para agregar nuevas líneas de texto sin borrar el contenido anterior.
        /*try {
            FileWriter fileWriter = new FileWriter("datos.txt", true);
            fileWriter.append("Hola\n");
            fileWriter.close();
        } catch (Exception e) {

        }*/

        //Ejercicio 5: Contar palabras en un archivo
        //Crea un programa que cuente el número total de palabras en el archivo datos.txt y muestre el resultado en la consola.
        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            int palabras = 0;
            while ((linea = bufferedReader.readLine()) != null) {
                palabras += linea.split(" ").length;
            }
            bufferedReader.close();
            System.out.println(palabras);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        //Ejercicio 6: Copiar el contenido de un archivo a otro
        //Crea un programa que copie el contenido de datos.txt en un nuevo archivo llamado copia.txt, manteniendo el mismo formato.
        /*try {
            FileReader fileReader = new FileReader("datos.txt");
            FileWriter fileWriter = new FileWriter("copia.txt");
            int caracter;
            while ((caracter = fileReader.read()) != -1) {
                fileWriter.write(caracter);
            }
            fileReader.close();
            fileWriter.close();
        } catch (Exception e) {

        }*/

        //Ejercicio 7: Buscar una palabra en un archivo
        //Escribe un programa que busque una palabra específica dentro del archivo datos.txt e indique cuántas veces aparece.
        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("datos.txt"));
            String palabraBuscada = "hola";
            String linea;
            int numApariciones = 0;
            while ((linea = bufferedReader.readLine()) != null) {
                for (String palabra : linea.split(" ")) {
                    if (palabraBuscada.equals(palabra)) {
                        numApariciones++;
                    }
                }
            }
            bufferedReader.close();
            System.out.println(numApariciones);
        } catch (Exception e) {

        }*/

        //Ejercicio 8: Contar la cantidad de líneas en un archivo
        //Crea un programa que cuente cuántas líneas tiene el archivo datos.txt y muestre el total.
        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("datos.txt"));
            int numLineas = 0;
            while (bufferedReader.readLine() != null) {
                numLineas++;
            }
            bufferedReader.close();
            System.out.println(numLineas);
        } catch (Exception e) {

        }*/

        //Ejercicio 9: Renombrar un archivo
        //Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.
        /*try {
            new File("datos.txt").renameTo(new File("informacion.txt"));
        } catch (Exception e) {

        }*/

        //Ejercicio 10: Eliminar un archivo
        //Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.
        /*new File("informacion.txt").delete();*/

        //Ejercicio 11: Listar archivos en un directorio
        //Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual, indicando si cada uno es un archivo o un directorio.
        /*for (File file : new File("test").listFiles()) {
            if (file.isDirectory()) {
                System.out.println("Es una carpeta: " + file.getName());
            } else {
                System.out.println("Es una fichero: " + file.getName());
            }
        }*/

        //Ejercicio 12: Leer un archivo CSV y mostrar los datos
        //Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.
        /*try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("a.csv"));
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                for (String token : linea.split(",")) {
                    if (token.isEmpty()) {
                        System.out.print(" ".repeat(20));
                    } else {
                        System.out.printf("%-20s", token);
                    }
                }
                System.out.println();
            }
            bufferedReader.close();
        } catch (Exception e) {

        }*/

        //Ejercicio 13: Copiar un archivo binario (imagen o vídeo)
        //Crea un programa que copie un archivo binario (por ejemplo, una imagen .jpg o un vídeo .mp4) de un directorio a otro sin modificar su contenido.
        /*try {
            FileInputStream fileInputStream = new FileInputStream("a.jpeg");
            FileOutputStream fileOutputStream = new FileOutputStream("b.jpeg");
            int caracter;
            while ((caracter = fileInputStream.read()) != -1) {
                fileOutputStream.write(caracter);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {

        }*/

        /*try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("a.txt"));
            objectOutputStream.writeObject(new Persona(1, "Pepe", "González"));
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("a.txt"));
            Persona persona = (Persona) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(persona);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}

class Persona implements Serializable {
    private int id;
    private String nombre, apellidos;

    public Persona(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}












