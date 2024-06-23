package com.school.app.ims.repository;

import com.school.app.ims.dto.ProfileInstitutionGroupDto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileInstitutionGroupRepository extends ReactiveMongoRepository<ProfileInstitutionGroupDto, String> {
}

