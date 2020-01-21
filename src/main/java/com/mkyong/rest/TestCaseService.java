package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.mkyong.dto.TestCase;

@Component
@Path("/tc")
public class TestCaseService {

	@GET
	@Path("/getTCById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TestCase getTestCaseById(@PathParam("id") String id) {
		System.out.println("ID:"+id);
		TestCase tc = new TestCase();
		tc.setId("1000");
		tc.setName("Test_1000");
		tc.setResult("PASS");
		return tc;
		//return Response.status(Status.OK).entity(tc).type(MediaType.APPLICATION_JSON).build();
	}
	@POST
	@Path("/createTC")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveTestCase(TestCase testcase) {
		
		System.out.println(testcase.getId());
		System.out.println(testcase.getName());
		System.out.println(testcase.getResult());
		return Response.status(Status.OK).entity(true).type(MediaType.APPLICATION_JSON).build();
	}
	
}
