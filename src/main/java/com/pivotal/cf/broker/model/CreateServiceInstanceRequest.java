package com.pivotal.cf.broker.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * A request sent by the cloud controller to create a new instance
 * of a service.
 * 
 * @author sgreenberg@gopivotal.com
 */
@JsonAutoDetect(getterVisibility = Visibility.NONE)
public class CreateServiceInstanceRequest {

	@JsonSerialize
	@JsonProperty("service_id")
	private String serviceDefinitionId;
	
	@JsonSerialize
	@JsonProperty("plan_id")
	private String planId;
	
	@JsonSerialize
	@JsonProperty("organization_guid")
	private String organizationGuid;
	
	@JsonSerialize
	@JsonProperty("space_guid")
	private String spaceGuid;
	
	public CreateServiceInstanceRequest() {}
	
	public CreateServiceInstanceRequest(String serviceDefinitionId, String planId, String organizationGuid, String spaceGuid) {
		this.serviceDefinitionId = serviceDefinitionId;
		this.planId = planId;
		this.organizationGuid = organizationGuid;
		this.spaceGuid = spaceGuid;
	}
	
	public String getServiceDefinitionId() {
		return serviceDefinitionId;
	}

	public void setServiceDefinitionId(String serviceDefinitionId) {
		this.serviceDefinitionId = serviceDefinitionId;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getOrganizationGuid() {
		return organizationGuid;
	}

	public void setOrganizationGuid(String organizationGuid) {
		this.organizationGuid = organizationGuid;
	}

	public String getSpaceGuid() {
		return spaceGuid;
	}

	public void setSpaceGuid(String spaceGuid) {
		this.spaceGuid = spaceGuid;
	}
	
}
