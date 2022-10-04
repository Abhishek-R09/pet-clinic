package dev.abhishekr.petclinic.services;

import dev.abhishekr.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
