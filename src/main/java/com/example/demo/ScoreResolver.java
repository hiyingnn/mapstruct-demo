package com.example.demo;

import org.mapstruct.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScoreResolver {

  @Autowired
  ScholarRepository scholarRepository;

//  @ObjectFactory
  public Score resolve(Long referenceId) {
    return scholarRepository.getScoreByScholarId(referenceId);
  }
}
