package com.school.app.ims.infra.repository;

import com.school.app.ims.infra.db.ProfileInstitutionDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileInstitutionRepository extends MongoRepository<ProfileInstitutionDto, String> {
}
