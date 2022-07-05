package service;

import model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AppointmentRepository;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> findById(Long Appointment_id){
        return appointmentRepository.findById(Appointment_id);
    }
    public List<Appointment> showAppointmentDoctor(Long Doctor_id){
        return appointmentRepository.findById(Doctor_id);
    }
    public List<Appointment> showAppointmentPatient(Long Patient_id){
        return appointmentRepository.findById(Patient_id);
    }
}
