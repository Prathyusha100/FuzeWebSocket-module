package com.fuze.websockets.dao.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.fuze.websockets.dao.entity.PORequest;
import com.fuze.websockets.dao.entity.PORequestHistory;
import com.fuze.websockets.dao.repository.PORequestHistoryRepository;
import com.fuze.websockets.dao.repository.PORequestRepository;

/**
 * @author Bhajuram.c
 *
 */
@Service
public class WebsocketDAOService {

	private static final Logger LOGGER = LogManager.getLogger(WebsocketDAOService.class);
	@Autowired
	private PORequestHistoryRepository poRequestHistoryRepository;
	@Autowired
	private PORequestRepository poRequestRepository;
    
	public Map<String, Object> getSiteProjectFieldChanges() {

		Map<String, Object> response = new HashMap<String, Object>();

		try {

			List<PORequestHistory> poRequestFieldChanges = poRequestHistoryRepository.findAll();

			List<Map<String, Object>> mapList = new ArrayList<>();

			if (!CollectionUtils.isEmpty(poRequestFieldChanges)) {

				for (PORequestHistory poRequest : poRequestFieldChanges) {

					Map<String, Object> mapData = new HashMap<String, Object>();

					mapData.put("SITE_PROJECTS_FIELD_CHANGES_ID", poRequest.getId());

					mapData.put("SITE_PROJECTS_ID", poRequest.getPoId());

					mapData.put("SITE_INFO_ID", poRequest.getSiteId());

					//mapData.put("FIELD_NAME", poRequest.getFieldName());
					 mapData.put("FIELD_NAME", "");

					//mapData.put("FIELD_VALUE", poRequest.getFieldValue());

					mapData.put("FIELD_VALUE", "");
					
					//mapData.put("SOURCE", poRequest.getSource());
					mapData.put("SOURCE", "");

					mapData.put("LAST_MODIFIED_BY", poRequest.getLastModifiedBy());

					mapData.put("LAST_MODIFIED_DATE", poRequest.getLastModifiedDate());

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
	
	public void createPORequest(PORequest porequest) {
		poRequestRepository.save(porequest);
		
	}
	public PORequest getPORequest(int id) {
		Optional<PORequest> poRequest = poRequestRepository.findById(id);
		if(poRequest!=null) {
			return poRequest.get();
		}
		
		return null;
	}
		
	public Map<String, Object> getLatestPoRequestHistory() {

		Map<String, Object> response = new HashMap<String, Object>();

		return response;

	}
}
