package com.charfrequencycalc.service;

import com.charfrequencycalc.dto.FrequencyRequestDTO;
import com.charfrequencycalc.dto.FrequencyResponseDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.charfrequencycalc.util.RandomObjectGenerator.generate;
import static org.junit.jupiter.api.Assertions.*;

public class FrequencyServiceTest {

    private FrequencyService frequencyService;

    @BeforeEach
    public void setUp() {
        frequencyService = new FrequencyServiceImpl();
    }

    @Test
    public void calculateFrequency_baseTest() {
        FrequencyRequestDTO request = new FrequencyRequestDTO("aaaaabcccc");
        List<FrequencyResponseDTO> expectedResponse = Arrays.asList(
                new FrequencyResponseDTO('a', 5),
                new FrequencyResponseDTO('c', 4),
                new FrequencyResponseDTO('b', 1)
        );

        List<FrequencyResponseDTO> response = frequencyService.calculateFrequency(request);

        assertNotNull(response);
        assertEquals(expectedResponse.size(), response.size());

        assertEquals(expectedResponse.get(0).getCharacter(), response.get(0).getCharacter());
        assertEquals(expectedResponse.get(0).getFrequency(), response.get(0).getFrequency());

        assertEquals(expectedResponse.get(1).getCharacter(), response.get(1).getCharacter());
        assertEquals(expectedResponse.get(1).getFrequency(), response.get(1).getFrequency());

        assertEquals(expectedResponse.get(2).getCharacter(), response.get(2).getCharacter());
        assertEquals(expectedResponse.get(2).getFrequency(), response.get(2).getFrequency());
    }

    @Test
    public void calculateFrequency_generatedInputString() {
        FrequencyRequestDTO request = generate(FrequencyRequestDTO.class);

        List<FrequencyResponseDTO> response = frequencyService.calculateFrequency(request);

        assertNotNull(response);
    }


}