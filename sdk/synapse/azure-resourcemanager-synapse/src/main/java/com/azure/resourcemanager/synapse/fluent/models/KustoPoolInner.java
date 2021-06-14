// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.EngineType;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.azure.resourcemanager.synapse.models.State;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Class representing a Kusto kusto pool. */
@JsonFlatten
@Fluent
public class KustoPoolInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KustoPoolInner.class);

    /*
     * The SKU of the kusto pool.
     */
    @JsonProperty(value = "sku", required = true)
    private AzureSku sku;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The state of the resource.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private State state;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ResourceProvisioningState provisioningState;

    /*
     * The Kusto Pool URI.
     */
    @JsonProperty(value = "properties.uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * The Kusto Pool data ingestion URI.
     */
    @JsonProperty(value = "properties.dataIngestionUri", access = JsonProperty.Access.WRITE_ONLY)
    private String dataIngestionUri;

    /*
     * The reason for the Kusto Pool's current state.
     */
    @JsonProperty(value = "properties.stateReason", access = JsonProperty.Access.WRITE_ONLY)
    private String stateReason;

    /*
     * The engine type
     */
    @JsonProperty(value = "properties.engineType")
    private EngineType engineType;

    /*
     * The workspace unique identifier.
     */
    @JsonProperty(value = "properties.workspaceUid")
    private String workspaceUid;

    /**
     * Get the sku property: The SKU of the kusto pool.
     *
     * @return the sku value.
     */
    public AzureSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU of the kusto pool.
     *
     * @param sku the sku value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withSku(AzureSku sku) {
        this.sku = sku;
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
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the state property: The state of the resource.
     *
     * @return the state value.
     */
    public State state() {
        return this.state;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uri property: The Kusto Pool URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get the dataIngestionUri property: The Kusto Pool data ingestion URI.
     *
     * @return the dataIngestionUri value.
     */
    public String dataIngestionUri() {
        return this.dataIngestionUri;
    }

    /**
     * Get the stateReason property: The reason for the Kusto Pool's current state.
     *
     * @return the stateReason value.
     */
    public String stateReason() {
        return this.stateReason;
    }

    /**
     * Get the engineType property: The engine type.
     *
     * @return the engineType value.
     */
    public EngineType engineType() {
        return this.engineType;
    }

    /**
     * Set the engineType property: The engine type.
     *
     * @param engineType the engineType value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withEngineType(EngineType engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * Get the workspaceUid property: The workspace unique identifier.
     *
     * @return the workspaceUid value.
     */
    public String workspaceUid() {
        return this.workspaceUid;
    }

    /**
     * Set the workspaceUid property: The workspace unique identifier.
     *
     * @param workspaceUid the workspaceUid value to set.
     * @return the KustoPoolInner object itself.
     */
    public KustoPoolInner withWorkspaceUid(String workspaceUid) {
        this.workspaceUid = workspaceUid;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KustoPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public KustoPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model KustoPoolInner"));
        } else {
            sku().validate();
        }
    }
}
