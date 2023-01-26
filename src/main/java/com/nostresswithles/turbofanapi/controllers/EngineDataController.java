package com.nostresswithles.turbofanapi.controllers;


import java.util.List;

import com.nostresswithles.turbofanapi.exception.ResourceNotFoundException;
import com.nostresswithles.turbofanapi.models.EngineData;
import com.nostresswithles.turbofanapi.repository.EngineDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.text.SimpleDateFormat;
import java.util.Date;



@RestController
@RequestMapping("/api/v1")
public class EngineDataController {
    @Autowired
    private EngineDataRepository engineDataRepository;
    private static final Logger log = LoggerFactory.getLogger(EngineDataController.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @GetMapping("/avg")
    public List<EngineData> getAllEngineData() throws InterruptedException {
        test_method();
        log.info("getAllEngineData: {}", dateFormat.format(new Date()));
        return engineDataRepository.findAll();
    }
    //next step post result in database

    public static void test_method() throws InterruptedException {
        log.info("Successfully kicked off test method: {}", dateFormat.format(new Date()));
        Thread.sleep(5000);
    }



}
