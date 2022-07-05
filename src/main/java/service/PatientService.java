package service;

import model.Appointment;
import model.Doctor;
import model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PatientRepository;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;
    private AppointmentService appointmentService;

    public List<Appointment> findByIdAppointment(Long Patient_id){
        return appointmentService.showAppointmentPatient(Patient_id);
    }
}
