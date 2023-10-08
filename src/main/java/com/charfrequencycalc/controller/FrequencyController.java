package com.charfrequencycalc.controller;

import com.charfrequencycalc.dto.FrequencyRequestDTO;
import com.charfrequencycalc.dto.FrequencyResponseDTO;
import com.charfrequencycalc.service.FrequencyService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calculate-frequency")
@AllArgsConstructor
public class FrequencyController {

    private final FrequencyService frequencyService;

    /**
     * REST API, вычисляющий частоту встречи символов в заданной строке.
     *
     * @param request {@link FrequencyRequestDTO} входная строка.
     * @return {@link List<FrequencyResponseDTO>} список, отсортированный
     * по убыванию количества вхождений символа в заданную строку.
     *-------
     * Request body example:
     * {
     *   "inputString": "aaaaabcccc"
     * }
     *
     * Response body example:
     * [
     *     {
     *         "character": "a",
     *         "frequency": 5
     *     },
     *     {
     *         "character": "c",
     *         "frequency": 4
     *     },
     *     {
     *         "character": "b",
     *         "frequency": 1
     *     }
     * ]
     *
     */
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<List<FrequencyResponseDTO>> calculateFrequency(@RequestBody FrequencyRequestDTO request) {
        return ResponseEntity.ok(
                frequencyService.calculateFrequency(request)
        );
    }
}