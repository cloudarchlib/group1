package com.mahesh.app.repo;

import com.mahesh.app.data.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends MongoRepository<Hospital, String> {
    public Hospital save(Hospital hospital);
}
