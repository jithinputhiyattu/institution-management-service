package com.school.app.ims.controller;

import com.school.app.ims.domain.InstitutionRole;
import com.school.app.ims.enums.RoleStatus;
import com.school.app.ims.exceptions.IMSValidationException;
import com.school.app.ims.model.request.InstitutionRolePostRequestModel;
import com.school.app.ims.model.request.InstitutionRolePutRequestModel;
import com.school.app.ims.service.ServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/ims/role")
public class IMSRoleController {

    ServiceApi.InstitutionRoleService institutionRoleService;

    public IMSRoleController(ServiceApi.InstitutionRoleService institutionRoleService) {
        this.institutionRoleService = institutionRoleService;
    }

    @PostMapping
    public Mono<ResponseEntity<InstitutionRole>> createInstitutionRole(@RequestBody InstitutionRolePostRequestModel institutionRolePostRequestModel) {
        log.info("IMSRoleController:createInstitutionRole Request: {} ", institutionRolePostRequestModel);
        return institutionRoleService.createRole(institutionRolePostRequestModel).map(ins -> {
            log.info("IMSRoleController:createInstitutionRole Response: {} ", ins);
            return ResponseEntity.ok(ins);
        });
    }

    @PutMapping
    public Mono<ResponseEntity<InstitutionRole>> updateInstitutionRole(@RequestBody InstitutionRolePutRequestModel institutionRolePutRequestModel) throws IMSValidationException {
        log.info("IMSRoleController:updateInstitutionRole Request: {} ", institutionRolePutRequestModel);
        return institutionRoleService.updateRole(institutionRolePutRequestModel).map(ins -> {
            log.info("IMSRoleController:updateInstitutionRole Response: {} ", ins);
            return ResponseEntity.ok(ins);
        });
    }

    @GetMapping
    public Flux<ResponseEntity<InstitutionRole>> getInstitutionRoleByRoleStatus(@RequestParam RoleStatus roleStatus) {
        log.info("IMSRoleController:getInstitutionRoleByRoleStatus Request: {} ", roleStatus);
        return institutionRoleService.getAllRoleByRoleStatus(roleStatus).map(ins -> {
            log.info("IMSRoleController:getInstitutionRoleByRoleStatus Response: {} ", ins);
            return ResponseEntity.ok(ins);
        });
    }
}
