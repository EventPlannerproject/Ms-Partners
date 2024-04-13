package com.example.ms_partners;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartnersRepository extends JpaRepository <Partners,Integer>{
    List<Partners> findAllByEventId(Integer eventId);
}
