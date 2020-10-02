/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2020_10_01.implementation;

import com.microsoft.azure.management.peering.v2020_10_01.PeeringSku;
import com.microsoft.azure.management.peering.v2020_10_01.Kind;
import com.microsoft.azure.management.peering.v2020_10_01.PeeringPropertiesDirect;
import com.microsoft.azure.management.peering.v2020_10_01.PeeringPropertiesExchange;
import com.microsoft.azure.management.peering.v2020_10_01.ProvisioningState;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Peering is a logical representation of a set of connections to the Microsoft
 * Cloud Edge at a location.
 */
@JsonFlatten
public class PeeringInner extends ProxyResource {
    /**
     * The SKU that defines the tier and kind of the peering.
     */
    @JsonProperty(value = "sku", required = true)
    private PeeringSku sku;

    /**
     * The kind of the peering. Possible values include: 'Direct', 'Exchange'.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /**
     * The properties that define a direct peering.
     */
    @JsonProperty(value = "properties.direct")
    private PeeringPropertiesDirect direct;

    /**
     * The properties that define an exchange peering.
     */
    @JsonProperty(value = "properties.exchange")
    private PeeringPropertiesExchange exchange;

    /**
     * The location of the peering.
     */
    @JsonProperty(value = "properties.peeringLocation")
    private String peeringLocation;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The location of the resource.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * The resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the SKU that defines the tier and kind of the peering.
     *
     * @return the sku value
     */
    public PeeringSku sku() {
        return this.sku;
    }

    /**
     * Set the SKU that defines the tier and kind of the peering.
     *
     * @param sku the sku value to set
     * @return the PeeringInner object itself.
     */
    public PeeringInner withSku(PeeringSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind of the peering. Possible values include: 'Direct', 'Exchange'.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind of the peering. Possible values include: 'Direct', 'Exchange'.
     *
     * @param kind the kind value to set
     * @return the PeeringInner object itself.
     */
    public PeeringInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the properties that define a direct peering.
     *
     * @return the direct value
     */
    public PeeringPropertiesDirect direct() {
        return this.direct;
    }

    /**
     * Set the properties that define a direct peering.
     *
     * @param direct the direct value to set
     * @return the PeeringInner object itself.
     */
    public PeeringInner withDirect(PeeringPropertiesDirect direct) {
        this.direct = direct;
        return this;
    }

    /**
     * Get the properties that define an exchange peering.
     *
     * @return the exchange value
     */
    public PeeringPropertiesExchange exchange() {
        return this.exchange;
    }

    /**
     * Set the properties that define an exchange peering.
     *
     * @param exchange the exchange value to set
     * @return the PeeringInner object itself.
     */
    public PeeringInner withExchange(PeeringPropertiesExchange exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get the location of the peering.
     *
     * @return the peeringLocation value
     */
    public String peeringLocation() {
        return this.peeringLocation;
    }

    /**
     * Set the location of the peering.
     *
     * @param peeringLocation the peeringLocation value to set
     * @return the PeeringInner object itself.
     */
    public PeeringInner withPeeringLocation(String peeringLocation) {
        this.peeringLocation = peeringLocation;
        return this;
    }

    /**
     * Get the provisioning state of the resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the location of the resource.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the resource.
     *
     * @param location the location value to set
     * @return the PeeringInner object itself.
     */
    public PeeringInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the resource tags.
     *
     * @param tags the tags value to set
     * @return the PeeringInner object itself.
     */
    public PeeringInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
