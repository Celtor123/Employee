
package builder;

import java.util.Scanner;

/**
 *
 * @author Celso
 * @version def 1
 */
public class Aplicacion {
    static Scanner s= new Scanner(System.in);
   public static void main(String[] args){
       String str="Por favor, elija entre una de las siguientes operaciones:\n"
               + "1. Muestra datos del traballador\n"
               + "2. Muestra datos del Jefe\n"
               + "3. Muestra datos del Director";
       System.out.println(str);
       Registro reg= new Registro();
       int r=s.nextInt();
       switch(r){
           case 1:
               reg.setBuilder(new Trabajador());
           break;
           case 2:
               reg.setBuilder(new Jefe());
           break;
           case 3:
               reg.setBuilder(new Director());
           break;
       }
       
       reg.construir();
       Employee empleo = reg.getEmployee();
       System.out.println("Nombre: "+empleo.getFirstName()+" Apellidos: "+empleo.getMiddleName()+", "+empleo.getLastName()+
       "\n Número de identificación: "+empleo.getId()+"\n Nacido el: "+empleo.getBirthDate()+"/"+empleo.getBirthMonth()+"/"+empleo.getBirthYear()
       +"\n Empleado en el: "+empleo.getHireDate()+"/"+empleo.getHireMonth()+"/"+empleo.getHireYear());
   }
}
