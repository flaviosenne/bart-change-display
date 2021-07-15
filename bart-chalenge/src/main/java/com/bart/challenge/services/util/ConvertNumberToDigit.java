package com.bart.challenge.services.util;

import org.springframework.stereotype.Service;

@Service
public class ConvertNumberToDigit {

    public String execute(Integer source){
        String sourceToString = source.toString();

        String[] sources = sourceToString.split("");
        String[][] sourcesDigit = new String[3][10];

        String sourcesFormatted = "";

        sourcesDigit[0][0] = " _  ";
        sourcesDigit[1][0] = "| | ";
        sourcesDigit[2][0] = "|_| ";

        sourcesDigit[0][1] = "   ";
        sourcesDigit[1][1] = "|  ";
        sourcesDigit[2][1] = "|  ";

        sourcesDigit[0][2] = " _  ";
        sourcesDigit[1][2] = " _| ";
        sourcesDigit[2][2] = "|_  ";

        sourcesDigit[0][3] = " _  ";
        sourcesDigit[1][3] = " _| ";
        sourcesDigit[2][3] = " _| ";

        sourcesDigit[0][4] = "    ";
        sourcesDigit[1][4] = "|_| ";
        sourcesDigit[2][4] = "  | ";

        sourcesDigit[0][5] = " _  ";
        sourcesDigit[1][5] = "|_  ";
        sourcesDigit[2][5] = " _| ";

        sourcesDigit[0][6] = " _  ";
        sourcesDigit[1][6] = "|_  ";
        sourcesDigit[2][6] = "|_| ";

        sourcesDigit[0][7] = " _  ";
        sourcesDigit[1][7] = "  | ";
        sourcesDigit[2][7] = "  | ";

        sourcesDigit[0][8] = " _  ";
        sourcesDigit[1][8] = "|_| ";
        sourcesDigit[2][8] = "|_| ";

        sourcesDigit[0][9] = " _  ";
        sourcesDigit[1][9] = "|_| ";
        sourcesDigit[2][9] = " _| ";


        String line = "";
        for(int i = 0; i < 3; i++) {
            for(int j = 0 ; j < sources.length; j++){
                line += sourcesDigit[i][Integer.parseInt(sources[j])];
            }
            sourcesFormatted += line + "\n";
            line = "";
        }
        return sourcesFormatted;
    }
}