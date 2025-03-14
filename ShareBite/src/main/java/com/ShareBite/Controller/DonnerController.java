package com.ShareBite.Controller;
import com.ShareBite.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ShareBite.Entity.*;
import java.util.List;

@RestController
@RequestMapping("/api/dooner")
public class DonnerController {


    @Autowired
    private DoonerService  donnerService;


    @PostMapping
    public Donnor addDonnor( @RequestBody Donnor donnor){

        return donnerService.saveDonner(donnor);
    }


    @GetMapping
    public List<Donnor> findAll(){

        return donnerService.findAll();

    }





}
