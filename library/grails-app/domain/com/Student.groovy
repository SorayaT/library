package com

class Student {
	String name
	String email
	String studentId
	String course

	String toString(){
		"$name, $email, $studentId, $course"
	}

    static constraints = {
    }
}