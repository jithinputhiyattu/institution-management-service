package com.school.app.ims.repository;

import com.school.app.ims.dto.InstitutionDto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionRepository extends ReactiveMongoRepository<InstitutionDto, String> {
}
