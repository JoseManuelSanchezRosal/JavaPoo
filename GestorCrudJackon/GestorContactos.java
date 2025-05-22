package GestorCrudJackon;
import GestorCrudJackon.Modelo.Contacto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorContactos {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        File json = new File("GestorCrudJackon/javaContactos.json");
        List<Contacto> contactos = recuperarContactos(json);

        int opcion;
        do {
            System.out.println("-----GESTOR DE CONTACTOS-----\n" +
                    "1. Agregar contacto\n" +
                    "2. Eliminar contacto\n" +
                    "3. Modificar contacto\n" +
                    "4. Buscar contacto\n" +
                    "5. Listar todos los contactos\n" +
                    "6. Guardar y salir \n" +
                    "-----------------------------");
            System.out.println("Introduzca opción: ");
            System.out.println("-----------------------------");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    agregarContacto(contactos);
                    break;
                case 2:
                    eliminarContacto(contactos);
                    break;
                case 3:
                    modificarContacto(contactos);
                    break;
                case 4:
                    buscarContacto(contactos);
                    break;
                case 5:
                    listarContactos(contactos);
                    break;
                case 6:
                    guardarJson(contactos, json);
                    System.out.println("Saliendo del programa.......");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion !=6);
    }

    public static void agregarContacto(List<Contacto> contactos) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca nombre: ");
        String nombreContacto = sc.nextLine();

        System.out.println("Introduczca telefono: ");
        int telefonoContacto = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca email: ");
        String emailContacto = sc.nextLine();

        Contacto contacto = new Contacto(nombreContacto, telefonoContacto, emailContacto);
        contactos.add(contacto);
    }

    public static void eliminarContacto(List<Contacto> contactos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del contacto a eliminar: ");
        String nombreEliminar = sc.nextLine();
        boolean encontrado = false;

        for(Contacto cont : contactos){
            if(cont.getNombre().equalsIgnoreCase(nombreEliminar)){
                contactos.remove(cont);
                encontrado = true;
                System.out.println("Contacto con nombre '"+cont.getNombre()+ "' eliminado");
                break;
            }
        }
        if(!encontrado){
            System.out.println("El contacto no esta en la lista");
        }
    }

    public static void modificarContacto(List<Contacto> contactos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del contacto a modificar: ");
        String nombreModificar = sc.nextLine();
        boolean encontrado = false;

        for (Contacto cont : contactos) {
            if (cont.getNombre().equalsIgnoreCase(nombreModificar)) {
                System.out.println("Contacto encontrado: " + cont);

                System.out.println("Nuevo nombre (dejar en blanco para mantener): ");
                String nuevoNombre = sc.nextLine();
                if (!nuevoNombre.trim().isEmpty()) {
                    cont.setNombre(nuevoNombre);
                }
                System.out.println("Nuevo teléfono (0 para mantener): ");
                int nuevoTelefono = sc.nextInt();
                sc.nextLine();
                if (nuevoTelefono != 0) {
                    cont.setTelefono(nuevoTelefono);
                }
                System.out.println("Nuevo email (dejar en blanco para mantener): ");
                String nuevoEmail = sc.nextLine();
                if (!nuevoEmail.trim().isEmpty()) {
                    cont.setEmail(nuevoEmail);
                }
                System.out.println("Contacto modificado correctamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El contacto no está en la lista.");
        }
    }

    public static void buscarContacto(List<Contacto> contactos){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre a buscar");
        String nombreBuscado = sc.nextLine();
        boolean encontrado = false;

        for (Contacto cont : contactos) {
            if (cont.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println(cont);
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("El contacto no esta en la lista");
        }
    }

    public static void listarContactos(List<Contacto> contactos) {
        System.out.println("Listando contactos............");
        for (Contacto cont : contactos){
            System.out.println(cont);
        }
    }

    private static void guardarJson(List<Contacto> contactos, File json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(json, contactos);
        } catch (IOException e) {
            System.out.println("Error "+e.getMessage());
        }
    }

    public static List<Contacto> recuperarContactos(File json)throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Contacto> contactosRecuperados;
        if(json.exists()){
            contactosRecuperados = mapper.readValue(json, new TypeReference<List<Contacto>>() {});
        }else{
            contactosRecuperados = new ArrayList<>();
        }
        return contactosRecuperados;
    }
}
