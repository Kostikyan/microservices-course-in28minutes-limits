package com.in28minutes.microservices.limitsservice.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Limits {
    private int minimum;
    private int maximum;
}
