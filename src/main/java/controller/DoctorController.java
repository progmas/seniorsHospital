package controller;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import model.Appointment;
import model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import service.AppointmentService;
import service.DoctorService;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private AppointmentService appointmentService;

   /* @PostMapping("/")
    public String asd() {
        return "123";
    }*/

    @PostMapping("/user_type/doctor_log_in")
    public Doctor Doctor_Log_in(@RequestParam String email, @RequestParam String password) {
        return doctorService.getDoctor(email, password);
    }

    @GetMapping("/user_type/doctor_log_in/showAppo")
    public List<Appointment> showAppoinment(Long Doctor_id) {
       return appointmentService.findById(Doctor_id);
    }

}
