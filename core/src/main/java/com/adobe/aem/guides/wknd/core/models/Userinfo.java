package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Userinfo {

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String username;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String password;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String age;
	
	@ChildResource
	private List<UserinfoData> phonenumber;
	
	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String address;
	
	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String color;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public String getAge() {
		return age;
	}

	public List<UserinfoData> getPhonenumber() {

		return phonenumber;
	}

	public String getAddress() {
		return address;
	}
	
	public String getColor() {
		return color;
	}
	@PostConstruct
	protected void init() {

	}

}
