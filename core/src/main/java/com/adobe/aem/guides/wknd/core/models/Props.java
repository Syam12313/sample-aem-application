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

public class Props {

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String title;

	@ValueMapValue
	@Default(values = StringUtils.EMPTY)
	private String owner;

	@ChildResource
	private List<PropsModel> factories;

	public String getTitle() {
		return title;
	}

	public String getOwner() {
		return owner;
	}

	public List<PropsModel> getFactories() {

		return factories;
	}

	@PostConstruct
	protected void init() {

	}

}
