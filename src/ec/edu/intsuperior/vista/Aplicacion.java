package ec.edu.intsuperior.vista;

import java.util.Scanner;
import ec.edu.intsuperior.modelo.Persona;

public class Aplicacion {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        System.out.println("Ingrese la cedula de la persona: ");
        p1.setCedula(leer.nextLine());
        System.out.println("Ingrese el nombre de la persona: ");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido de la persona: ");
        p1.setApellido(leer.nextLine());
        System.out.println("Ingrese la dirección de la persona: ");
        p1.setDireccion(leer.nextLine());
        p1.setGenero(Persona.TipoGenero.MASCULINO);
        
        System.out.println("");
        System.out.println("=======================================");
        
        System.out.println("Los datos de la persona son: \n"
                + "Cedula: "+ p1.getCedula()+"\n"
                + "Nombre y Apellido: "+p1.getNombre()+" "+p1.getApellido()+"\n"
                + "Dirección: "+p1.getDireccion()+"\n"
                + "Genero: "+p1.getGenero());
    }
}
