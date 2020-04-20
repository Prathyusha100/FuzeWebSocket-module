package com.application.site.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.site.service.SiteProjectsService;

@RestController
@RequestMapping(value = "/siteProjects")
public class SiteProjectController {

	@Autowired
	private SiteProjectsService siteProjectsService;

	@GetMapping(value = "/getSiteProjectFieldChanges")
	public Map<String, Object> getSiteProjectFieldChanges() {
		return siteProjectsService.getSiteProjectFieldChanges();
	}

	@GetMapping(value = "/getLatestPoRequestHistory")
	public Map<String, Object> getLatestPoRequestHistory() {
		return siteProjectsService.getLatestPoRequestHistory();
	}

}
