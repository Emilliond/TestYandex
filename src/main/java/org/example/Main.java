package org.example;


import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.example.model.Pet;

public class Main {
    private static final String BASE_URL = "https://petstore.swagger.io/";
    private static final String FIND_PET_BY_ID = "v2/pet/%d";

    public static void main(String[] args) {
        System.out.println(BASE_URL + String.format(FIND_PET_BY_ID,1));
        Pet pet = findPetByID(1);
        System.out.println(pet.getName());

    }

    public static Pet findPetByID(Integer petId) {
        HttpResponse<Pet> response = Unirest.get(BASE_URL + String.format(FIND_PET_BY_ID,petId))
                .asObject(Pet.class);

        return response.getBody();
    }

}