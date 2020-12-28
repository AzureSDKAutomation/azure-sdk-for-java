// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The publishing profile of a gallery Image Version. */
@Fluent
public final class GalleryApplicationVersionPublishingProfile extends GalleryArtifactPublishingProfileBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GalleryApplicationVersionPublishingProfile.class);

    /*
     * The source image from which the Image Version is going to be created.
     */
    @JsonProperty(value = "source", required = true)
    private UserArtifactSource source;

    /*
     * Optional. May be used to help process this file. The type of file
     * contained in the source, e.g. zip, json, etc.
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /*
     * Optional. Whether or not this application reports health.
     */
    @JsonProperty(value = "enableHealthCheck")
    private Boolean enableHealthCheck;

    /**
     * Get the source property: The source image from which the Image Version is going to be created.
     *
     * @return the source value.
     */
    public UserArtifactSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source image from which the Image Version is going to be created.
     *
     * @param source the source value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withSource(UserArtifactSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the contentType property: Optional. May be used to help process this file. The type of file contained in the
     * source, e.g. zip, json, etc.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: Optional. May be used to help process this file. The type of file contained in the
     * source, e.g. zip, json, etc.
     *
     * @param contentType the contentType value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the enableHealthCheck property: Optional. Whether or not this application reports health.
     *
     * @return the enableHealthCheck value.
     */
    public Boolean enableHealthCheck() {
        return this.enableHealthCheck;
    }

    /**
     * Set the enableHealthCheck property: Optional. Whether or not this application reports health.
     *
     * @param enableHealthCheck the enableHealthCheck value to set.
     * @return the GalleryApplicationVersionPublishingProfile object itself.
     */
    public GalleryApplicationVersionPublishingProfile withEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withTargetRegions(List<TargetRegion> targetRegions) {
        super.withTargetRegions(targetRegions);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withReplicaCount(Integer replicaCount) {
        super.withReplicaCount(replicaCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withExcludeFromLatest(Boolean excludeFromLatest) {
        super.withExcludeFromLatest(excludeFromLatest);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        super.withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryApplicationVersionPublishingProfile withStorageAccountType(StorageAccountType storageAccountType) {
        super.withStorageAccountType(storageAccountType);
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
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property source in model GalleryApplicationVersionPublishingProfile"));
        } else {
            source().validate();
        }
    }
}
