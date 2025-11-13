package org.example;


import kong.unirest.HttpResponse;
import org.example.model.Pet;
import org.example.model.PetStatus;
import org.example.service.PetService;

public class Main {
    public static void main(String[] args) {

        Pet pet = Pet.builder()
                .name("Fluffy")
                .petStatus(PetStatus.AVAILABLE)
                .build();

        HttpResponse<Pet> response = PetService.addANewPetToTheStore(pet);
        System.out.println(response.getStatus());
        response = PetService.findPetByID(1L);
        System.out.println(response.getBody().getName());
    }

}