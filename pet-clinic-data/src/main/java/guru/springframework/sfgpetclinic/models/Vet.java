package guru.springframework.sfgpetclinic.models;

import java.util.HashSet;
import java.util.Set;


public class Vet extends Person {

//    public Vet(Long id, String firstName, String lastName, Set<Speciality> specialities) {
//        super(id, firstName, lastName);
//        this.specialities = specialities;
//    }

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
