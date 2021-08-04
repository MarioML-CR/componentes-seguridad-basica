package com.cenfotec.seguridadspringbasica.controller;

import com.cenfotec.seguridadspringbasica.domian.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConfigurationController {

    @GetMapping("/configuracion")
    public List<Configuration> getConfiguracion(){
        ArrayList<Configuration> result = new ArrayList<>();
        result.add(new Configuration());
        result.add(new Configuration());
        return result;
    }
}
