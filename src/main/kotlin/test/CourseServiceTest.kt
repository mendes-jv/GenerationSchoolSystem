package test

import model.Course
import model.Module
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import service.CourseService

internal class CourseServicesTest {

    private val courseService = CourseService()
    private val courseTest = Course("3004","Mobile Jr.",4, Module("123","first module","first semester's module"))

    @Test
    fun getCourse() {
        courseService.registerCourse(courseTest)
        assertNotEquals(null, courseService.getCourse("3004"))
    }
}