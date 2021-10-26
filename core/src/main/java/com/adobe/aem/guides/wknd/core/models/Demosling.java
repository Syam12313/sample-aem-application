package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = SlingHttpServletRequest.class, adapters = Demosling.class, resourceType = Demosling.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Demosling {
    private static final Logger LOG = LoggerFactory.getLogger(Demosling.class);
    final protected static String RESOURCE_TYPE = "/apps/wknd/components/demosling";

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String studentid;


    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String company;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String address;

    @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL)
    private String mobilenumber;

    public String getStudentid() {
        return studentid;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }
}



