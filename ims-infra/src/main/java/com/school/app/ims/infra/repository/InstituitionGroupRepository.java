package com.school.app.ims.infra.repository;

import com.school.app.ims.infra.db.InstitutionGroupDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituitionGroupRepository extends MongoRepository<InstitutionGroupDto, String> {
}
