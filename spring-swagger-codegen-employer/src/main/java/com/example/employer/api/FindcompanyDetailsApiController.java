package com.example.employer.api;

import com.example.employer.model.Company;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T13:26:19.982+03:00[Europe/Helsinki]")
@Controller
public class FindcompanyDetailsApiController implements FindcompanyDetailsApi {

    private static final Logger log = LoggerFactory.getLogger(FindcompanyDetailsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public FindcompanyDetailsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Company> getcompanyDetails(@ApiParam(value = "ID of company to return",required=true) @PathVariable("companyId") Long companyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Company>(HttpStatus.NOT_IMPLEMENTED);
    }

}
