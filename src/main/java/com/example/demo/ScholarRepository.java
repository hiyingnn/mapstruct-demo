package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ScholarRepository {
    final Map<Long, Score> gradesStore;

    ScholarRepository() {
        this.gradesStore = Map.of
                (1L, new Score(90F, "Math"),
                        2L, new Score(70F, "English"),
                        3L, new Score(55F, "Chinese"),
                        4L, new Score(20F, "Science"));
    }

    Score getScoreByScholarId(Long scholarId) {
        return gradesStore.get(scholarId);
    }
}
