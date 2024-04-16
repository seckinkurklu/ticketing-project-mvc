package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    private Long id;
    private LocalDateTime instertDateTime;
    private Long insertUserId;
    private LocalDateTime lastUpdateTime;
    private Long lastUpdateUserId;
}
