// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** disk access resource. */
@JsonFlatten
@Fluent
public class DiskAccessInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskAccessInner.class);

    /*
     * A readonly collection of private endpoint connections created on the
     * disk. Currently only one endpoint connection is supported.
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The disk access resource provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The time when the disk access was created.
     */
    @JsonProperty(value = "properties.timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timeCreated;

    /**
     * Get the privateEndpointConnections property: A readonly collection of private endpoint connections created on the
     * disk. Currently only one endpoint connection is supported.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the provisioningState property: The disk access resource provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the timeCreated property: The time when the disk access was created.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.timeCreated;
    }

    /** {@inheritDoc} */
    @Override
    public DiskAccessInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiskAccessInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }
}
