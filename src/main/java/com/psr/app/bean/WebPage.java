package com.psr.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="WEB_PAGE")
public class WebPage {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE1")
	@SequenceGenerator(name="SEQUENCE1", sequenceName="WEB_PAGE_SEQ", allocationSize=1)
	@Column(name="page_id")
	private Integer pageId;
	
	@Column(name="caption")
	private String caption;
	
	@Column(name="tab_caption")
	private String tabCaption;
	
	@Column(name="url")
	private String url;
	
	public Integer getPageId() {
		return pageId;
	}
	public void setPageId(Integer pageId) {
		this.pageId = pageId;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getTabCaption() {
		return tabCaption;
	}
	public void setTabCaption(String tabCaption) {
		this.tabCaption = tabCaption;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
