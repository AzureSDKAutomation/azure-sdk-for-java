// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.generated.fluent.models.ServiceResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes the service response property. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceType")
@JsonTypeName("DataTransferServiceResource")
@Immutable
public final class DataTransferServiceResource extends ServiceResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataTransferServiceResource.class);

    /*
     * An array that contains all of the locations for the service.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataTransferRegionalServiceResource> locations;

    /**
     * Get the locations property: An array that contains all of the locations for the service.
     *
     * @return the locations value.
     */
    public List<DataTransferRegionalServiceResource> locations() {
        return this.locations;
    }

    /** {@inheritDoc} */
    @Override
    public DataTransferServiceResource withInstanceSize(ServiceSize instanceSize) {
        super.withInstanceSize(instanceSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataTransferServiceResource withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataTransferServiceResource withStatus(ServiceStatus status) {
        super.withStatus(status);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }
}
