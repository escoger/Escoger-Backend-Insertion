package com.escoger.backend.insertion.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.escoger.backend.insertion.service.BackendInsertionService;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class BackendInsertionController {
	private static final Logger logger = LoggerFactory.getLogger(BackendInsertionController.class);
	
	
	BackendInsertionService backendInsertionService;

	@Autowired
	public BackendInsertionController(BackendInsertionService backendInsertionService) {
		this.backendInsertionService = backendInsertionService;
	}

	/*@GetMapping	("/All")
	public ObjectNode getAllSearchBasedOnKey() {
		//ObjectNode objectNode = searchService.getAllSearchBasedOnKey();
		return objectNode;
	}*/

}
