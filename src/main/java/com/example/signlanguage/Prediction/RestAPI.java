package com.example.signlanguage.Prediction;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

public interface RestAPI {

    String Get(String str);

    void GetCall(Map<String, Object> map);

    void Post();


	void PostTest(@RequestBody Map<String, Object> requestData);
}
