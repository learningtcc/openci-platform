package com.xiaokaceng.openci.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("svn")
public class SvnConfiguration extends ToolConfiguration {

	private static final long serialVersionUID = 2373533363609866542L;

	@Column(name = "save_path")
	private String savePath;

	@Column(name = "request_root_address")
	private String requestRootAddress;

	public SvnConfiguration(String name, String serviceUrl, String username, String password, String savePath, String requestRootAddress) {
		super(name, serviceUrl, username, password);
		this.savePath = savePath;
		this.requestRootAddress = requestRootAddress;
	}

	SvnConfiguration() {
	}

	public String getSavePath() {
		return savePath;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String getRequestRootAddress() {
		return requestRootAddress;
	}

	public void setRequestRootAddress(String requestRootAddress) {
		this.requestRootAddress = requestRootAddress;
	}

	@Override
	public String getRequestAddress(String projectName) {
		return HTTP_PROTOCOL_REQUEST_STR + getServiceUrl() + endsWith(getRequestRootAddress()) + projectName;
	}

}