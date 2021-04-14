// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.models.DataTransferServiceResource;
import com.azure.resourcemanager.cosmos.generated.models.ServiceSize;
import com.azure.resourcemanager.cosmos.generated.models.ServiceStatus;
import com.azure.resourcemanager.cosmos.generated.models.SqlDedicatedGatewayServiceResource;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Services response resource. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "serviceType",
    defaultImpl = ServiceResourceInner.class)
@JsonTypeName("ServiceResource")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "DataTransferServiceResource", value = DataTransferServiceResource.class),
    @JsonSubTypes.Type(name = "SqlDedicatedGatewayServiceResource", value = SqlDedicatedGatewayServiceResource.class)
})
@Fluent
public class ServiceResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceResourceInner.class);

    /*
     * Time of the last state change (ISO-8601 format).
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Instance type for the service.
     */
    @JsonProperty(value = "instanceSize")
    private ServiceSize instanceSize;

    /*
     * Instance count for the service.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /*
     * Describes the status of a service.
     */
    @JsonProperty(value = "status")
    private ServiceStatus status;

    /*
     * Services response resource.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the creationTime property: Time of the last state change (ISO-8601 format).
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the instanceSize property: Instance type for the service.
     *
     * @return the instanceSize value.
     */
    public ServiceSize instanceSize() {
        return this.instanceSize;
    }

    /**
     * Set the instanceSize property: Instance type for the service.
     *
     * @param instanceSize the instanceSize value to set.
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withInstanceSize(ServiceSize instanceSize) {
        this.instanceSize = instanceSize;
        return this;
    }

    /**
     * Get the instanceCount property: Instance count for the service.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: Instance count for the service.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the status property: Describes the status of a service.
     *
     * @return the status value.
     */
    public ServiceStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Describes the status of a service.
     *
     * @param status the status value to set.
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withStatus(ServiceStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the additionalProperties property: Services response resource.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Services response resource.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ServiceResourceInner object itself.
     */
    public ServiceResourceInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
