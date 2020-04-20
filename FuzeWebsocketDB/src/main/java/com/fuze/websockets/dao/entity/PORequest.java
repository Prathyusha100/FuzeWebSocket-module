package com.fuze.websockets.dao.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Bhajuram.c
 *
 */
@Entity
@Table(name = "po_request")
public class PORequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "po_id")
	private int id;
	@Column(name = "site_id")
	private int siteId;
	@Column(name = "po_name")
	private String poName;
	@Column(name = "pslc")
	private String pslc;
	@Column(name = "po_status")
	private String poStatus;
	@Column(name = "territory")
	private String territory;
	@Column(name = "market")
	private String market;
	@Column(name = "site_tracker")
	private String siteTracker;
	@Column(name = "last_modified_by")
	private String lastModifiedBy;
	@Column(name = "last_modified_date")
	private Date lastModifiedDate;
	
	public PORequest() {}
	
	public PORequest(int siteId, String poName, String pslc, String poStatus, String territory, String market,
			String siteTracker, String lastModifiedBy, Date lastModifiedDate) {
		super();
		this.siteId = siteId;
		this.poName = poName;
		this.pslc = pslc;
		this.poStatus = poStatus;
		this.territory = territory;
		this.market = market;
		this.siteTracker = siteTracker;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSiteId() {
		return siteId;
	}
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}
    public String getPoName() {
		return poName;
	}
    public void setPoName(String poName) {
		this.poName = poName;
	}
	public String getPslc() {
		return pslc;
	}
	public void setPslc(String pslc) {
		this.pslc = pslc;
	}
	public String getPoStatus() {
		return poStatus;
	}
   public void setPoStatus(String poStatus) {
		this.poStatus = poStatus;
	}
     public String getTerritory() {
		return territory;
	}
	public void setTerritory(String territory) {
		this.territory = territory;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
    public String getSiteTracker() {
		return siteTracker;
	}
	public void setSiteTracker(String siteTracker) {
		this.siteTracker = siteTracker;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	@Override
	public String toString() {
		return "PORequest [siteId=" + siteId + ", poName=" + poName + ", pslc=" + pslc + ", poStatus=" + poStatus
				+ ", territory=" + territory + ", market=" + market + ", siteTracker=" + siteTracker
				+ ", lastModifiedBy=" + lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + "]";
	}

}
