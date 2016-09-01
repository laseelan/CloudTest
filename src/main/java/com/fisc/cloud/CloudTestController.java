package com.fisc.cloud;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CloudTestController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello() throws Exception{
		InetAddress ip = InetAddress.getLocalHost();
		return String.format("Hello from Cloud (Served by %s)", ip.getHostAddress());
	}
}
