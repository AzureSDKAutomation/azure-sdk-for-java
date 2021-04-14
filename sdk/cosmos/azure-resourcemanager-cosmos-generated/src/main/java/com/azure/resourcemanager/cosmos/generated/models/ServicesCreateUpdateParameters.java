// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Service create or update parameters. */
@JsonFlatten
@Fluent
public class ServicesCreateUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicesCreateUpdateParameters.class);

    /*
     * Instance type for the service.
     */
    @JsonProperty(value = "properties.instanceSize", required = true)
    private ServiceSize instanceSize;

    /*
     * Instance count for the service.
     */
    @JsonProperty(value = "properties.instanceCount", required = true)
    private int instanceCount;

    /*
     * The type of Azure resource.
     */
    @JsonProperty(value = "properties.serviceType")
    private String serviceType;

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
     * @return the ServicesCreateUpdateParameters object itself.
     */
    public ServicesCreateUpdateParameters withInstanceSize(ServiceSize instanceSize) {
        this.instanceSize = instanceSize;
        return this;
    }

    /**
     * Get the instanceCount property: Instance count for the service.
     *
     * @return the instanceCount value.
     */
    public int instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: Instance count for the service.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the ServicesCreateUpdateParameters object itself.
     */
    public ServicesCreateUpdateParameters withInstanceCount(int instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the serviceType property: The type of Azure resource.
     *
     * @return the serviceType value.
     */
    public String serviceType() {
        return this.serviceType;
    }

    /**
     * Set the serviceType property: The type of Azure resource.
     *
     * @param serviceType the serviceType value to set.
     * @return the ServicesCreateUpdateParameters object itself.
     */
    public ServicesCreateUpdateParameters withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (instanceSize() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property instanceSize in model ServicesCreateUpdateParameters"));
        }
    }
}
