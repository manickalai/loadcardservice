/**
 * 
 */
package com.nublo.loadservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.nublo.loadservice.api.model.LoadCardBalanceRequest;
import com.nublo.loadservice.api.model.LoadForexCardApiResponse;
import com.nublo.loadservice.api.model.LoadForexCardRequest;
import com.nublo.loadservice.services.ILoadCardService;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author DELL
 *
 */
@RestController
public class LoadCardController {

	@Autowired
	private ILoadCardService loadCardBalanceService;
	
	private MeterRegistry meterRegistry;
	
	private Counter counter;
	
	public LoadCardController(MeterRegistry meterRegistry) {
		this.meterRegistry = meterRegistry;
		this.counter = Counter.builder("load_card_failed_request_total").
                tag("version", "v1").
                description("Loac Card Failed count").
                register(meterRegistry);
	}

	@RequestMapping(value = "/loadCard", method = RequestMethod.POST)
	public String loadCard(HttpServletRequest request, HttpServletResponse response, @RequestBody String strCbRequest)
			throws Exception {
		Gson gson = null;
		LoadCardBalanceRequest loadCardBalRequest = null;
		try {
			gson = new Gson();
			loadCardBalRequest = gson.fromJson(strCbRequest, LoadCardBalanceRequest.class);
			loadCardBalanceService.loadCardBalance(loadCardBalRequest);
		} catch (Exception e) {
			e.printStackTrace();
			loadCardBalRequest.setErrorCode("999");
			loadCardBalRequest.setErrDescription("System error");
		}
		if(loadCardBalRequest.getErrorCode().equals("000")) {
			counter.increment();
		}
		strCbRequest = gson.toJson(loadCardBalRequest);
		return strCbRequest;
	}
	
	@RequestMapping(value = "/v1/loadCard", method = RequestMethod.POST)
	public String loadForexCard(HttpServletRequest request, HttpServletResponse response, @RequestBody String strLoadRequest)
			throws Exception {
		Gson gson = null;
		LoadForexCardRequest loadForexCardRequest = null;
		LoadForexCardApiResponse apiResponse = null;
		try {
			gson = new Gson();
			loadForexCardRequest = gson.fromJson(strLoadRequest, LoadForexCardRequest.class);
			apiResponse = loadCardBalanceService.loadForexCard(loadForexCardRequest);
		} catch (Exception e) {
			e.printStackTrace();
			apiResponse.setErrorCode("999");
			apiResponse.setStatusReason("System error");
		}
		/*
		 * if(loadCardBalRequest.getErrorCode().equals("000")) { counter.increment(); }
		 */
		strLoadRequest = gson.toJson(apiResponse);
		return strLoadRequest;
	}
	
	
}
