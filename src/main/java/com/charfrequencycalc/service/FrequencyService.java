package com.charfrequencycalc.service;

import com.charfrequencycalc.dto.FrequencyRequestDTO;
import com.charfrequencycalc.dto.FrequencyResponseDTO;

import java.util.List;

public interface FrequencyService {
    List<FrequencyResponseDTO> calculateFrequency(FrequencyRequestDTO request);
}
