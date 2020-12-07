// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.CommissionedState;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Custom IP prefix resource. */
@JsonFlatten
@Fluent
public class CustomIpPrefixInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomIpPrefixInner.class);

    /*
     * The extended location of the custom IP prefix.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The prefix range in CIDR notation. Should include the start address and
     * the prefix length.
     */
    @JsonProperty(value = "properties.cidr")
    private String cidr;

    /*
     * The commissioned state of the Custom IP Prefix.
     */
    @JsonProperty(value = "properties.commissionedState")
    private CommissionedState commissionedState;

    /*
     * The list of all referenced PublicIpPrefixes.
     */
    @JsonProperty(value = "properties.publicIpPrefixes", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> publicIpPrefixes;

    /*
     * The resource GUID property of the custom IP prefix resource.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the custom IP prefix resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The edge zone of the custom IP prefix.
     */
    @JsonProperty(value = "properties.edgeZone")
    private String edgeZone;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the extendedLocation property: The extended location of the custom IP prefix.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the custom IP prefix.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
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
     * Get the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: A list of availability zones denoting the IP allocated for the resource needs to come
     * from.
     *
     * @param zones the zones value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the cidr property: The prefix range in CIDR notation. Should include the start address and the prefix length.
     *
     * @return the cidr value.
     */
    public String cidr() {
        return this.cidr;
    }

    /**
     * Set the cidr property: The prefix range in CIDR notation. Should include the start address and the prefix length.
     *
     * @param cidr the cidr value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * Get the commissionedState property: The commissioned state of the Custom IP Prefix.
     *
     * @return the commissionedState value.
     */
    public CommissionedState commissionedState() {
        return this.commissionedState;
    }

    /**
     * Set the commissionedState property: The commissioned state of the Custom IP Prefix.
     *
     * @param commissionedState the commissionedState value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withCommissionedState(CommissionedState commissionedState) {
        this.commissionedState = commissionedState;
        return this;
    }

    /**
     * Get the publicIpPrefixes property: The list of all referenced PublicIpPrefixes.
     *
     * @return the publicIpPrefixes value.
     */
    public List<SubResource> publicIpPrefixes() {
        return this.publicIpPrefixes;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the custom IP prefix resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the custom IP prefix resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the edgeZone property: The edge zone of the custom IP prefix.
     *
     * @return the edgeZone value.
     */
    public String edgeZone() {
        return this.edgeZone;
    }

    /**
     * Set the edgeZone property: The edge zone of the custom IP prefix.
     *
     * @param edgeZone the edgeZone value to set.
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withEdgeZone(String edgeZone) {
        this.edgeZone = edgeZone;
        return this;
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
     * @return the CustomIpPrefixInner object itself.
     */
    public CustomIpPrefixInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomIpPrefixInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomIpPrefixInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
