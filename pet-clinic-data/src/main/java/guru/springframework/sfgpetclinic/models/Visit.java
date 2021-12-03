package guru.springframework.sfgpetclinic.models;


import java.time.LocalDate;

public class Visit extends BaseEntity {

    private LocalDate date;

    private String description;

//    public Visit(Long id, LocalDate date, String description, Pet pet) {
////        super(id);
//        this.date = date;
//        this.description = description;
//        this.pet = pet;
//    }

    private Pet pet;

    public LocalDate getDate() {
        return date;
    }


    public String getDescription() {
        return description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
