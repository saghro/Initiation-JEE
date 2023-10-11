package com.jee.saghro.dao;

import java.util.List;
import com.jee.saghro.bean.Course;


public interface IListeCoursesDAO {
	
    List<Course> rechercherCourses();
}