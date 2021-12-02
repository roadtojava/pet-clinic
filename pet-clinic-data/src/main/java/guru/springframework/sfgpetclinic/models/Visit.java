package guru.springframework.sfgpetclinic.models;


import java.time.LocalDate;

public class Visit extends BaseEntity {

    private LocalDate date;

    private String description;

    public Visit(Long id, LocalDate date, String description, Pet pet) {
//        super(id);
        this.date = date;
        this.description = description;
        this.pet = pet;
    }

    private Pet pet;

    public LocalDate getDate() {
        return date;
    }



}
