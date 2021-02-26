// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual Router Peering resource. */
@JsonFlatten
@Fluent
public class VirtualRouterPeeringInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualRouterPeeringInner.class);

    /*
     * Name of the virtual router peering that is unique within a virtual
     * router.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Peering type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Peer ASN.
     */
    @JsonProperty(value = "properties.peerAsn")
    private Long peerAsn;

    /*
     * Peer IP.
     */
    @JsonProperty(value = "properties.peerIp")
    private String peerIp;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Name of the virtual router peering that is unique within a virtual router.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the virtual router peering that is unique within a virtual router.
     *
     * @param name the name value to set.
     * @return the VirtualRouterPeeringInner object itself.
     */
    public VirtualRouterPeeringInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Peering type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the peerAsn property: Peer ASN.
     *
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: Peer ASN.
     *
     * @param peerAsn the peerAsn value to set.
     * @return the VirtualRouterPeeringInner object itself.
     */
    public VirtualRouterPeeringInner withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the peerIp property: Peer IP.
     *
     * @return the peerIp value.
     */
    public String peerIp() {
        return this.peerIp;
    }

    /**
     * Set the peerIp property: Peer IP.
     *
     * @param peerIp the peerIp value to set.
     * @return the VirtualRouterPeeringInner object itself.
     */
    public VirtualRouterPeeringInner withPeerIp(String peerIp) {
        this.peerIp = peerIp;
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

    /** {@inheritDoc} */
    @Override
    public VirtualRouterPeeringInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
