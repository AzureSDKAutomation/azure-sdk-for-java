// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The CustomRolloutStatus model. */
@Fluent
public class CustomRolloutStatus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomRolloutStatus.class);

    /*
     * The completedRegions property.
     */
    @JsonProperty(value = "completedRegions")
    private List<String> completedRegions;

    /*
     * Dictionary of <ExtendedErrorInfo>
     */
    @JsonProperty(value = "failedOrSkippedRegions")
    private Map<String, ExtendedErrorInfo> failedOrSkippedRegions;

    /**
     * Get the completedRegions property: The completedRegions property.
     *
     * @return the completedRegions value.
     */
    public List<String> completedRegions() {
        return this.completedRegions;
    }

    /**
     * Set the completedRegions property: The completedRegions property.
     *
     * @param completedRegions the completedRegions value to set.
     * @return the CustomRolloutStatus object itself.
     */
    public CustomRolloutStatus withCompletedRegions(List<String> completedRegions) {
        this.completedRegions = completedRegions;
        return this;
    }

    /**
     * Get the failedOrSkippedRegions property: Dictionary of &lt;ExtendedErrorInfo&gt;.
     *
     * @return the failedOrSkippedRegions value.
     */
    public Map<String, ExtendedErrorInfo> failedOrSkippedRegions() {
        return this.failedOrSkippedRegions;
    }

    /**
     * Set the failedOrSkippedRegions property: Dictionary of &lt;ExtendedErrorInfo&gt;.
     *
     * @param failedOrSkippedRegions the failedOrSkippedRegions value to set.
     * @return the CustomRolloutStatus object itself.
     */
    public CustomRolloutStatus withFailedOrSkippedRegions(Map<String, ExtendedErrorInfo> failedOrSkippedRegions) {
        this.failedOrSkippedRegions = failedOrSkippedRegions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (failedOrSkippedRegions() != null) {
            failedOrSkippedRegions()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
