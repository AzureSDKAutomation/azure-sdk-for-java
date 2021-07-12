// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.models.PirSharedGalleryResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Specifies information about the gallery image version that you want to create or update. */
@JsonFlatten
@Fluent
public class SharedGalleryImageVersionInner extends PirSharedGalleryResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedGalleryImageVersionInner.class);

    /*
     * The published date of the gallery image version Definition. This
     * property can be used for decommissioning purposes. This property is
     * updatable.
     */
    @JsonProperty(value = "properties.publishedDate")
    private OffsetDateTime publishedDate;

    /*
     * The end of life date of the gallery image version Definition. This
     * property can be used for decommissioning purposes. This property is
     * updatable.
     */
    @JsonProperty(value = "properties.endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /**
     * Get the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Set the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @param publishedDate the publishedDate value to set.
     * @return the SharedGalleryImageVersionInner object itself.
     */
    public SharedGalleryImageVersionInner withPublishedDate(OffsetDateTime publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the SharedGalleryImageVersionInner object itself.
     */
    public SharedGalleryImageVersionInner withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SharedGalleryImageVersionInner withUniqueId(String uniqueId) {
        super.withUniqueId(uniqueId);
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
    }
}
