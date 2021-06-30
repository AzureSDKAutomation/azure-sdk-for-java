// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.models.Encryption;
import com.azure.resourcemanager.servicebus.generated.models.Identity;
import com.azure.resourcemanager.servicebus.generated.models.SBSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Description of a namespace resource. */
@JsonFlatten
@Fluent
public class SBNamespaceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SBNamespaceInner.class);

    /*
     * Properties of SKU
     */
    @JsonProperty(value = "sku")
    private SBSku sku;

    /*
     * Properties of BYOK Identity description
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Provisioning state of the namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Status of the namespace.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The time the namespace was created
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Identifier for Azure Insights metrics
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Enabling this property creates a Premium Service Bus Namespace in
     * regions supported availability zones.
     */
    @JsonProperty(value = "properties.zoneRedundant")
    private Boolean zoneRedundant;

    /*
     * Properties of BYOK Encryption description
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Get the sku property: Properties of SKU.
     *
     * @return the sku value.
     */
    public SBSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of SKU.
     *
     * @param sku the sku value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withSku(SBSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the identity property: Properties of BYOK Identity description.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Properties of BYOK Identity description.
     *
     * @param identity the identity value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Status of the namespace.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in regions
     * supported availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Enabling this property creates a Premium Service Bus Namespace in regions
     * supported availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the encryption property: Properties of BYOK Encryption description.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption property: Properties of BYOK Encryption description.
     *
     * @param encryption the encryption value to set.
     * @return the SBNamespaceInner object itself.
     */
    public SBNamespaceInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SBNamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SBNamespaceInner withTags(Map<String, String> tags) {
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
        if (identity() != null) {
            identity().validate();
        }
        if (encryption() != null) {
            encryption().validate();
        }
    }
}
