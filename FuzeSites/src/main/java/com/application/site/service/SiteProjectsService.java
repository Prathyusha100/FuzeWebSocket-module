package com.application.site.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.application.site.entity.SiteProjectsFieldChanges;
import com.application.site.repository.SiteProjectsFieldChangesRepository;

@Service
public class SiteProjectsService {

	private static final Logger LOGGER = LogManager.getLogger(SiteProjectsService.class);

	@Autowired
	private SiteProjectsFieldChangesRepository siteProjectsFieldChangesRepository;

	public Map<String, Object> getSiteProjectFieldChanges() {
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			List<SiteProjectsFieldChanges> dbSiteProjectsFieldChanges = siteProjectsFieldChangesRepository.findAll();
			List<Map<String, Object>> mapList = new ArrayList<>();
			if (!CollectionUtils.isEmpty(dbSiteProjectsFieldChanges)) {
				for (SiteProjectsFieldChanges row : dbSiteProjectsFieldChanges) {
					Map<String, Object> mapData = new HashMap<String, Object>();
					mapData.put("SITE_PROJECTS_FIELD_CHANGES_ID", row.getSiteProjectsFieldChangesId());
					mapData.put("SITE_PROJECTS_ID", row.getSiteProjectsId());
					mapData.put("SITE_INFO_ID", row.getSiteInfoId());
					mapData.put("FIELD_NAME", row.getFieldName());
					mapData.put("FIELD_VALUE", row.getFieldValue());
					mapData.put("SOURCE", row.getSource());
					mapData.put("LAST_MODIFIED_BY", row.getLastModifiedBy());
					mapData.put("LAST_MODIFIED_DATE", row.getLastModifiedDate());
					mapList.add(mapData);
				}
				response.put("status", 1);
				response.put("data", mapList);
			} else {
				response.put("status", 0);
				response.put("message", "No Data Found!");
				LOGGER.info("No Data Available!");
			}
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.info("Failed to load the Site Projects Field Changes.!");
		}
		return response;
	}

	public Map<String, Object> getLatestPoRequestHistory() {
		Map<String, Object> response = new HashMap<String, Object>();
		return response;
	}

}
