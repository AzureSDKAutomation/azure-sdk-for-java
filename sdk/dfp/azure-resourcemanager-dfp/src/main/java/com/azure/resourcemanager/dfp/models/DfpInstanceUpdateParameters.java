// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dfp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Provision request specification. */
@JsonFlatten
@Fluent
public class DfpInstanceUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DfpInstanceUpdateParameters.class);

    /*
     * Key-value pairs of additional provisioning properties.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * A collection of DFP instance administrators
     */
    @JsonProperty(value = "properties.administration")
    private DfpInstanceAdministrators administration;

    /**
     * Get the tags property: Key-value pairs of additional provisioning properties.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Key-value pairs of additional provisioning properties.
     *
     * @param tags the tags value to set.
     * @return the DfpInstanceUpdateParameters object itself.
     */
    public DfpInstanceUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the administration property: A collection of DFP instance administrators.
     *
     * @return the administration value.
     */
    public DfpInstanceAdministrators administration() {
        return this.administration;
    }

    /**
     * Set the administration property: A collection of DFP instance administrators.
     *
     * @param administration the administration value to set.
     * @return the DfpInstanceUpdateParameters object itself.
     */
    public DfpInstanceUpdateParameters withAdministration(DfpInstanceAdministrators administration) {
        this.administration = administration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (administration() != null) {
            administration().validate();
        }
    }
}
