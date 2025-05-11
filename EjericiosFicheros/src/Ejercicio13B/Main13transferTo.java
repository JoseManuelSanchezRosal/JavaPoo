package Ejercicio13B;

import com.sun.management.UnixOperatingSystemMXBean;

import javax.imageio.stream.FileImageOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class Main13transferTo {
    public static void main(String[] args) {

        try (FileInputStream entrada = new FileInputStream("original.jpg");
             FileOutputStream salida = new FileOutputStream("copia.jpg")) {

            FileChannel inputChannel = entrada.getChannel();
            FileChannel outputChannel = salida.getChannel();

            // Usamos transferTo() para copiar el archivo
            inputChannel.transferTo(0, inputChannel.size(), outputChannel);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
