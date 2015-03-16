package com

class Student {
	String name
	String email
	String studentId
	Course course
	static hasMany=[books:Book]

	String toString(){
		"$name, $email, $studentId, $course"
	}

    static constraints = {
	name()
	email()
	studentId()
	course()
    }
}
