package com.foodie.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginSession {
	
	@Id
    @Column(unique = true)
    private Integer userId;


    private String uuid;

    private LocalDateTime localDateTime;

}
