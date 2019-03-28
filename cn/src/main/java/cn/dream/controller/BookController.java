package cn.dream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.dream.entity.BookNote;
import cn.dream.service.BookNoteService;
import io.swagger.annotations.ApiOperation;

/**
 * @author xx
 *
 */
@RestController
@RequestMapping(value = "book")
public class BookController {
	@Autowired
	private BookNoteService bookNoteService;
	
	@ApiOperation(value = "insertBook", notes = "createNewBook")
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> instertBook(@RequestBody BookNote bookNote) {
		int createBook = bookNoteService.createBook(bookNote);
		if(createBook>0) {
			return new ResponseEntity<String>("create success", HttpStatus.OK);
		}
		return new ResponseEntity<String>("filed", HttpStatus.OK);
	}
}
