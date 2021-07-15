package com.bart.challenge.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Displayer {

	@JsonProperty(value = "source")
	private Integer source;

}
