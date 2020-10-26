package org.study.javanames.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.javanames.bean.Name;

@RestController
public class NameController {

	@CrossOrigin
	@GetMapping(path = "/myname", produces = MediaType.APPLICATION_JSON_VALUE)
	public Name getName() {
		return new Name("Kunal Neeli");
	}

}
