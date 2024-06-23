package com.school.app.ims.controller;

import com.school.app.ims.mapper.InstitutionMapper;
import com.school.app.ims.model.response.InstitutionResponseModel;
import com.school.app.ims.service.ServiceApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
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
    public Mono<ResponseEntity<InstitutionResponseModel>> findInstitutionById(String groupId) {
        log.info("IMSInstitutionController:findInstitutionById Request: {} ", groupId);
        return institutionService.findInstitutionById(groupId).map(institution -> {
            InstitutionResponseModel igs = institutionMapper.toInstitutionResponse(institution);
            log.info("IMSInstitutionController:findInstitutionById Response: {} ", igs);
            return ResponseEntity.ok(igs);
        });
    }

    @RequestMapping(value = "/using-profile-id", method = RequestMethod.GET)
    public Flux<ResponseEntity<InstitutionResponseModel>> findInstitutionForProfile(String profileId) {
        log.info("IMSInstitutionController:findInstitutionForProfile Request: {} ", profileId);
        return institutionService.findInstitutionForProfile(profileId).map(institution -> {
            InstitutionResponseModel igs = institutionMapper.toInstitutionResponse(institution);
            log.info("IMSInstitutionController:findInstitutionForProfile Response: {} ", igs);
            return ResponseEntity.ok(igs);
        });
    }
}
