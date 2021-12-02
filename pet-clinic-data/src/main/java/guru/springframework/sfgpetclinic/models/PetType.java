package guru.springframework.sfgpetclinic.models;


public class PetType extends BaseEntity {

    public PetType(Long id, String name) {
//        super(id);
        this.name = name;
    }

    private String name;


    @Override
    public String toString() {
        return name;
    }
}
