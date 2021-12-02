package guru.springframework.sfgpetclinic.models;


import java.io.Serializable;


public class BaseEntity implements Serializable {

//    public BaseEntity(Long id) {
//        this.id = id;
//    }

    private Long id;

    public boolean isNew() {
        return this.id == null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
