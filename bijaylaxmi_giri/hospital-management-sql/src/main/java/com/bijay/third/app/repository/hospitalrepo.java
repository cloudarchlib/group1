package com.bijay.third.app.repository;

import com.bijay.third.app.data.Hospital;
import com.bijay.third.app.data.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface hospitalrepo extends CrudRepository<Hospital, Integer> {
    }

