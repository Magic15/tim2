package com.example.tim.Controllers;

import com.example.tim.Services.AverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AverageController
{
    private final AverageService demoService;

    @Autowired
    public AverageController(AverageService demoService)
    {
        this.demoService = demoService;
    }


    @RequestMapping(value="/average/{firstNameIds}", method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Float> test(@PathVariable Integer[] firstNameIds)
    {
        return new ResponseEntity<Float>(demoService.countAverage(firstNameIds), HttpStatus.OK);
    }
}
