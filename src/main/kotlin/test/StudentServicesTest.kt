package test

import model.Student
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import service.StudentService

internal class ServicesTest {

    private val studentService = StudentService()
    private val studentTest = Student("456","Johnny","johnny@gmail.com", null)

    @Test
    fun isSubscribed() {
        studentService.subscribeStudent(studentTest)
        assertNotEquals(false, studentService.isSubscribed("456"))
    }
}