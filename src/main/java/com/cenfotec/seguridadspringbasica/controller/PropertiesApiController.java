package com.cenfotec.seguridadspringbasica.controller;

import com.cenfotec.seguridadspringbasica.domian.Property;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PropertiesApiController {

    @GetMapping("/properties")
    public List<Property> getAllProperties() {
        ArrayList<Property> result = new ArrayList<>();
        result.add(new Property());
        return result;
    }
}
