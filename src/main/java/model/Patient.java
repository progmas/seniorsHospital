package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long Patient_id;
    private String name;
    private String surname;
    private String tc;

}
