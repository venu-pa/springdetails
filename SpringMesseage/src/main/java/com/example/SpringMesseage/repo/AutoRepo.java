package com.example.SpringMesseage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringMesseage.ent.Auto;
import com.sun.xml.bind.v2.model.core.ID;

public interface AutoRepo  extends JpaRepository<Auto, ID>{

}
