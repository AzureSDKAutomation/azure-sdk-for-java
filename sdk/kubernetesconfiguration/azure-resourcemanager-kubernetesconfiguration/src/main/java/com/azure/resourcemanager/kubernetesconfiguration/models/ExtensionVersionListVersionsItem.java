// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ExtensionVersionListVersionsItem model. */
@Fluent
public final class ExtensionVersionListVersionsItem {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExtensionVersionListVersionsItem.class);

    /*
     * The release train for this Extension Type
     */
    @JsonProperty(value = "releaseTrain")
    private String releaseTrain;

    /*
     * Versions available for this Extension Type and release train
     */
    @JsonProperty(value = "versions")
    private List<String> versions;

    /**
     * Get the releaseTrain property: The release train for this Extension Type.
     *
     * @return the releaseTrain value.
     */
    public String releaseTrain() {
        return this.releaseTrain;
    }

    /**
     * Set the releaseTrain property: The release train for this Extension Type.
     *
     * @param releaseTrain the releaseTrain value to set.
     * @return the ExtensionVersionListVersionsItem object itself.
     */
    public ExtensionVersionListVersionsItem withReleaseTrain(String releaseTrain) {
        this.releaseTrain = releaseTrain;
        return this;
    }

    /**
     * Get the versions property: Versions available for this Extension Type and release train.
     *
     * @return the versions value.
     */
    public List<String> versions() {
        return this.versions;
    }

    /**
     * Set the versions property: Versions available for this Extension Type and release train.
     *
     * @param versions the versions value to set.
     * @return the ExtensionVersionListVersionsItem object itself.
     */
    public ExtensionVersionListVersionsItem withVersions(List<String> versions) {
        this.versions = versions;
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
