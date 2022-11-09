package com.example.signlanguage.Prediction;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class RestAPICall implements RestAPI{
    @Override
//    @RequestMapping("/test")
    public String Get(@RequestParam String str) {
        return str+ "Test 됨";
    }

    @Override
//    @RequestMapping("/get_prediction")
	@GetMapping("/get_prediction")
    public void GetCall(@RequestBody Map<String, Object> requestData) {
//        // RestTemplate 에 MessageConverter 세팅
//        List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
//        converters.add(new FormHttpMessageConverter());
//        converters.add(new StringHttpMessageConverter());

//        final String url = "http://127.0.0.1:5500/test";
//        RestTemplate restTemplate = new RestTemplate();
//
//        // header
//        HttpHeaders httpHeaders = new HttpHeaders();
//        HttpEntity<?> entity = new HttpEntity<>(httpHeaders);
//        // httpHeaders.setContentType(MediaType.APPLICATION_JSON);
//
//        // Body
////        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
////        body.add("prediction", "this is test");
//
//        // Message
//        HttpEntity<?> requestMessage = new HttpEntity<>(httpHeaders);
//
//        // request
//        HttpEntity<?> response = restTemplate.exchange(url, HttpMethod.GET,entity, Object.class);
////        HttpEntity<String> response = restTemplate.postForEntity(url, requestMessage, String.class);
//
//        // response parsing
//        ObjectMapper objectMapper = new ObjectMapper();
//        // objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
////        System.out.println(response.getStatusCodeValue());
//        System.out.println(response);
//        System.out.println(response.getBody());
		System.out.println("gettest");
		requestData.forEach((key, value) -> {
			System.out.println("key = " + key);
			System.out.println("value = " + value);
			// System.out.println(value);
		});
    }

	@Override
	public void Post() {

	}

	@Override
	@PostMapping("/get_predictions")
    public void PostTest(@RequestBody Map<String, Object> requestData){
		System.out.println("testtest");
		requestData.forEach((key, value) -> {
			System.out.println("key = " + key);
			System.out.println("value = " + value);
			System.out.println(value);
		});
    }

//    @Override
//    @PostMapping("/get_predictions")
//    public void test(@RequestBody Map<String, Object> requestData) {
//        System.out.println("testtest");
//        requestData.forEach((key, value) -> {
//            System.out.println("key = " + key);
//            System.out.println("value = " + value);
//            System.out.println(value);
//        });
////        System.out.println(prediction + " 예측했습니다.");
////        System.out.println(request.getParameter("prediction"));
//    }
}
