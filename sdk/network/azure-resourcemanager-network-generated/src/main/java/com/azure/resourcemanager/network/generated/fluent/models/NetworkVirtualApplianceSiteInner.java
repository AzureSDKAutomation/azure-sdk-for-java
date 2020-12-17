// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.O365PolicyProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualWanProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Virtual Appliance Site resource. */
@JsonFlatten
@Fluent
public class NetworkVirtualApplianceSiteInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkVirtualApplianceSiteInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Virtual Wan resource this site is part of.
     */
    @JsonProperty(value = "properties.virtualWan")
    private VirtualWanProperties virtualWan;

    /*
     * Address Prefix.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /*
     * Office 365 Policy.
     */
    @JsonProperty(value = "properties.o365Policy")
    private O365PolicyProperties o365Policy;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the virtualWan property: Virtual Wan resource this site is part of.
     *
     * @return the virtualWan value.
     */
    public VirtualWanProperties virtualWan() {
        return this.virtualWan;
    }

    /**
     * Set the virtualWan property: Virtual Wan resource this site is part of.
     *
     * @param virtualWan the virtualWan value to set.
     * @return the NetworkVirtualApplianceSiteInner object itself.
     */
    public NetworkVirtualApplianceSiteInner withVirtualWan(VirtualWanProperties virtualWan) {
        this.virtualWan = virtualWan;
        return this;
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address Prefix.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the NetworkVirtualApplianceSiteInner object itself.
     */
    public NetworkVirtualApplianceSiteInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the o365Policy property: Office 365 Policy.
     *
     * @return the o365Policy value.
     */
    public O365PolicyProperties o365Policy() {
        return this.o365Policy;
    }

    /**
     * Set the o365Policy property: Office 365 Policy.
     *
     * @param o365Policy the o365Policy value to set.
     * @return the NetworkVirtualApplianceSiteInner object itself.
     */
    public NetworkVirtualApplianceSiteInner withO365Policy(O365PolicyProperties o365Policy) {
        this.o365Policy = o365Policy;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the NetworkVirtualApplianceSiteInner object itself.
     */
    public NetworkVirtualApplianceSiteInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkVirtualApplianceSiteInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkVirtualApplianceSiteInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualWan() != null) {
            virtualWan().validate();
        }
        if (o365Policy() != null) {
            o365Policy().validate();
        }
    }
}
