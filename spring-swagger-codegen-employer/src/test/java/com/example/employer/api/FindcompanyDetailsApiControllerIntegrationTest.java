package com.example.employer.api;

import com.example.employer.model.Company;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FindcompanyDetailsApiControllerIntegrationTest {

    @Autowired
    private FindcompanyDetailsApi api;

    @Test
    public void getcompanyDetailsTest() throws Exception {
        Long companyId = 789L;
        ResponseEntity<Company> responseEntity = api.getcompanyDetails(companyId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
