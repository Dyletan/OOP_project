package entities;

import containers.Course;
import data.DataBase;

import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ManagerOR extends Manager{
	DataBase database = DataBase.getInstance();
	
	
	public void approveStudentRegistration() {
		//poka hz
	}
	
	public void assignCourseForTeacher(Course course, Teacher teacher) {
		if(DataBase.getInstance().contains(course) && database.getUsers().contains(teacher)) {
			Map<Course, Vector<Teacher>> teachersByCourse = database.getTeachersByCourse();
			if(teachersByCourse.containsKey(course)) {
				Vector<Teacher> assignedTeachers = teachersByCourse.get(course);
				assignedTeachers.add(teacher);
			}else {
				Vector<Teacher> newAssignedTeachers = new Vector<>();
                newAssignedTeachers.add(teacher);
                teachersByCourse.put(course, newAssignedTeachers);
			}
			database.setTeachersByCourse(teachersByCourse)
		}
	}
	
	
}
