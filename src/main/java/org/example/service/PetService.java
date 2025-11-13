package org.example.service;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.example.model.Pet;

public class PetService extends AbstractService {

    private static final String FIND_PET_BY_ID = "v2/pet/%d";
    private static final String ADD_A_NEW_PET_TO_THE_STORE = "pet";

    public static HttpResponse<Pet> findPetByID(Long petId) {
        return Unirest.get(BASE_URL + String.format(FIND_PET_BY_ID, petId))
                .asObject(Pet.class);
    }

    public static HttpResponse<Pet> addANewPetToTheStore(Pet pet) {
        System.out.println(BASE_URL + ADD_A_NEW_PET_TO_THE_STORE);
        return Unirest.post(BASE_URL + ADD_A_NEW_PET_TO_THE_STORE)
                .header("Content-Type", "application/json")
                .body(pet)
                .asObject(Pet.class);
    }

}
