package com.school.app.ims.repository;

import com.school.app.ims.dto.InstitutionGroupDto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionGroupRepository extends ReactiveMongoRepository<InstitutionGroupDto, String> {
}
