package com.Dealer.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dealer.model.Dealer;
import com.Dealer.service.DealerService;

@RestController
	@RequestMapping("/dealer")
	public class DealerController
	{
	@Autowired
	private DealerService dealerservice;
	//@Autowired
//	private Environment env;
	//	@GetMapping("/status/check")
	//	public String status()
	//	{
	//	return "Working.." + env.getProperty("local.server.port");
	//	}
	//	@PostMapping("/createdealer")
	//	public String createDealer( @RequestBody Dealer dealer)
	//	{
	//		return "Create Dealer Method is Called";
	//	}
		
		@GetMapping("/findall")
		public List<Dealer> getAllDealers()
		{
			return dealerservice.getAllDealers();
		}
		@PutMapping("/updatedealer/{id}")
		public void updatedealer(@PathVariable String id ,@RequestBody Dealer dealer)
		{
		dealerservice.updatedealer(id,dealer);
		}
		@PostMapping("/adddealer")
		public void adddealer(@RequestBody Dealer dealer)
		{
			dealerservice.adddealer(dealer);
		}
		@DeleteMapping("/deletedealer/{id}")
		public void deletedealer(@PathVariable String id)
		{
			dealerservice.deletedealer(id);
		}
		
	}


