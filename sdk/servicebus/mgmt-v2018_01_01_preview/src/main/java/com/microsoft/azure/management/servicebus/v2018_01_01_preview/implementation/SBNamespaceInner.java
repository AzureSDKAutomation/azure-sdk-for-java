/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.servicebus.v2018_01_01_preview.SBSku;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Identity;
import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.Encryption;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of a namespace resource.
 */
@JsonFlatten
public class SBNamespaceInner extends Resource {
    /**
     * Properties of SKU.
     */
    @JsonProperty(value = "sku")
    private SBSku sku;

    /**
     * Properties of BYOK Identity description.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /**
     * Provisioning state of the namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The time the namespace was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /**
     * Identifier for Azure Insights metrics.
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /**
     * Enabling this property creates a Premium Service Bus Namespace in
     * regions supported availability zones.
     */
    @JsonProperty(value = "properties.zoneRedundant")
    private Boolean zoneRedundant;

    /**
     * Properties of BYOK Encryption description.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Get properties of SKU.
     *
     * @return the sku value
     */
    public SBSku sku() {
        return this.sku;
    }

    /**
     * Set properties of SKU.
     *
     * @param sku the sku value to set
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withSku(SBSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get properties of BYOK Identity description.
     *
     * @return the identity value
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set properties of BYOK Identity description.
     *
     * @param identity the identity value to set
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get provisioning state of the namespace.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the time the namespace was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the time the namespace was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get identifier for Azure Insights metrics.
     *
     * @return the metricId value
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get enabling this property creates a Premium Service Bus Namespace in regions supported availability zones.
     *
     * @return the zoneRedundant value
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set enabling this property creates a Premium Service Bus Namespace in regions supported availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get properties of BYOK Encryption description.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set properties of BYOK Encryption description.
     *
     * @param encryption the encryption value to set
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

}
