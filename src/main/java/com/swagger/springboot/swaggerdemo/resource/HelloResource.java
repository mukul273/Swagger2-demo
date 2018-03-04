package com.swagger.springboot.swaggerdemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/hello")
@Api(value="This is Chimps Swagger Demo class level documentation using @Api", description="This is deprecated but Chimp is discovering here.")
public class HelloResource {
	
	@ApiOperation(value="This is for Chimps Swagger Demo describing hello is about just saying hello!! using @ApiOperation")
	@ApiResponses(
			value = {
					@ApiResponse (code=100, message="This is 100 status code response from Chimps Swagger Demo using @ApiResponses/@ApiResponse"),
					@ApiResponse(code=200, message="This is about overriding the 200 code response from Chimps Swagger Demo")
			}
			
	)
	@GetMapping
	public String hello() {
		return "Hello from Chimp's Swagger Demo";
	}
}
