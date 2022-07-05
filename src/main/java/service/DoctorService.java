package service;

import model.Appointment;
import model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import repository.AppointmentRepository;
import repository.DoctorRepository;

import javax.print.Doc;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class DoctorService {

    private DoctorRepository doctorRepository;

    private AppointmentService appointmentService;

    public List<Appointment> showAppointment(Long Doctor_id) {
        return appointmentService.showAppointmentDoctor(Doctor_id);
    }

    public Doctor getDoctor(String email, String password) {
        Doctor doctor = new Doctor();
        if (doctorRepository.findByEmail(email) == doctorRepository.findByPassword(password)) {
            doctor = doctorRepository.findByEmail(email);
        }

        return doctor;
    }


}
