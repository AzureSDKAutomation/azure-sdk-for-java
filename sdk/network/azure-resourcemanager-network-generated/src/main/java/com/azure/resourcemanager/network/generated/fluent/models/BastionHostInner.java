// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.BastionHostIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Bastion Host resource. */
@JsonFlatten
@Fluent
public class BastionHostInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BastionHostInner.class);

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The sku of this Bastion Host.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * IP configuration of the Bastion Host resource.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<BastionHostIpConfiguration> ipConfigurations;

    /*
     * FQDN for the endpoint on which bastion host is accessible.
     */
    @JsonProperty(value = "properties.dnsName")
    private String dnsName;

    /*
     * The provisioning state of the bastion host resource.
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
     * Get the sku property: The sku of this Bastion Host.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of this Bastion Host.
     *
     * @param sku the sku value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @return the ipConfigurations value.
     */
    public List<BastionHostIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @return the dnsName value.
     */
    public String dnsName() {
        return this.dnsName;
    }

    /**
     * Set the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @param dnsName the dnsName value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bastion host resource.
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
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BastionHostInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BastionHostInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
    }
}
