package parcial.estudio1;
import java.util.Scanner;
import java.io.IOException;
import parcial.estudio1.newpackage.Apartamentos;


public class Estudio1 {
    
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        Apartamentos aptos = new Apartamentos("./aptos.txt","./pagos.txt","./pazysalvo.txt","./deudas.txt");
        aptos.crearArchivo();
        
        System.out.println("¿Desea registrar un nuevo departamento? (1)Si (2)No");
        int quest = scn.nextInt();
        if(quest==1){
            aptos.apartamento_ocupado();
        }
        System.out.println("");
        System.out.println("¿Desea agregar los pagos del mes? (1)Si (2)No");
        quest = scn.nextInt();
        if(quest==1){
            aptos.pagos();
        }
        System.out.println("");
        
        System.out.println("¿Desea dividir los pazysalvo y los deudores? (1)Si (2)No");
        quest = scn.nextInt();
        if(quest==1){
            aptos.deudas();
        }
        System.out.println("");
    }
}
