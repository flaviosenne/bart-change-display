package com.bart.challenge.services;


import com.bart.challenge.domain.Displayer;
import com.bart.challenge.dto.ResponseDto;
import com.bart.challenge.exception.ServerErrorException;
import com.bart.challenge.services.util.ConvertNumberToDigit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DisplayerService {

    @Autowired
    private ConvertNumberToDigit convertNumberToDigit;

    public ResponseEntity<ResponseDto> show(Displayer displayer){

        try{
            String digit = convertNumberToDigit.execute(displayer.getSource());

            System.out.println(digit);

            return ResponseEntity.status(200).body(
                    ResponseDto.builder().message("deu certo").build());

        }catch (Exception e){
            throw new ServerErrorException("erro na digitalização dos numeros");
        }
    }
}
