package com.mahesh.app.repo;

import com.mahesh.app.data.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
    public Patient save(Patient patient);
}
