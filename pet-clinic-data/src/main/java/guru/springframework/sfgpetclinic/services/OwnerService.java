package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.models.Owner;

//@Component
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
