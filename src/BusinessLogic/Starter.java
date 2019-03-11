/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jcarrero
 */
public class Starter {
    public static void main(String[] args) throws FileNotFoundException {
           
        
        
        
        
        //Scanner lectura = new Scanner (new File("pets.txt"));
        Pet p6 = new Dog(null, null, null, null);
        
        Pet p2 = new Dog ("12345", "Pepe", "Cafe", "Pincher");
        HashMap hp = new HashMap<String, Pet>();
        Vet vet = new Vet("Little Pets", hp);
        hp.put(p2.getId(), p2);
        Person p1 = new Person ("Carlos", "1234", hp);
        //p1.addPet(p2);
        
        p1.showPets();
        vet.showPetsByType("Dog");
        vet.showPets();
        /*
        
        2. Ofrecer un menú de opciones al usuario, que le permita realizar las siguientes acciones:
A. Remover una mascota dando su id 
B. Listar las mascotas dado su tipo, es decir, mascotas tipo Dog, Cat o Hamster, según lo indique el usuario.
C. Finalización del programa y listar las mascotas que están registradas en la veterinaria. Debe quedar almacena de la información de forma persistente. 
        Si se eliminan mascotas no deben aparecer en el archivo. 

        */
    }
    
    public void readPets(Vet v) throws FileNotFoundException{
        Scanner lect = new Scanner (new File("pets.txt"));
        
    }
    
    public void manageVet (Vet v, String action) throws FileNotFoundException{
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido a Little Pets");
        System.out.println("Menu");
        System.out.println("1. Remover mascota");
        System.out.println("2. Listar mascotas");
        System.out.println("3. Listar mascotas registradas en la veterinaria");
        System.out.println("Finalizar");
        
        int opcion = lectura.nextInt();
        
        switch (opcion){
            case 1:
                Scanner file = new Scanner (new File("pets.txt"));
                System.out.println("Ingrese el id de su mascota");
                String id = lectura.next();
                int cont = 0;
                while(file.hasNextLine()){
         String pal = file.nextLine();
         if(pal.contains(id)){
             
         }
         cont++;
     }
                
        }
    }
}
