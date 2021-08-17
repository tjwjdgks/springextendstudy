package com.seo.springextend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.unit.DataSize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChickenController {

    @Value("${chicken.size}")
    private DataSize chickenSize;
    @GetMapping("/chicken")
    public String Chicken(){
        System.out.println(chickenSize);
        System.out.println(chickenSize.toMegabytes());
        return "chicken";
    }
}
