package com.turreta.cdi.servlet.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class AppDetailBean implements Serializable {

	private String appName;
	private String version;

	@PostConstruct
	public void init() {
		appName = "Turreta.com Tomcat/CDI Demo";
		version = "1.0";
	}

	public String getAppName() {
		return appName;
	}

	public String getVersion() {
		return version;
	}
}
