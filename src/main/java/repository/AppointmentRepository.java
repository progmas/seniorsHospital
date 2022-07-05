package repository;

import model.Appointment;
import model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,String> {
    List<Appointment> findByPatient_id(Long Patient_id);
    List<Appointment> findById(Long Appointment_id);

    List<Appointment> findByDoctor_id(Long doctorId);
     List<Appointment> showAppointmentDoctor(Long Doctor_id);
     List<Appointment> showAppointmentPatient(Long Patient_id);

}
