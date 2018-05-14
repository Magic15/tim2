package com.example.tim.Controllers;

import com.example.tim.Services.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController
{
    private final ListService listService;

    @Autowired
    public ListController(ListService listService)
    {
        this.listService = listService;
    }

    @RequestMapping(value = "getList/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Integer>> getList2(@PathVariable int id)
    {
        return new ResponseEntity<List<Integer>>(listService.getList(id), HttpStatus.OK);
    }
}
