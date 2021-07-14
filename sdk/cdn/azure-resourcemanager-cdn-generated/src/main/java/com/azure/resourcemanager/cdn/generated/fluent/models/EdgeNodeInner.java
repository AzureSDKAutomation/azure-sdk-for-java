// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.models.IpAddressGroup;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Edgenode is a global Point of Presence (POP) location used to deliver CDN content to end users. */
@JsonFlatten
@Fluent
public class EdgeNodeInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EdgeNodeInner.class);

    /*
     * List of ip address groups.
     */
    @JsonProperty(value = "properties.ipAddressGroups")
    private List<IpAddressGroup> ipAddressGroups;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the ipAddressGroups property: List of ip address groups.
     *
     * @return the ipAddressGroups value.
     */
    public List<IpAddressGroup> ipAddressGroups() {
        return this.ipAddressGroups;
    }

    /**
     * Set the ipAddressGroups property: List of ip address groups.
     *
     * @param ipAddressGroups the ipAddressGroups value to set.
     * @return the EdgeNodeInner object itself.
     */
    public EdgeNodeInner withIpAddressGroups(List<IpAddressGroup> ipAddressGroups) {
        this.ipAddressGroups = ipAddressGroups;
        return this;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipAddressGroups() != null) {
            ipAddressGroups().forEach(e -> e.validate());
        }
    }
}
