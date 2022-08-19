package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class ParkingControlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingControlApplication.class, args);
    }

    @GetMapping("/")
    public ResponseEntity<List<String>> index() {
        List<String> teste = new ArrayList<>();
        teste.add("Teste");
        teste.add("Teste2");
        teste.add("Teste3");
        teste.add("Teste4");
        teste.add("Teste5");
        return ResponseEntity.ok().body(teste);
    }

}
