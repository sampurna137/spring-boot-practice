package com.vastika.doctorservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hours {

    @JsonProperty(value = "Sunday")
    private String sunday;

    @JsonProperty(value = "Monday")
    private String monday;

    @JsonProperty(value = "Tuesday")
    private String tuesday;

    @JsonProperty(value = "Wednesday")
    private String wednesday;

    @JsonProperty(value = "Thursday")
    private String thursday;

    @JsonProperty(value = "Friday")
    private String friday;

    @JsonProperty(value = "Saturday")
    private String saturday;
}
