package cn.dream.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dream.entity.BookNote;
import cn.dream.mapper.BookNoteMapper;
import cn.dream.service.BookNoteService;

/**
 * @author xx
 *
 */
@Service
public class BookNoteSeviceImpl implements BookNoteService {
	@Autowired
	private BookNoteMapper bookNoteMapper;
	@Override
	public int createBook(BookNote bookNote) {
		int i = bookNoteMapper.insterBookNote(bookNote);
		return i;
	}

}
