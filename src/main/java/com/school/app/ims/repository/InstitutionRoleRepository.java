package com.school.app.ims.repository;

import com.school.app.ims.dto.InstitutionRoleDto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InstitutionRoleRepository extends ReactiveMongoRepository<InstitutionRoleDto, String> {
}
