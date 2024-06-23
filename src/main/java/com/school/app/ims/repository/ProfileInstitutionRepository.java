package com.school.app.ims.repository;

import com.school.app.ims.dto.ProfileInstitutionDto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileInstitutionRepository extends ReactiveMongoRepository<ProfileInstitutionDto, String> {
}
