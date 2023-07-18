package com.enset.hopitalv1;

import com.enset.hopitalv1.entities.Patient;
import com.enset.hopitalv1.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalV1Application implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalV1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

       /* // Constructeur sans paramètre
        Patient patient = new Patient();
        patient.setId(null);
        patient.setNom("Mohamed");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(23);*/

       /* // Constructeur avec paramètre
        Patient patient2 = new Patient(null, "Yassine", new Date(), false, 123);*/

       /* //En utilisant Builder
        Patient patient3 = Patient
                .builder()
                .nom("Imane")
                .dateNaissance(new Date())
                .malade(true)
                .score(56)
                .build();*/

        patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 340));
        patientRepository.save(new Patient(null, "Hanane", new Date(), false, 432));
        patientRepository.save(new Patient(null, "Imane", new Date(), true, 340));
    }
}
