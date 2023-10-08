package com.charfrequencycalc.service;

import com.charfrequencycalc.dto.FrequencyRequestDTO;
import com.charfrequencycalc.dto.FrequencyResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
public class FrequencyServiceImpl implements FrequencyService {

    /**
     * Вычисление частоты встречающихся символов в заданной строке
     *
     * @param request {@link FrequencyRequestDTO} входная строка.
     * @return {@link List<FrequencyResponseDTO>} список с отсортированной частотой символов.
     *
     * Пример входной строки: "aaaaabcccc"
     * Пример выходного результата: "a": 5, "c": 4, "b": 1
     */
    @Override
    public List<FrequencyResponseDTO> calculateFrequency(FrequencyRequestDTO request){

        String inputString = request.getInputString();

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<FrequencyResponseDTO> resultList = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            resultList.add(new FrequencyResponseDTO(entry.getKey(), entry.getValue()));
        }

        resultList.sort(Comparator.comparingInt(FrequencyResponseDTO::getFrequency).reversed());

        return resultList;
    }

}
