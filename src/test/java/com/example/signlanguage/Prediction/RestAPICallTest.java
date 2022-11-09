package com.example.signlanguage.Prediction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class RestAPICallTest {

	@Test
	@DisplayName("예측결과 확인")
	@PostMapping("/get_predictions")
	void postTest(@RequestBody Map<String, Object> requestData) {
		requestData.forEach((key, value) -> {
			assertThat(key).isEqualTo("prediction");
			System.out.println("value = " + value);
			assertThat(value).isEqualTo("default");

		});
	}
}
