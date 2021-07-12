// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionEndpointConfigurationAccess;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionEndpointLogsIngestion;
import com.azure.resourcemanager.monitor.generated.models.DataCollectionEndpointNetworkAcls;
import com.azure.resourcemanager.monitor.generated.models.KnownDataCollectionEndpointProvisioningState;
import com.azure.resourcemanager.monitor.generated.models.KnownDataCollectionEndpointResourceKind;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Definition of ARM tracked top level resource. */
@JsonFlatten
@Fluent
public class DataCollectionEndpointResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataCollectionEndpointResourceInner.class);

    /*
     * The kind of the resource.
     */
    @JsonProperty(value = "kind")
    private KnownDataCollectionEndpointResourceKind kind;

    /*
     * Resource entity tag (ETag).
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Description of the data collection endpoint.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The immutable ID of this data collection endpoint resource. This
     * property is READ-ONLY.
     */
    @JsonProperty(value = "properties.immutableId")
    private String immutableId;

    /*
     * The endpoint used by agents to access their configuration.
     */
    @JsonProperty(value = "properties.configurationAccess")
    private DataCollectionEndpointConfigurationAccess configurationAccess;

    /*
     * The endpoint used by clients to ingest logs.
     */
    @JsonProperty(value = "properties.logsIngestion")
    private DataCollectionEndpointLogsIngestion logsIngestion;

    /*
     * Network access control rules for the endpoints.
     */
    @JsonProperty(value = "properties.networkAcls")
    private DataCollectionEndpointNetworkAcls networkAcls;

    /*
     * The resource provisioning state. This property is READ-ONLY.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KnownDataCollectionEndpointProvisioningState provisioningState;

    /**
     * Get the kind property: The kind of the resource.
     *
     * @return the kind value.
     */
    public KnownDataCollectionEndpointResourceKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the resource.
     *
     * @param kind the kind value to set.
     * @return the DataCollectionEndpointResourceInner object itself.
     */
    public DataCollectionEndpointResourceInner withKind(KnownDataCollectionEndpointResourceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the etag property: Resource entity tag (ETag).
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: Description of the data collection endpoint.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the data collection endpoint.
     *
     * @param description the description value to set.
     * @return the DataCollectionEndpointResourceInner object itself.
     */
    public DataCollectionEndpointResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the immutableId property: The immutable ID of this data collection endpoint resource. This property is
     * READ-ONLY.
     *
     * @return the immutableId value.
     */
    public String immutableId() {
        return this.immutableId;
    }

    /**
     * Set the immutableId property: The immutable ID of this data collection endpoint resource. This property is
     * READ-ONLY.
     *
     * @param immutableId the immutableId value to set.
     * @return the DataCollectionEndpointResourceInner object itself.
     */
    public DataCollectionEndpointResourceInner withImmutableId(String immutableId) {
        this.immutableId = immutableId;
        return this;
    }

    /**
     * Get the configurationAccess property: The endpoint used by agents to access their configuration.
     *
     * @return the configurationAccess value.
     */
    public DataCollectionEndpointConfigurationAccess configurationAccess() {
        return this.configurationAccess;
    }

    /**
     * Set the configurationAccess property: The endpoint used by agents to access their configuration.
     *
     * @param configurationAccess the configurationAccess value to set.
     * @return the DataCollectionEndpointResourceInner object itself.
     */
    public DataCollectionEndpointResourceInner withConfigurationAccess(
        DataCollectionEndpointConfigurationAccess configurationAccess) {
        this.configurationAccess = configurationAccess;
        return this;
    }

    /**
     * Get the logsIngestion property: The endpoint used by clients to ingest logs.
     *
     * @return the logsIngestion value.
     */
    public DataCollectionEndpointLogsIngestion logsIngestion() {
        return this.logsIngestion;
    }

    /**
     * Set the logsIngestion property: The endpoint used by clients to ingest logs.
     *
     * @param logsIngestion the logsIngestion value to set.
     * @return the DataCollectionEndpointResourceInner object itself.
     */
    public DataCollectionEndpointResourceInner withLogsIngestion(DataCollectionEndpointLogsIngestion logsIngestion) {
        this.logsIngestion = logsIngestion;
        return this;
    }

    /**
     * Get the networkAcls property: Network access control rules for the endpoints.
     *
     * @return the networkAcls value.
     */
    public DataCollectionEndpointNetworkAcls networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set the networkAcls property: Network access control rules for the endpoints.
     *
     * @param networkAcls the networkAcls value to set.
     * @return the DataCollectionEndpointResourceInner object itself.
     */
    public DataCollectionEndpointResourceInner withNetworkAcls(DataCollectionEndpointNetworkAcls networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state. This property is READ-ONLY.
     *
     * @return the provisioningState value.
     */
    public KnownDataCollectionEndpointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionEndpointResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataCollectionEndpointResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configurationAccess() != null) {
            configurationAccess().validate();
        }
        if (logsIngestion() != null) {
            logsIngestion().validate();
        }
        if (networkAcls() != null) {
            networkAcls().validate();
        }
    }
}
