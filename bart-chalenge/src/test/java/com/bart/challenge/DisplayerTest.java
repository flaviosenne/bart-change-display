package com.bart.challenge;

import static org.assertj.core.api.Assertions.assertThat;

import com.bart.challenge.services.util.ConvertNumberToDigit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class DisplayerTest {

	@Autowired
	private ConvertNumberToDigit digit;

	
	@Test
	public void shouldReturn0OnDisplayFormmat() {
		
//		String displayed = digit.execute(0);
//
//		String expected = "  _ \n"
//				        + " | |\n"
//				        + " |_|\n";
//
//		assertThat(displayed).isEqualTo(expected);
	}
	
	@Test
	public void shouldReturn123OnDisplayFormmat() {
		
//		String displayed = digit.execute(123);
//
//		String expected = "    _  _ \n"
//				        + " |  _| _|\n"
//				        + " | |_  _|\n";
//
//		assertThat(displayed).isEqualTo(expected);
	}
}
