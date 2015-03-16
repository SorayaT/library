package com

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() {
	when:"A Book has a title, author and isbn"
	def book=new Book(title:'1984', 
		author:'George Orwell',
		isbn:'9780141182957',
		dateBorrowed: new Date('22/02/2015'),
		returnDate: new Date('19/03/2015'),
		student: 'Student Borrowingthisbook'
	then:"the to String methos will merge them."
	book.toString()=='1984, George Orwell, 9780141182957, 22/02/2015, 	19/03/2015, Student Borrowingthisbook'
)
    }
}
