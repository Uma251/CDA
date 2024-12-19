package org.jsp.CDA.DaoImple;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.jsp.CDA.Dao.FacultyDao;
import org.jsp.CDA.Repository.FacultyRepository;
import org.jsp.CDA.entity.Course;
import org.jsp.CDA.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
@Repository
public class FacultyDaoImple  implements FacultyDao{

	
	@Autowired
	private FacultyRepository facRepo;
	
	@Override
	public Faculty saveFaculty(Faculty faculty) {
		
		return facRepo.save(faculty);
	}

	@Override
	public Optional<Faculty> findFactultyById(int fid) {
		
		return facRepo.findById(fid);
	}

	@Override
	public List<Faculty> findAllFaculty() {
		
		return facRepo.findAll();
	}

	@Override
	public Faculty setTimeToFaculty(int fid,  LocalTime officeHours) {
		
		return facRepo.setTimeToFaculty(fid, officeHours);
	}

	public void deleteFacultyById(int id) {
		
		facRepo.deleteById(id);
	}

	
	
	
	
	
}
