package guru.springframework.sfgpetclinic.models;


public class PetType extends BaseEntity {

    public PetType() {
//        super(id);
//        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
