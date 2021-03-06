package com.durasoft;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/courses")
public class CoursesService {
	private static List<Course> coursesList;
	static {
		coursesList = new ArrayList<Course>();
	}
	
	@GET
	@Path("/show/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Course show(@PathParam("id")int id){
		Course retCourse = null;
		for(Course course : coursesList){
			if(course.getId() == id){
				retCourse = course;
				break;
			}
		}
		return retCourse;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> list(){
		return coursesList;
	}
	
	/*@PUT
	@Path("/add")
	@Consumes (MediaType.APPLICATION_JSON)
	public String add(Course course){
		int id = coursesList.size() + 1;//generating ID
		coursesList.add(new Course(id, course.getName()));
		return course.getName() + " added successfully";
	}*/
	
	/*@POST
	@Path("/add/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String add(@PathParam("name")String name){
		int id = coursesList.size() + 1;//generating ID
		coursesList.add(new Course(id, name));
		return name + " added successfully";
	}*/
	
	/*@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public String add(Course course){
		int id = coursesList.size() + 1;//generating ID
		coursesList.add(new Course(id, course.getName()));
		return course.getName() + " added successfully";
	}*/
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String add(Course course){
		int id = coursesList.size() + 1;//generating ID
		coursesList.add(new Course(id, course.getName()));
		String json = "{\"output\":\"" + course.getName() + " added successfully\"}";
		return json;
	}	
	
}
