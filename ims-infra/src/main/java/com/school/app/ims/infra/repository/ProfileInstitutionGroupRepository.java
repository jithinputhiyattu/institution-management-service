package com.school.app.ims.infra.repository;

import com.school.app.ims.infra.db.ProfileInstitutionGroupDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileInstitutionGroupRepository extends MongoRepository<ProfileInstitutionGroupDto, String> {
}

