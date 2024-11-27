package com.ufrgs.tccdownloaderservice.controller;

import com.ufrgs.tccdownloaderservice.importer.TccImporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private TccImporter importer;

    @GetMapping("/api")
    public ResponseEntity<String> download() {
        importer.importTccs();
        return new ResponseEntity<>("Downloaded", null, HttpStatus.ACCEPTED);
    }
}
