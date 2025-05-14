package EjerciciosFicheros3.ElCentroDeLaTierra.resources.explorador;

import javax.swing.*;
import java.io.*;

// HACER 10 COPIAS DE UN ARCHIVO
public class hacer10Copias {
    public static void main(String[] args) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("EjerciciosFicheros3/ElCentroDeLaTierra/resources/explorador/nada.txt"));
            for (int i = 0; i < 10; i++) {
                BufferedWriter escritor = new BufferedWriter(new FileWriter("EjerciciosFicheros3/ElCentroDeLaTierra/resources/explorador/copia" + i + ".txt"));
                String linea;
                while ((linea = lector.readLine()) != null) {
                    escritor.write(linea);
                    escritor.newLine();
                }
                escritor.close();
            }
            System.out.println("Archivos Creados");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}