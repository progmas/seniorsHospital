package controller;

import model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import repository.PatientRepository;
import service.AppointmentService;
import service.PatientService;

import java.util.List;

@RestController
public class PatientController {

    private PatientService patientService;

    private AppointmentService appointmentService;
@PostMapping("/userType/myAppointment")
    public List<Appointment> findByIdAppointment(@RequestParam Long Patient_id){
    return appointmentService.showAppointmentPatient(Patient_id);
}

}
