// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents an image from the Azure Marketplace. */
@JsonFlatten
@Fluent
public class GalleryImageFragment extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryImageFragment.class);

    /*
     * Indicates whether this gallery image is enabled.
     */
    @JsonProperty(value = "properties.isEnabled")
    private Boolean isEnabled;

    /*
     * Indicates whether this gallery has been overridden for this lab account
     */
    @JsonProperty(value = "properties.isOverride")
    private Boolean isOverride;

    /*
     * Indicates if the plan has been authorized for programmatic deployment.
     */
    @JsonProperty(value = "properties.isPlanAuthorized")
    private Boolean isPlanAuthorized;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the isEnabled property: Indicates whether this gallery image is enabled.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Indicates whether this gallery image is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the GalleryImageFragment object itself.
     */
    public GalleryImageFragment withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the isOverride property: Indicates whether this gallery has been overridden for this lab account.
     *
     * @return the isOverride value.
     */
    public Boolean isOverride() {
        return this.isOverride;
    }

    /**
     * Set the isOverride property: Indicates whether this gallery has been overridden for this lab account.
     *
     * @param isOverride the isOverride value to set.
     * @return the GalleryImageFragment object itself.
     */
    public GalleryImageFragment withIsOverride(Boolean isOverride) {
        this.isOverride = isOverride;
        return this;
    }

    /**
     * Get the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     *
     * @return the isPlanAuthorized value.
     */
    public Boolean isPlanAuthorized() {
        return this.isPlanAuthorized;
    }

    /**
     * Set the isPlanAuthorized property: Indicates if the plan has been authorized for programmatic deployment.
     *
     * @param isPlanAuthorized the isPlanAuthorized value to set.
     * @return the GalleryImageFragment object itself.
     */
    public GalleryImageFragment withIsPlanAuthorized(Boolean isPlanAuthorized) {
        this.isPlanAuthorized = isPlanAuthorized;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the GalleryImageFragment object itself.
     */
    public GalleryImageFragment withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set.
     * @return the GalleryImageFragment object itself.
     */
    public GalleryImageFragment withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageFragment withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageFragment withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
