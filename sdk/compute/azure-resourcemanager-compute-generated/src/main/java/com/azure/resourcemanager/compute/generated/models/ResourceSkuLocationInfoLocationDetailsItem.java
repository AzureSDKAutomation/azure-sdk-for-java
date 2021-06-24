// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceSkuLocationInfoLocationDetailsItem model. */
@Fluent
public final class ResourceSkuLocationInfoLocationDetailsItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceSkuLocationInfoLocationDetailsItem.class);

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private List<String> name;

    /*
     * The capabilities property.
     */
    @JsonProperty(value = "capabilities")
    private List<
            ComponentsDyi6M1SchemasResourceskulocationinfoPropertiesLocationdetailsItemsPropertiesCapabilitiesItems>
        capabilities;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public List<String> name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResourceSkuLocationInfoLocationDetailsItem object itself.
     */
    public ResourceSkuLocationInfoLocationDetailsItem withName(List<String> name) {
        this.name = name;
        return this;
    }

    /**
     * Get the capabilities property: The capabilities property.
     *
     * @return the capabilities value.
     */
    public List<ComponentsDyi6M1SchemasResourceskulocationinfoPropertiesLocationdetailsItemsPropertiesCapabilitiesItems>
        capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The capabilities property.
     *
     * @param capabilities the capabilities value to set.
     * @return the ResourceSkuLocationInfoLocationDetailsItem object itself.
     */
    public ResourceSkuLocationInfoLocationDetailsItem withCapabilities(
        List<ComponentsDyi6M1SchemasResourceskulocationinfoPropertiesLocationdetailsItemsPropertiesCapabilitiesItems>
            capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
    }
}
