package repository;

import model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,String> {
    Doctor findById(Long Doctor_id);
    List<Doctor> findByIdList(Long Doctor_id);
    List<Doctor> findByEmailList(String email);
    Doctor findByEmail(String email);
    Doctor findByPassword(String password);
}
