package com.school.app.ims.controller;

import com.school.app.ims.domain.Institution;
import com.school.app.ims.mapper.InstitutionMapper;
import com.school.app.ims.service.ServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
@RequestMapping("/ims/institution")
public class IMSInstitutionController {

    ServiceApi.InstitutionService institutionService;
    InstitutionMapper institutionMapper;

    public IMSInstitutionController(ServiceApi.InstitutionService institutionService,
                                    InstitutionMapper institutionMapper) {
        this.institutionService = institutionService;
        this.institutionMapper = institutionMapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Mono<ResponseEntity<Institution>> findInstitutionById(String groupId) {
        log.info("IMSInstitutionController:findInstitutionById Request: {} ", groupId);
        return institutionService.findInstitutionById(groupId).map(institution -> {

            log.info("IMSInstitutionController:findInstitutionById Response: {} ", institution);
            return ResponseEntity.ok(institution);
        });
    }

    @RequestMapping(method = RequestMethod.POST)
    public Mono<ResponseEntity<Institution>> createInstitution(@RequestBody Institution institution) {
        log.info("IMSInstitutionController:createInstitution Request: {} ", institution);
        return institutionService.createInstitution(institution).map(ins -> {
            log.info("IMSInstitutionController:createInstitution Response: {} ", ins);
            return ResponseEntity.ok(ins);
        });
    }

    @RequestMapping(value = "/using-profile-id", method = RequestMethod.GET)
    public Flux<ResponseEntity<Institution>> findInstitutionForProfile(String profileId) {
        log.info("IMSInstitutionController:findInstitutionForProfile Request: {} ", profileId);
        return institutionService.findInstitutionForProfile(profileId).map(institution -> {

            log.info("IMSInstitutionController:findInstitutionForProfile Response: {} ", institution);
            return ResponseEntity.ok(institution);
        });
    }
}
