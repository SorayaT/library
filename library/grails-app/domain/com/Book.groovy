package com

class Book {
	String title
	String author
	String isbn
	String dateBorrowed
	String returnDate
	String student
	
	String toString(){
		"$title, $author, $isbn, $dateBorrowed, $returnDate, $student"
	}

    static constraints = {
	title()
	author()
	isbn()
	dateBorrowed()
	returnDate()
	student()
    }
}
