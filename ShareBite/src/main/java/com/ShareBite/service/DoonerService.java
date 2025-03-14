package com.ShareBite.service;
import com.ShareBite.Entity.*;
import com.ShareBite.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoonerService {



    @Autowired
    private UserRepo userRepo;


public List<Donnor> findAll (){


    return userRepo.findAll();
}

public Donnor saveDonner(Donnor dooner){

    return userRepo.save(dooner);
}





}
