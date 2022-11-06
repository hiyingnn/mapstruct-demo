package com.example.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
class Score {
    Float score;
    String subject;

    Score(Float score, String subject){
        this.score = score;
        this.subject = subject;
    }
}
