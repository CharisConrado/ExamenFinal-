package parcial.estudio1.newpackage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
 import java.util.Scanner;

public class Apartamentos {
    Scanner scn = new Scanner(System.in);
    private File archivo;
    private File pagos;
    private File pazysalvo;
    private File deudas;

    public Apartamentos(String fileName, String pagosName, String pazName, String deudaName) {
        this.archivo = new File(fileName);
        this.pagos = new File(pagosName);
        this.pazysalvo = new File(pazName);
        this.deudas = new File(deudaName);
    }
    
    public void crearArchivo() throws IOException{
        
        try{
            archivo.createNewFile();
            pagos.createNewFile();
            pazysalvo.createNewFile();
            deudas.createNewFile();
        }catch(IOException e){
            System.out.println("Archivo existente");
        }
    }
    
    
    public void apartamento_ocupado() throws FileNotFoundException, IOException{
        
        FileReader reader = new FileReader(archivo);
        BufferedReader buffer = new BufferedReader(reader);
        FileWriter writer = new FileWriter(archivo, true);
        PrintWriter pw = new PrintWriter(writer);
        
        System.out.println("Ingrese el número del apartamento");
        String number = scn.next();
        System.out.println("Ingrese el nombre del inquilino");
        String name = scn.next();
        System.out.println("Ingrese alguna característica del apartamento");
        String cuality = scn.next();
        
        String Line = "";
        while(Line != null){
            Line = buffer.readLine();
            if(Line != null){
                String[] split = Line.split(";");
                if(split[0].equals(number)){
                    System.out.println("El Apartamento ya está Ocupado");
                    System.out.println("¿Lo va a ocupar el nuevo inquilino? (1)Si (2)No");
                    int quest = scn.nextInt();
                    if(quest == 1){
                        cambiarInquilino(number,name);
                    }
                    
                    break;
                }
            }else{
                pw.println(number+";"+name+";"+cuality);
                System.out.println("Apartamento registrado.");
            }
        }
        
        reader.close();
        buffer.close();
        writer.close();
        pw.close();
        
    }
    
    public void cambiarInquilino(String number,String name) throws FileNotFoundException, IOException{
        FileReader reader = new FileReader(archivo);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<String> lista = new ArrayList<>();
        String Line = "";
        while(Line!=null){
            Line=buffer.readLine();
            if(Line!=null){
                lista.add(Line);
            }
        }
        FileWriter writer = new FileWriter(archivo, false);
        PrintWriter pw = new PrintWriter(writer);
        for(String Element : lista){
            
            String[] split = Element.split(";");
            if(number.equals(split[0])){
                pw.println(split[0]+";"+name+";"+split[2]);
            }else{
                pw.println(Element);
            }
        }
        System.out.println("Nuevo inquilino agregado al Apartamento N."+number);
        reader.close();
        buffer.close();
        writer.close();
        pw.close();
    }
    
    
    public void pagos() throws FileNotFoundException, IOException{
        
        FileReader reader = new FileReader(archivo);
        BufferedReader buffer = new BufferedReader(reader);
        FileWriter writer = new FileWriter(pagos, false);
        PrintWriter pw = new PrintWriter(writer);
        
        String Line = "";
        while(Line != null){
            Line = buffer.readLine();
            if(Line != null){
                String[] split = Line.split(";");
                
                System.out.println("¿El siguiente inquilino pagó? SiPago NoPago: "+split[1]);
                String pago = scn.next();
                pw.println(Line+";"+pago);
            }else{
                System.out.println("Pagos registrados.");
            }
        }
        reader.close();
        buffer.close();
        writer.close();
        pw.close();
    }
    
    
    public void deudas() throws IOException{
        
        FileReader reader = new FileReader(pagos);
        BufferedReader buffer = new BufferedReader(reader);
        
        FileWriter writer = new FileWriter(pazysalvo, false);
        PrintWriter pw = new PrintWriter(writer);
        FileWriter writer2 = new FileWriter(deudas, false);
        PrintWriter pw2 = new PrintWriter(writer2);
        
        String Line = "";
        while(Line != null){
            Line = buffer.readLine();
            if(Line != null){
                String[] split = Line.split(";");
                try{
                    if(split[3].equals("SiPago")){
                        pw.println(Line);
                    }else if (split[3].equals("NoPago")){
                        throw new MyException("El inquilino no pagó");
                    }
                }catch(MyException e){
                    System.out.println(e.getMessage());
                    pw2.println(Line);
                }
                
            }else{
                System.out.println("PazySalvo y Deudores Separados.");
            }
        }
        
        reader.close();
        buffer.close();
        writer.close();
        pw.close();
        writer2.close();
        pw2.close();
    }
}
