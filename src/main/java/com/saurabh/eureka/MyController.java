package com.saurabh.eureka;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	@Value("${server.port}")
	String port;
	ResponseData responseData=new ResponseData();
	
	@RequestMapping(value="/getMovieDescription", method=RequestMethod.GET)
	public ResponseData getDescription()
	{
		System.out.println("port of service called:"+port);
//		System.out.println("body of service called:"+body);
//		System.out.println("header of service called:"+header);
		List<Movie> listMovie= Arrays.asList(
				new Movie(101,"Transformers","Hollywoord"),
				new Movie(102,"badla","tollywood")
				); 
		responseData.setListMovie(listMovie);
		return responseData;
	}

}
