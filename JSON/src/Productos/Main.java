package Productos;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2. Crear un objeto Producto:
        Producto prod1 = new Producto("Telefono", 455);

        ObjectMapper mapper = new ObjectMapper();

        // 3. Guardar el objeto u objetos en un JSON:
        mapper.writeValue(new File("JSON/src/Productos/productos.json"), prod1);
        System.out.println("Producto añadido: " + prod1);

        // 4. Leer el archivo:
        Producto prod2 = mapper.readValue(new File("JSON/src/Productos/productos.json"), Producto.class);

        // 5. Mostrar por consola los datos:
        System.out.println(prod2);
    }
}
