package com.fuze.websockets.dao.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fuze.websockets.dao.entity.PORequest;
import com.fuze.websockets.dao.exception.WebSocketDBResourceNotFoundException;
import com.fuze.websockets.dao.service.WebsocketDAOService;


@RestController
@RequestMapping("/websockets/dao")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WebsocketDAOController {

	@Autowired
	private WebsocketDAOService websocketDAOService;

	@GetMapping("/poRequestFields")

	public ResponseEntity<Map<String, Object>> getSiteProjectFieldChanges() {
		
		Map<String, Object>  siteProjectFieldsMap = websocketDAOService.getSiteProjectFieldChanges();
				
		if (siteProjectFieldsMap.isEmpty()) {
			throw new WebSocketDBResourceNotFoundException("No fields Found.");
		}
		return new ResponseEntity<Map<String, Object>>(siteProjectFieldsMap, HttpStatus.OK);
	}
	
	

	@GetMapping("/getLatestPoRequestHistory")

	public Map<String, Object> getLatestPoRequestHistory() {

		return websocketDAOService.getLatestPoRequestHistory();

	}
}
