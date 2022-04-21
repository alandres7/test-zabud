package com.zabud.test.testzabud;

import com.zabud.test.testzabud.consumer.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/zabud")
@RequiredArgsConstructor
public class rest {
    private final UniversityService universityService;

    @GetMapping("/{country}/universities")
    public Mono<List<String>> getUniversities(@PathVariable("country") String country){
        return universityService.getuniversities(country);
    }
}
