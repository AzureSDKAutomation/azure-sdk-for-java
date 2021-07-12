// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ImportImageParameters model. */
@Fluent
public final class ImportImageParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportImageParameters.class);

    /*
     * The source of the image.
     */
    @JsonProperty(value = "source", required = true)
    private ImportSource source;

    /*
     * List of strings of the form repo[:tag]. When tag is omitted the source
     * will be used (or 'latest' if source tag is also omitted).
     */
    @JsonProperty(value = "targetTags")
    private List<String> targetTags;

    /*
     * List of strings of repository names to do a manifest only copy. No tag
     * will be created.
     */
    @JsonProperty(value = "untaggedTargetRepositories")
    private List<String> untaggedTargetRepositories;

    /*
     * When Force, any existing target tags will be overwritten. When NoForce,
     * any existing target tags will fail the operation before any copying
     * begins.
     */
    @JsonProperty(value = "mode")
    private ImportMode mode;

    /**
     * Get the source property: The source of the image.
     *
     * @return the source value.
     */
    public ImportSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source of the image.
     *
     * @param source the source value to set.
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withSource(ImportSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the targetTags property: List of strings of the form repo[:tag]. When tag is omitted the source will be used
     * (or 'latest' if source tag is also omitted).
     *
     * @return the targetTags value.
     */
    public List<String> targetTags() {
        return this.targetTags;
    }

    /**
     * Set the targetTags property: List of strings of the form repo[:tag]. When tag is omitted the source will be used
     * (or 'latest' if source tag is also omitted).
     *
     * @param targetTags the targetTags value to set.
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withTargetTags(List<String> targetTags) {
        this.targetTags = targetTags;
        return this;
    }

    /**
     * Get the untaggedTargetRepositories property: List of strings of repository names to do a manifest only copy. No
     * tag will be created.
     *
     * @return the untaggedTargetRepositories value.
     */
    public List<String> untaggedTargetRepositories() {
        return this.untaggedTargetRepositories;
    }

    /**
     * Set the untaggedTargetRepositories property: List of strings of repository names to do a manifest only copy. No
     * tag will be created.
     *
     * @param untaggedTargetRepositories the untaggedTargetRepositories value to set.
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withUntaggedTargetRepositories(List<String> untaggedTargetRepositories) {
        this.untaggedTargetRepositories = untaggedTargetRepositories;
        return this;
    }

    /**
     * Get the mode property: When Force, any existing target tags will be overwritten. When NoForce, any existing
     * target tags will fail the operation before any copying begins.
     *
     * @return the mode value.
     */
    public ImportMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: When Force, any existing target tags will be overwritten. When NoForce, any existing
     * target tags will fail the operation before any copying begins.
     *
     * @param mode the mode value to set.
     * @return the ImportImageParameters object itself.
     */
    public ImportImageParameters withMode(ImportMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property source in model ImportImageParameters"));
        } else {
            source().validate();
        }
    }
}
