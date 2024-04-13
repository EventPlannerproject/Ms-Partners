package com.example.ms_partners;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partners")
@RequiredArgsConstructor
public class PartnersController {
    private final PartnersService service;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)

    public void save(@RequestBody Partners partners)
    {
        service.savePartner(partners);
    }

    @GetMapping
    public ResponseEntity<List<Partners>> findAllPartners() {
        return ResponseEntity.ok(service.findAllPartners());
    }

    @GetMapping("/event/{event-id}")
    public ResponseEntity<List<Partners>> findAllPartners(@PathVariable("event-id") Integer eventId)
    {
        return ResponseEntity.ok(service.findAllPartnersByEvent(eventId));
    }

    @DeleteMapping("/partners/{id}")
    public void deletePartnerById(@PathVariable Integer id) {
        service.deletePartnerById(id);
    }
}
