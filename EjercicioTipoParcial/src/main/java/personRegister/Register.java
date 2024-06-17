
package personRegister;

import com.mycompany.ejerciciotipoparcial.people.Person;
import com.mycompany.ejerciciotipoparcial.people.TypePerson;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Register {
     private File registro;
     private File coaches;
     private File deportistas;

    public Register(File registro, File coaches, File deportistas) {
        this.registro = new File("./regitrosPersonas.txt");
        this.coaches = new File("./registroCoaches");
        this.deportistas = new File("./regitroDeportistas");
    }
    
    public void NewFiles(){
        
        try{
            registro.createNewFile();
            coaches.createNewFile();
            deportistas.createNewFile();
        }catch{
            System.out.println("Archivos creados");
        }
        
         public void Register(ArrayList<Person> lista) throws IOException{
        
        FileWriter fw = new FileWriter(registro, false);
        PrintWriter pw = new PrintWriter(fw);
        FileWriter fw2 = new FileWriter(coaches, false);
        PrintWriter pw2 = new PrintWriter(fw2);
        FileWriter fw3 = new FileWriter(deportistas, false);
        PrintWriter pw3 = new PrintWriter(fw3);
        
        for(Person Element: lista){
            pw.println(Element.name+";"+Element.lastname+";"+Element.age+";"+Element.ID+";"+Element.type);
            if(Element.type == TypePerson.COACH){
                pw2.println(Element.name+";"+Element.lastname+";"+Element.age+";"+Element.ID+";"+Element.type);
            }else if(Element.type == TypePerson.SPORTMAN){
                pw3.println(Element.name+";"+Element.lastname+";"+Element.age+";"+Element.ID+";"+Element.type);
            }
        }
        System.out.println("Registro de personas realizado.");
        fw.close();
        pw.close();
        fw2.close();
        pw2.close();
        fw3.close();
        pw3.close();
        
       }
     
     
}
}
