package UsuariosListas;

import java.util.Arrays;
import java.util.List;
/* UsuariosListas.MainList para trabajar con objetos en formato JSON. Al final, deberas poder guardar una Lista
* de usuarios en un archivo .json. y volver a leerla para reconstruir los objetos en memoria.
* SIN ACABAR
*/
public class MainList {
    public static void main(String[] args) {
        List<Usuario> lisusers[] = new List[]{Arrays.asList(
                new Usuario("Jaime", "jaimel@gmail.com"),
                new Usuario("Falis", "falis@gmail.com"),
                new Usuario("Avila", "manu@gmail.com"))
        };
    }
}