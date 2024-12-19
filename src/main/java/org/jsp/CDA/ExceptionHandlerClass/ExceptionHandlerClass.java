package org.jsp.CDA.ExceptionHandlerClass;

import org.jsp.CDA.ResponseStrcture.ResponseStrcture;
import org.jsp.CDA.exceptionClass.InvalidAdminIdException;
import org.jsp.CDA.exceptionClass.InvalidCourseIdException;
import org.jsp.CDA.exceptionClass.InvalidCredentialsException;
import org.jsp.CDA.exceptionClass.InvalidDepartmentIdException;
import org.jsp.CDA.exceptionClass.InvalidEnrollmentIdException;
import org.jsp.CDA.exceptionClass.InvalidFacultyIdException;
import org.jsp.CDA.exceptionClass.InvalidStudentIdException;
import org.jsp.CDA.exceptionClass.InvalidUserIdException;
import org.jsp.CDA.exceptionClass.NoCourseFoundException;
import org.jsp.CDA.exceptionClass.NoDepartmentFoundException;
import org.jsp.CDA.exceptionClass.NoEnrollmentsFoundException;
import org.jsp.CDA.exceptionClass.NoFacultyFoundException;
import org.jsp.CDA.exceptionClass.NoUsersFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerClass {

	
	@ExceptionHandler(InvalidStudentIdException.class)
	public ResponseEntity<?> invalidStudentIdException(InvalidStudentIdException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check id").body("invalid id").build());
	}
	@ExceptionHandler(InvalidCredentialsException.class)
	public ResponseEntity<?> invalidCredentialsException(InvalidCredentialsException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check credentials").body("invalid username and pasword").build());
	}
	
	@ExceptionHandler(InvalidFacultyIdException.class)
	public ResponseEntity<?> invalidFacultytIdException(InvalidFacultyIdException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check id").body("invalid id").build());
	}
	@ExceptionHandler(InvalidUserIdException.class)
	public ResponseEntity<?> invalidUserIdException(InvalidUserIdException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check id").body("invalid id").build());
	}
	
	
	@ExceptionHandler(InvalidAdminIdException.class)
	public ResponseEntity<?> invalidAdminIdException(InvalidAdminIdException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check id").body("invalid id").build());
	}
	
	
	@ExceptionHandler(InvalidCourseIdException.class)
	public ResponseEntity<?> invalidCourseIdException(InvalidCourseIdException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check id").body("invalid id").build());
	}
	
	@ExceptionHandler(InvalidDepartmentIdException.class)
	public ResponseEntity<?> invalidDepartmentIdException(InvalidDepartmentIdException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check id").body("invalid id").build());
	}
	
	@ExceptionHandler(InvalidEnrollmentIdException.class)
	public ResponseEntity<?> invalidEnrollmentIdException(InvalidEnrollmentIdException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("check id").body("invalid id").build());
	}
	
	@ExceptionHandler(NoUsersFoundException.class)
	public ResponseEntity<?> noUsersFoundException(NoUsersFoundException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("no users found").body("empty list").build());
	}
	
	@ExceptionHandler(NoEnrollmentsFoundException.class)
	public ResponseEntity<?> noEnrollmentsFoundException(NoEnrollmentsFoundException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("no enrollments found").body("empty list").build());
	}
	@ExceptionHandler(NoFacultyFoundException.class)
	public ResponseEntity<?> noFoundFacultyException(NoFacultyFoundException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("no faculty found").body("empty list").build());
	}
	@ExceptionHandler(NoDepartmentFoundException.class)
	public ResponseEntity<?> noDepartmentFoundException(NoDepartmentFoundException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("no users found").body("empty list").build());
	}
	
	@ExceptionHandler(NoCourseFoundException.class)
	public ResponseEntity<?> noCourseFoundException(NoCourseFoundException e){
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
				body(ResponseStrcture.builder().httpStatus(HttpStatus.BAD_REQUEST.value()).
						message("no users found").body("empty list").build());
	}
	
	
}
