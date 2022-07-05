package model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment {
    @Id
    @GeneratedValue
    private Long Appointment_id;
    private Long Patient_id;
    private Long Doctor_id;
    private String appo_day;
    private String clock;

    public Long getAppointment_id() {
        return Appointment_id;
    }

    public void setAppointment_id(Long appointment_id) {
        Appointment_id = appointment_id;
    }

    public Long getPatient_id() {
        return Patient_id;
    }

    public void setPatient_id(Long patient_id) {
        Patient_id = patient_id;
    }

    public Long getDoctor_id() {
        return Doctor_id;
    }

    public void setDoctor_id(Long doctor_id) {
        Doctor_id = doctor_id;
    }

    public String getAppo_day() {
        return appo_day;
    }

    public void setAppo_day(String appo_day) {
        this.appo_day = appo_day;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public Appointment(Long appointment_id, Long patient_id, Long doctor_id, String appo_day, String clock) {
        Appointment_id = appointment_id;
        Patient_id = patient_id;
        Doctor_id = doctor_id;
        this.appo_day = appo_day;
        this.clock = clock;
    }
}
