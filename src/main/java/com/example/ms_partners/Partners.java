package com.example.ms_partners;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Partners {
    @Id
    @GeneratedValue
    private Integer id;
    private String partnersName;
    private String link;
    private String email;
    private Integer eventId;
}
