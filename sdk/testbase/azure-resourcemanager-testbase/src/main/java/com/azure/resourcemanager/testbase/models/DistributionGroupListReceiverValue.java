// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The user object receiver value. */
@Fluent
public final class DistributionGroupListReceiverValue {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DistributionGroupListReceiverValue.class);

    /*
     * The list of distribution groups.
     */
    @JsonProperty(value = "distributionGroups")
    private List<String> distributionGroups;

    /**
     * Get the distributionGroups property: The list of distribution groups.
     *
     * @return the distributionGroups value.
     */
    public List<String> distributionGroups() {
        return this.distributionGroups;
    }

    /**
     * Set the distributionGroups property: The list of distribution groups.
     *
     * @param distributionGroups the distributionGroups value to set.
     * @return the DistributionGroupListReceiverValue object itself.
     */
    public DistributionGroupListReceiverValue withDistributionGroups(List<String> distributionGroups) {
        this.distributionGroups = distributionGroups;
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
