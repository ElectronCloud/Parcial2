/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author jcarrero
 */
public class Vet {
    
    private String name;
    private HashMap<String, Pet> pets;
    
    public Vet(String name, HashMap<String, Pet> pets){
        this.name= name;
        this.pets = pets;
    }


 public void removePet(Pet p){
     this.pets.remove(p.getId());
 }
 
 public void showPetsByType(String type){
     if(pets.values().equals(type)){
         /*for(Dog dog : pets.values()){
             
         }
         System.out.println(pets.);*/
     }
     
 }
 
 public void showPets() throws FileNotFoundException{
     Scanner lect = new Scanner (new File("pets.txt"));
     int cont = 0;
     while(lect.hasNextLine()){
         String pal = lect.nextLine();
         System.out.println(pal);
         cont++;
     }
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
 
}

