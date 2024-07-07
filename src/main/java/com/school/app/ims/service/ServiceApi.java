package com.school.app.ims.service;

import com.school.app.ims.domain.Institution;
import com.school.app.ims.domain.InstitutionGroup;
import com.school.app.ims.domain.InstitutionRole;
import com.school.app.ims.enums.RoleStatus;
import com.school.app.ims.exceptions.IMSValidationException;
import com.school.app.ims.model.request.InstitutionRolePostRequestModel;
import com.school.app.ims.model.request.InstitutionRolePutRequestModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ServiceApi {

    public interface IMSGroupService {

        Mono<InstitutionGroup> findImsGroupById(String groupId);

        Flux<InstitutionGroup> findInstitutionGroupForProfile(String profileId);

        Mono<InstitutionGroup> createImsGroup(InstitutionGroup group);
    }

    public interface InstitutionService {

        Mono<Institution> findInstitutionById(String groupId);

        Flux<Institution> findInstitutionForProfile(String profileId);

        Mono<Institution> createInstitution(Institution institution);
    }

    public interface InstitutionRoleService {

        Mono<InstitutionRole> createRole(InstitutionRolePostRequestModel institutionRolePostRequestModel);

        Mono<InstitutionRole> updateRole(InstitutionRolePutRequestModel institutionRolePutRequestModel) throws IMSValidationException;

        Flux<InstitutionRole> getAllRoleByRoleStatus(RoleStatus roleStatus);
    }
}
