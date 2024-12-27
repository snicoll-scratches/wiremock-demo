package com.example.demo;

import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo;
import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.junit.jupiter.api.Test;

@WireMockTest
class WiremockDemoTests {

	@Test	
	void contextLoads(WireMockRuntimeInfo info) {
		System.out.println(info.getHttpBaseUrl());
	}

}
