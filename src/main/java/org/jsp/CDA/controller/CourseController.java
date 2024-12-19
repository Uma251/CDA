package org.jsp.CDA.controller;
import org.jsp.CDA.entity.Course;
import org.jsp.CDA.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping
	public ResponseEntity<?> saveCourse(@RequestBody Course course){
		
		
		return courseService.saveCourse(course);
		
		
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<?> findCourseById(@PathVariable int id){
		
		return courseService.findCourseById(id);
	}
	
	@GetMapping("/findall")
public ResponseEntity<?> findAllCourse(){
		
		return courseService.findAllCourse();
	}
	
	@PatchMapping("/{fid}/{cid}")
	public ResponseEntity<?> assignCourseToFaculty(@PathVariable int fid,@PathVariable int cid){
		
		return courseService.assignCourseToFaculty(fid,cid);
	}
	
	@PatchMapping("/department/{cid}/{did}")
	public ResponseEntity<?> setDepartmentToCourse(@PathVariable int cid,@PathVariable int did){
		
		return  courseService.setDepartmentToCourse(cid,did);
	}
	
	
	@DeleteMapping("/{id}")
	public String deleteCourseById(@PathVariable int id) {
		return courseService.deleteCourseById(id);
		
	}
	
	
}
