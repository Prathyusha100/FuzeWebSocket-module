package com.fuze.po.PurchaseOrderAppServices.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuze.po.PurchaseOrderAppServices.entity.PORequest;
import com.fuze.po.PurchaseOrderAppServices.exception.PurchaseOrderResourceNotFoundException;
import com.fuze.po.PurchaseOrderAppServices.forms.PORequestForm;
import com.fuze.po.PurchaseOrderAppServices.info.PORequestInfo;
import com.fuze.po.PurchaseOrderAppServices.info.ResponseInfo;
import com.fuze.po.PurchaseOrderAppServices.repository.PORequestRepository;

/**
 * @author Bhajuram.c
 *
 */
@Service
public class POService {

	@Autowired
	private PORequestRepository poRequestRepo;
	
	public ResponseInfo createPoRequest(PORequestForm requestForm) {
		ResponseInfo response = new ResponseInfo();
		try {
			PORequest poRequest = populatePORequestEntity(requestForm);
			// save po
			poRequest = poRequestRepo.save(poRequest);
		} catch (Exception e) {
			response.setStatus(false);
		}
		response.setResponseType("PO has been saved successfuly");
		response.setStatus(true);
		return response;
	}

	private PORequest populatePORequestEntity(PORequestForm requestForm) {
		PORequest poRequest = new PORequest();
		poRequest.setMarket(requestForm.getMarket());
		poRequest.setPslc(requestForm.getPslc());
		poRequest.setPoStatus(requestForm.getPoStatus());
		poRequest.setSiteTracker(requestForm.getSiteTracker());
		poRequest.setTeritory(requestForm.getTeritory());
		poRequest.setPoName(requestForm.getPoName());
		if(requestForm.getId()!=null) {
			poRequest.setId(requestForm.getId());
		}
		return poRequest;
	}

	public List<PORequestInfo> getPOList() {
		  List<PORequest> poRequestList = poRequestRepo.findAll();
	      List<PORequestInfo> poRequestInfoList = new ArrayList<PORequestInfo>();
		if(poRequestList ==null || poRequestList.isEmpty()) {
	    	throw new PurchaseOrderResourceNotFoundException("PurchaseOrders NotFound.");
	      }
		if (poRequestList != null && !poRequestList.isEmpty()) {
			for (PORequest po : poRequestList) {
				PORequestInfo poRequestInfo = populatePOInfo(po);
				poRequestInfoList.add(poRequestInfo);
			}
		}
    	return poRequestInfoList;
	}

	
	private PORequestInfo populatePOInfo(PORequest po) {
		PORequestInfo poRequestInfo = new PORequestInfo();
		poRequestInfo.setId(po.getId());
		poRequestInfo.setMarket(po.getMarket());
		poRequestInfo.setPoName(po.getPoName());
		poRequestInfo.setPoStatus(po.getPoStatus());
		poRequestInfo.setPslc(po.getPslc());
		poRequestInfo.setTeritory(po.getTeritory());
		poRequestInfo.setSiteTracker(po.getSiteTracker());
		return poRequestInfo;
	}

	public String deletePOList(Integer poRequestId) {
		poRequestRepo.deleteById(poRequestId);
		return "Success";
	}


}
