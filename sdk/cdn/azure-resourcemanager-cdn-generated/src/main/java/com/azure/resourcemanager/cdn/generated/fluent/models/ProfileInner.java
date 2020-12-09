// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.generated.models.ProfileResourceState;
import com.azure.resourcemanager.cdn.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * CDN profile is a logical grouping of endpoints that share the same settings, such as CDN provider and pricing tier.
 */
@JsonFlatten
@Fluent
public class ProfileInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProfileInner.class);

    /*
     * The pricing tier (defines a CDN provider, feature list and rate) of the
     * CDN profile.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Resource status of the profile.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private ProfileResourceState resourceState;

    /*
     * Provisioning status of the profile.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     *
     * @param sku the sku value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the resourceState property: Resource status of the profile.
     *
     * @return the resourceState value.
     */
    public ProfileResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState property: Provisioning status of the profile.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ProfileInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProfileInner withTags(Map<String, String> tags) {
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
                    new IllegalArgumentException("Missing required property sku in model ProfileInner"));
        } else {
            sku().validate();
        }
    }
}
