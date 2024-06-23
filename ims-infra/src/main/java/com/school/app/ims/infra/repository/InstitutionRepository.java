package com.school.app.ims.infra.repository;

import com.school.app.ims.infra.db.InstitutionDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionRepository extends MongoRepository<InstitutionDto, String> {
}
