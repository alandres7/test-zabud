package com.zabud.test.testzabud.consumer.dto;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UniversityMapper {

    public List<String> map(University[] universities){
        return Arrays.asList(universities).stream().map(university -> university.getName())
                .collect(Collectors.toList());
    }
}
