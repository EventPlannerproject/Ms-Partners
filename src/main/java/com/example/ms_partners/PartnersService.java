package com.example.ms_partners;

import jakarta.servlet.http.Part;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartnersService {


    private final PartnersRepository repository;

    public void savePartner(Partners partners) {
        repository.save(partners);
    }

    public List<Partners> findAllPartners(){
        return repository.findAll();
    }

    public void deletePartnerById(Integer id) {
        repository.deleteById(id);
    }


    public List<Partners> findAllPartnersByEvent(Integer eventId) {
        return repository.findAllByEventId(eventId);
    }


}
