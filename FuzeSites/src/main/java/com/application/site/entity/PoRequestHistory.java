package com.application.site.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PO_REQUEST_HISTORY")
public class PoRequestHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "PO_ID")
	private Integer poId;

	@Column(name = "SITE_ID")
	private Integer siteId;

	@Column(name = "PO_NAME")
	private String poName;

	@Column(name = "PSLC")
	private String pslc;

	@Column(name = "PO_STATUS")
	private String poStatus;

	@Column(name = "TERRITORY")
	private String territory;

	@Column(name = "MARKET")
	private String market;

	@Column(name = "SITETRACKER")
	private String siteTracker;

	@Column(name = "HISTORY_DATE")
	private String historyDate;

	@Column(name = "LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPoId() {
		return poId;
	}

	public void setPoId(Integer poId) {
		this.poId = poId;
	}

	public Integer getSiteId() {
		return siteId;
	}

	public void setSiteId(Integer siteId) {
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

	public String getHistoryDate() {
		return historyDate;
	}

	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public String toString() {
		return "PoRequestHistory [id=" + id + ", poId=" + poId + ", siteId=" + siteId + ", poName=" + poName + ", pslc="
				+ pslc + ", poStatus=" + poStatus + ", territory=" + territory + ", market=" + market + ", siteTracker="
				+ siteTracker + ", historyDate=" + historyDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}

}
