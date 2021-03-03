// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.adp.models.DataPoolLocation;
import com.azure.resourcemanager.adp.models.ProvisioningState;
import com.azure.resourcemanager.adp.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ADP Data Pool. */
@JsonFlatten
@Fluent
public class DataPoolInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataPoolInner.class);

    /*
     * The Data Pool's data-plane ID
     */
    @JsonProperty(value = "properties.dataPoolId", access = JsonProperty.Access.WRITE_ONLY)
    private String dataPoolId;

    /*
     * Gets the status of the data pool at the time the operation was called
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Gets or sets the collection of locations where Data Pool resources
     * should be created
     */
    @JsonProperty(value = "properties.locations")
    private List<DataPoolLocation> locations;

    /*
     * The system meta data relating to this resource
     */
    @JsonProperty(value = "properties.systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the dataPoolId property: The Data Pool's data-plane ID.
     *
     * @return the dataPoolId value.
     */
    public String dataPoolId() {
        return this.dataPoolId;
    }

    /**
     * Get the provisioningState property: Gets the status of the data pool at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the locations property: Gets or sets the collection of locations where Data Pool resources should be created.
     *
     * @return the locations value.
     */
    public List<DataPoolLocation> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Gets or sets the collection of locations where Data Pool resources should be created.
     *
     * @param locations the locations value to set.
     * @return the DataPoolInner object itself.
     */
    public DataPoolInner withLocations(List<DataPoolLocation> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
