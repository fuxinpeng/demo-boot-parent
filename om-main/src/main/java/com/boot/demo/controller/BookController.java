package com.boot.demo.controller;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.demo.entity.Book;
import com.boot.demo.service.BookService;
import com.dubbo.test.bean.UserAddress;
import com.dubbo.test.service.UserService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	//@Reference
	private UserService userService;
	
	@GetMapping("/book/list")
	public List<Book> getBookList(){
		return bookService.getBookList();
	}
	
	@GetMapping("/useraddress/list")
	public List<UserAddress> getUserAddressList(String userId){
		return userService.getUserAddressList(userId);
	}
}
