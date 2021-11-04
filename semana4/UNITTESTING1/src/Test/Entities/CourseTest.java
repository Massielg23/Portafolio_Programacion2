package test.Entities;

import org.junit.Test;
  
import Entities.Course;
iport Entities.Teacher;

import static org.junit.Assert.assertEquals;

public class CourseTest{
   @Test
   public void testCourseConstructorId(){
       Course course = new Course(123);
       assertEquals(course.getId(), "Progra II");
   }  
   @Test
   public void testCourseConstructorname(){
    Course course = new Course(123);
    assertEquals(course.getName(), "Progra II");
   }
   @Test
   public void testCourseConstructorIdName(){
    Course course = new Course(123, "Programming II");
    assertEquals(course.getId(), 123);
    assertEquals(course.getName(), "Programming II");
   }
@Test 
public void testTeacherSetter(){
    Teacher teacher = new Teacher();
    teacher.setFirstName("Juan");
    Course course = new Course(1, "Programming II");
    course.setTeacher(teacher);
    assertEquals(course.getTeacher().getFirstName(),"Juan");
}
}

