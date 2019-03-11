/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.HashMap;

/**
 *
 * @author jcarrero
 */
public class Person {
    private String name;
    private String id;
    private HashMap<String, Pet> pets;

    public Person(String name, String id, HashMap<String, Pet> pets) {
        this.name = name;
        this.id = id;
        this.pets = pets;
    }
   
    public void showPets(){
        for (Pet value : pets.values()) {
            value.toString();
        }
    }

    public void addPet(Pet pet){
        this.pets.put(pet.getId(), pet);
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
