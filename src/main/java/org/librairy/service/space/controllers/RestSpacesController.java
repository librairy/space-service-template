package org.librairy.service.space.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.avro.AvroRemoteException;
import org.librairy.service.space.facade.model.SpaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@RestController
@RequestMapping("/spaces")
@Api(tags = "/spaces", description = "space-level operations")
public class RestSpacesController {

    private static final Logger LOG = LoggerFactory.getLogger(RestSpacesController.class);

    @Autowired
    SpaceService service;

    @PostConstruct
    public void setup(){

    }

    @PreDestroy
    public void destroy(){

    }

    @ApiOperation(value = "build a space from points", nickname = "postIndex", response=Boolean.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Boolean.class),
    })
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Boolean index(@RequestParam Double threshold)  {
        try {
            return service.index(threshold);
        } catch (AvroRemoteException e) {
            throw new RuntimeException(e);
        }
    }

}
