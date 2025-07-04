package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
         return List.of(
                 new SoftwareEngineer(
                         1,
                         "james",
                         "js, node, react, tailwind"
                 ),
                 new SoftwareEngineer(
                         2,
                         "bob",
                         "ts, node, angular, scss"
                 )

         );

    }
}

