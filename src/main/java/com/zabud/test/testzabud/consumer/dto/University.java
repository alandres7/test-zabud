package com.zabud.test.testzabud.consumer.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class University {


    @JsonProperty("state-province")
    private String stateProvince;
    private String country;
    private String name;
    @JsonProperty("web_pages")
    private List<String> webPages;
    private List<String> domains;
    @JsonProperty("alpha_two_code")
    private String alphaTwoCode;
}
