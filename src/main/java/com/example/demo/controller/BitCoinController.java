package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ComputeResult;

@RestController
@Controller
public class BitCoinController {

	@Autowired
	ComputeResult compute;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index(Model model) {
		return "welcome";
	}

	@PostMapping("/getData")
	public String bitCoinDataGet(@RequestParam("fromDate") String fromDate, @RequestParam("toDate") String toDate,
			@RequestParam("currecny") String currecny, Model model) {
		
		String result = compute.getResult(fromDate, toDate, currecny);

		return "welcome";
	}

}
