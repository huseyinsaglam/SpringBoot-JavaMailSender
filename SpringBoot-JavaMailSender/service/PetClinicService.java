package com.example.petclinicapp.service;


import com.example.petclinicapp.model.Owner;

import java.util.List;

public interface PetClinicService {

    List<Owner> findOwnerss();
    List<Owner> findOwners(String lastName);
    Owner findOwner(Long id);
    void createOwner(Owner owner);
    void updateOwner(Owner owner);
    void deleteOwner(Long id);
}
