package com.example.demo;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * Entity object (POJO)
 */
@Data
@SuperBuilder
@NoArgsConstructor
@Getter
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Scholar extends Person {
    private double bursaryAmount;
    private Student student; //for audit
    private String credentials;
    private Score score;
}
