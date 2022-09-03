package fr.nubox.springpetclinic.services;

import fr.nubox.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
