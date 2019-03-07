package cn.dream.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.dream.entity.Area;
import cn.dream.service.AreaService;
import io.swagger.annotations.ApiOperation;

/**
 * @author 18396
 *
 */
@RestController
@RequestMapping(value = "test")
public class HaiController {
	@Autowired
	AreaService service;

	@ApiOperation(value = "hello", notes = "say hai")
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> hello(@RequestParam(value = "name") String name) {
		List<Area> list = service.findAllArea();
		System.out.println(list.size() + "   " + name);
		return new ResponseEntity<String>("hay", HttpStatus.OK);
	}
	
	@ApiOperation(value = "save", notes = "saveArea")
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Integer> putArea(@RequestBody Area area) {
		int i = service.insertArea(area);
		return new ResponseEntity<Integer>(i, HttpStatus.OK);
	}
}
