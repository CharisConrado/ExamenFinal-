
package parcial.ejemploexcepcion2;

import java.io.*;

public class EjemploExcepcion2 {
    public static void leerArchivo(String nombreArchivo) {
        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            System.out.println("Proceso de lectura finalizado.");
        }
    }

    public static void main(String[] args) {
        leerArchivo("archivo.txt");
        UsoExcepcionPersonalizada validador = new UsoExcepcionPersonalizada();
        try {
            validador.validarEdad(16);
        } catch (ExcepcionPersonalizada e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }
    }
}
