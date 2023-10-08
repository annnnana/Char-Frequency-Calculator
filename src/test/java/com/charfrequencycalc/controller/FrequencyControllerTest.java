package com.charfrequencycalc.controller;

import com.charfrequencycalc.dto.FrequencyRequestDTO;
import com.charfrequencycalc.dto.FrequencyResponseDTO;
import com.charfrequencycalc.service.FrequencyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static com.charfrequencycalc.util.RandomObjectGenerator.generate;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FrequencyController.class)
public class FrequencyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private FrequencyService frequencyService;

    @Test
    public void testCalculateFrequency() throws Exception {
        given(frequencyService.calculateFrequency(any(FrequencyRequestDTO.class)))
                .willReturn(Collections.singletonList(new FrequencyResponseDTO()));
        String dataJson = objectMapper.writeValueAsString(generate(FrequencyRequestDTO.class));
        mockMvc.perform(post("/calculate-frequency")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(dataJson)
                        .accept(MediaType.APPLICATION_JSON_VALUE))
                .andDo(print()).andExpect(status().isOk());
    }

}






