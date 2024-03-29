/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.employer.api;

import com.example.employer.model.Company;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-18T13:26:19.982+03:00[Europe/Helsinki]")
@Api(value = "findcompanyDetails", description = "the findcompanyDetails API")
public interface FindcompanyDetailsApi {

    @ApiOperation(value = "Find company by ID", nickname = "getcompanyDetails", notes = "Returns a single company", response = Company.class, tags={ "company", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Company.class),
        @ApiResponse(code = 400, message = "Invalid company ID supplied"),
        @ApiResponse(code = 404, message = "company not found") })
    @RequestMapping(value = "/findcompanyDetails/{companyId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Company> getcompanyDetails(@ApiParam(value = "ID of company to return",required=true) @PathVariable("companyId") Long companyId);

}
