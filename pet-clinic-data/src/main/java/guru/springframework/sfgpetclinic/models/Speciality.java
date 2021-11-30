package guru.springframework.sfgpetclinic.models;

public class Speciality extends BaseEntity {

    private String description;

    public Speciality(Long id, String description) {
        super(id);
        this.description = description;
    }
}
