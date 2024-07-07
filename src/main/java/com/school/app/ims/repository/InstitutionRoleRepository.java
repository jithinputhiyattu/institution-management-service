package com.school.app.ims.repository;

import com.school.app.ims.dto.InstitutionRoleDto;
import com.school.app.ims.enums.RoleStatus;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface InstitutionRoleRepository extends ReactiveMongoRepository<InstitutionRoleDto, String> {

    public Flux<InstitutionRoleDto> findAllByRoleStatus(RoleStatus roleStatus);
}
