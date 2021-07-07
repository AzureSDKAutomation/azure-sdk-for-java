// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.models.Encryption;
import com.azure.resourcemanager.eventhubs.generated.models.Identity;
import com.azure.resourcemanager.eventhubs.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Single Namespace item in List or Get Operation. */
@JsonFlatten
@Fluent
public class EHNamespaceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EHNamespaceInner.class);

    /*
     * Properties of sku resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Properties of BYOK Identity description
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Provisioning state of the Namespace.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Status of the Namespace.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The time the Namespace was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdAt;

    /*
     * The time the Namespace was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    @JsonProperty(value = "properties.serviceBusEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceBusEndpoint;

    /*
     * Cluster ARM ID of the Namespace.
     */
    @JsonProperty(value = "properties.clusterArmId")
    private String clusterArmId;

    /*
     * Identifier for Azure Insights metrics.
     */
    @JsonProperty(value = "properties.metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     */
    @JsonProperty(value = "properties.isAutoInflateEnabled")
    private Boolean isAutoInflateEnabled;

    /*
     * Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 40 throughput units. ( '0' if AutoInflateEnabled =
     * true)
     */
    @JsonProperty(value = "properties.maximumThroughputUnits")
    private Integer maximumThroughputUnits;

    /*
     * Value that indicates whether Kafka is enabled for eventhub namespace.
     */
    @JsonProperty(value = "properties.kafkaEnabled")
    private Boolean kafkaEnabled;

    /*
     * Enabling this property creates a Standard Event Hubs Namespace in
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
     * Get the sku property: Properties of sku resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Properties of sku resource.
     *
     * @param sku the sku value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withSku(Sku sku) {
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
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Status of the Namespace.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the createdAt property: The time the Namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the Namespace was updated.
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
     * Get the clusterArmId property: Cluster ARM ID of the Namespace.
     *
     * @return the clusterArmId value.
     */
    public String clusterArmId() {
        return this.clusterArmId;
    }

    /**
     * Set the clusterArmId property: Cluster ARM ID of the Namespace.
     *
     * @param clusterArmId the clusterArmId value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withClusterArmId(String clusterArmId) {
        this.clusterArmId = clusterArmId;
        return this;
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
     * Get the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @return the isAutoInflateEnabled value.
     */
    public Boolean isAutoInflateEnabled() {
        return this.isAutoInflateEnabled;
    }

    /**
     * Set the isAutoInflateEnabled property: Value that indicates whether AutoInflate is enabled for eventhub
     * namespace.
     *
     * @param isAutoInflateEnabled the isAutoInflateEnabled value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withIsAutoInflateEnabled(Boolean isAutoInflateEnabled) {
        this.isAutoInflateEnabled = isAutoInflateEnabled;
        return this;
    }

    /**
     * Get the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 40 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @return the maximumThroughputUnits value.
     */
    public Integer maximumThroughputUnits() {
        return this.maximumThroughputUnits;
    }

    /**
     * Set the maximumThroughputUnits property: Upper limit of throughput units when AutoInflate is enabled, value
     * should be within 0 to 40 throughput units. ( '0' if AutoInflateEnabled = true).
     *
     * @param maximumThroughputUnits the maximumThroughputUnits value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withMaximumThroughputUnits(Integer maximumThroughputUnits) {
        this.maximumThroughputUnits = maximumThroughputUnits;
        return this;
    }

    /**
     * Get the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @return the kafkaEnabled value.
     */
    public Boolean kafkaEnabled() {
        return this.kafkaEnabled;
    }

    /**
     * Set the kafkaEnabled property: Value that indicates whether Kafka is enabled for eventhub namespace.
     *
     * @param kafkaEnabled the kafkaEnabled value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withKafkaEnabled(Boolean kafkaEnabled) {
        this.kafkaEnabled = kafkaEnabled;
        return this;
    }

    /**
     * Get the zoneRedundant property: Enabling this property creates a Standard Event Hubs Namespace in regions
     * supported availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Enabling this property creates a Standard Event Hubs Namespace in regions
     * supported availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withZoneRedundant(Boolean zoneRedundant) {
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
     * @return the EHNamespaceInner object itself.
     */
    public EHNamespaceInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EHNamespaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EHNamespaceInner withTags(Map<String, String> tags) {
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
