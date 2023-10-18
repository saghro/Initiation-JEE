package com.jee.saghro.services;

import java.util.List;
import com.jee.saghro.bean.Course;

public interface IServiceListeCourses {
      List<Course> rechercherCourses();
      void creerCourse(final String pLibelle, final Integer pQuantite);
}