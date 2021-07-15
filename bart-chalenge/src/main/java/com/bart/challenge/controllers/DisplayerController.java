package com.bart.challenge.controllers;

import com.bart.challenge.domain.Displayer;
import com.bart.challenge.dto.ResponseDto;
import com.bart.challenge.services.DisplayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/display")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DisplayerController {

    private final DisplayerService displayerService;

    @PostMapping
    public ResponseEntity<ResponseDto> showDisplay(@RequestBody Displayer displayer){
        return displayerService.show(displayer);
    }
}
