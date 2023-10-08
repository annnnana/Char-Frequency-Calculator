package com.charfrequencycalc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FrequencyResponseDTO {

    private char character;

    private int frequency;

}
