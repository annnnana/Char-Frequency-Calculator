package com.charfrequencycalc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CharFrequencyCalcApplication {

	public static void main(String[] args) {
		final String simpleName = CharFrequencyCalcApplication.class.getSimpleName();
		log.info("Запуск приложения {}", simpleName);
		SpringApplication.run(CharFrequencyCalcApplication.class, args);
		log.info("Приложение {} запущено", simpleName);
	}

}
