package com

class Library {
	String location
	String openingHours
	Book book
	Student student
	Librarian librarian


	String toString(){
		"$location, $openingHours, $book, $student, $librarian"	
	}

    static constraints = {
	location()
	openingHours()
	book()
	student()
	librarian()
    }
}
