package com.school.app.ims.controller;

import com.school.app.ims.domain.InstitutionRole;
import com.school.app.ims.service.ServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public Mono<ResponseEntity<InstitutionRole>> createInstitutionRole(@RequestBody InstitutionRole institutionRole) {
        log.info("IMSRoleController:createInstitutionRole Request: {} ", institutionRole);
        return institutionRoleService.createRole(institutionRole).map(ins -> {
            log.info("IMSRoleController:createInstitutionRole Response: {} ", ins);
            return ResponseEntity.ok(ins);
        });
    }

    @PutMapping
    public Mono<ResponseEntity<InstitutionRole>> updateInstitutionRole(@RequestBody InstitutionRole institutionRole) {
        log.info("IMSRoleController:createInstitutionRole Request: {} ", institutionRole);
        return institutionRoleService.createRole(institutionRole).map(ins -> {
            log.info("IMSRoleController:createInstitutionRole Response: {} ", ins);
            return ResponseEntity.ok(ins);
        });
    }

}
