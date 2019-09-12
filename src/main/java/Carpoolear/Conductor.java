package Carpoolear;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Conductor {

    private @Id @GeneratedValue Long id;
    private String name;
    private String nlicensia;
    private String telefono;


    public Conductor(String name, String nlicensia, String telefono) {
        this.name = name;
        this.nlicensia = nlicensia;
        this.telefono = telefono;
    }

    public Conductor(){

    }
}
