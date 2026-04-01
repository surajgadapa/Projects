package com.aem.demo.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)
public class HelloWorldModel {

    public String getMessage() {
        return "Hello from AEM Sling Model!";
    }
}
