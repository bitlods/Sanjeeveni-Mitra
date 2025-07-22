package in.Health.Tharun.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Health.Tharun.entity.Patient;

/**
 * @author:RAGHU SIR 
 *  Generated F/w:SHWR-Framework 
 */
public interface PatientRepository extends JpaRepository<Patient, Long> {
	
	Optional<Patient> findByEmail(String email);
}
