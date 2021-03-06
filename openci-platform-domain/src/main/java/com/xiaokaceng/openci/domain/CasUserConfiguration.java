package com.xiaokaceng.openci.domain;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cas_user")
public class CasUserConfiguration extends ToolConfiguration {

	private static final long serialVersionUID = 273891251627741059L;

	public CasUserConfiguration() {
		super();
	}

	public CasUserConfiguration(String name, String serviceUrl, String username, String password) {
		super(name, serviceUrl, username, password);
	}

	public static CasUserConfiguration getUniqueInstance() {
		List<CasUserConfiguration> casUserConfigurations = CasUserConfiguration.findAll(CasUserConfiguration.class);
		return casUserConfigurations.size() > 0 ? casUserConfigurations.get(0) : null;
	}

	@Override
	public String getRequestAddress(String projectName) {
		return null;
	}
	
}
