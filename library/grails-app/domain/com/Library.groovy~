package com

class Library {
	String location
	String openingHours
	String book
	String student
	String librarian

	static hasMany=[librarians:Librarian]

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
