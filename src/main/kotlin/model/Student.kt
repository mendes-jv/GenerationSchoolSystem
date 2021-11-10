package model

import java.util.*

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: MutableList<Course> = ArrayList()
    private val approvedCourses: MutableMap<String?, Course?> = HashMap()

    override fun getAverage(): Double {
        return average
    }

    fun enrollToCourse(course: Course?) {
        courses.add(course!!)
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        return approvedCourses.containsKey(courseCode)
    }

    fun isAttendingCourse(courseCode: String): Boolean {
        return courses.any { it.code == courseCode }
    }

    override fun getApprovedCourses(): ArrayList<Course> {
        return ArrayList(approvedCourses.values)
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}
