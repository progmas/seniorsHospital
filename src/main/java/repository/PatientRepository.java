package repository;

import model.Appointment;
import model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,String> {
        List<Patient> findById(Long Patient_id);
        List<Appointment> findByIdAppointment(Long Patient_id);
}
