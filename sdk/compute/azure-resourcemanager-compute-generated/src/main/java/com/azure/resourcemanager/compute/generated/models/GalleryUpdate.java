// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Specifies information about the Shared Image Gallery that you want to update. */
@JsonFlatten
@Fluent
public class GalleryUpdate extends UpdateResourceDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryUpdate.class);

    /*
     * The description of this Shared Image Gallery resource. This property is
     * updatable.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * Describes the gallery unique name.
     */
    @JsonProperty(value = "properties.identifier")
    private GalleryIdentifier identifier;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryPropertiesProvisioningState provisioningState;

    /**
     * Get the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @param description the description value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the identifier property: Describes the gallery unique name.
     *
     * @return the identifier value.
     */
    public GalleryIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Describes the gallery unique name.
     *
     * @param identifier the identifier value to set.
     * @return the GalleryUpdate object itself.
     */
    public GalleryUpdate withIdentifier(GalleryIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryPropertiesProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (identifier() != null) {
            identifier().validate();
        }
    }
}
