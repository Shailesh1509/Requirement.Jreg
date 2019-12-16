package com.java.mobiliya.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.mobiliya.entity.RegDTO;




@Repository
public interface RegDTOService extends JpaRepository< RegDTO, Long> {


}
