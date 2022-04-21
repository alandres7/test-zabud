package com.zabud.test.testzabud.consumer;

import reactor.core.publisher.Mono;

import java.util.List;

public interface UniversityService {

    Mono<List<String>> getuniversities(String country );

}
