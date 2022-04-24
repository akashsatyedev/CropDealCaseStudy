package com.cropdeal.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
@Primary
@EnableAutoConfiguration
public class DocumentationController implements SwaggerResourcesProvider {

	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources = new ArrayList<>();
		resources.add(swaggerResource("admin-service", "/admin-service/v2/api-docs", "2.0"));
		resources.add(swaggerResource("crop-service", "/crop-service/v2/api-docs", "2.0"));
		resources.add(swaggerResource("dealer-service", "/dealer-service/v2/api-docs", "2.0"));
		resources.add(swaggerResource("farmer-service", "/farmer-service/v2/api-docs", "2.0"));
		resources.add(swaggerResource("payment-service", "/payment-service/v2/api-docs", "2.0"));
		return resources;
	}

	private SwaggerResource swaggerResource(String name, String location, String version) {
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName(name);
		swaggerResource.setLocation(location);
		swaggerResource.setSwaggerVersion(version);
		return swaggerResource;
	}

}