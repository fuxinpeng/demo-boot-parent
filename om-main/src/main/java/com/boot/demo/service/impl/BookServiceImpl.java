package com.boot.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.demo.entity.Book;
import com.boot.demo.mapper.BookMapper;
import com.boot.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public List<Book> getBookList() {
		return bookMapper.getList();
	}

}
