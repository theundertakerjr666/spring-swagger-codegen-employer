package com.example.employer.api;

import com.example.employer.model.Employer;

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
public class FindemployerDetailsApiControllerIntegrationTest {

    @Autowired
    private FindemployerDetailsApi api;

    @Test
    public void getemployerDetailsTest() throws Exception {
        Long employerId = 789L;
        ResponseEntity<Employer> responseEntity = api.getemployerDetails(employerId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
