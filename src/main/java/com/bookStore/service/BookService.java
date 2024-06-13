package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service
public class BookService {

	@Autowired 
	private BookRepository bRepo;
		
	public void save(Book book) {
		bRepo.save(book);
	}	
	
	public List<Book> getAllBook(){
		return bRepo.findAll();
	}
	
	public Book getBookById(long id) {
		return bRepo.findById(id).get();
	}
	
	public void deleteById(long id) {
		bRepo.deleteById(id);
	}
	
	
}
