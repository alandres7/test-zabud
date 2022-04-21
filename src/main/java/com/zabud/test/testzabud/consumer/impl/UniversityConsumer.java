package com.zabud.test.testzabud.consumer.impl;

import com.zabud.test.testzabud.consumer.UniversityService;
import com.zabud.test.testzabud.consumer.dto.University;
import com.zabud.test.testzabud.consumer.dto.UniversityMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class UniversityConsumer implements UniversityService {

    private final WebClient webClient;
    private final UniversityMapper mapper;


    public UniversityConsumer(WebClient webClient, UniversityMapper mapper) {
        this.webClient = webClient;
        this.mapper = mapper;
    }


    @Override
    public Mono<List<String>> getuniversities(String country) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/search")
                        .queryParam("country", country)
                        .build())
                .retrieve()
                .bodyToMono(University[].class)
                .map(mapper::map);
    }
}
