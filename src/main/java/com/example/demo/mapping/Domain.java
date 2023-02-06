package com.example.demo.mapping;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Domain {
    String string;
    List<String> list;
    enum Enum {
        A,
        B
    }
    Enum anEnum;



    NestedDomain nested;
}
