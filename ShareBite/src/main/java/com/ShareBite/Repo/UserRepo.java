package com.ShareBite.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ShareBite.Entity.*;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Donnor,Long> {


    Donnor findByEmail(String email);
}
