package project.gym.services;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import project.gym.dao.IClassSchedule;
import project.gym.pojos.ClassSchedule;

import java.util.List;

	@Service
	public class ClassScheduleService implements IClassScheduleService {
		@Autowired
	    private final IClassSchedule classScheduleDAO;

	    
	    public ClassScheduleService(IClassSchedule classScheduleDAO) {
	        this.classScheduleDAO = classScheduleDAO;
	    }

	    @Override
	    public ClassSchedule getClassScheduleById(Long classId) {
	        return classScheduleDAO.findById(classId).orElse(null);
	    }

	    @Override
	    public List<ClassSchedule> getAllClassSchedules() {
	        return classScheduleDAO.findAll();
	    }

	    @Override
	    public ClassSchedule saveClassSchedule(ClassSchedule classSchedule) {
	        return classScheduleDAO.save(classSchedule);
	    }

	    @Override
	    public void deleteClassSchedule(Long classId) {
	        classScheduleDAO.deleteById(classId);
	    }
	
}
