/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A locality hint that can be used by the Batch service to select a Compute
 * Node on which to start a Task.
 */
public class AffinityInformation {
    /**
     * An opaque string representing the location of a Compute Node or a Task
     * that has run previously.
     * You can pass the affinityId of a Node to indicate that this Task needs
     * to run on that Compute Node. Note that this is just a soft affinity. If
     * the target Compute Node is busy or unavailable at the time the Task is
     * scheduled, then the Task will be scheduled elsewhere.
     */
    @JsonProperty(value = "affinityId", required = true)
    private String affinityId;

    /**
     * Get you can pass the affinityId of a Node to indicate that this Task needs to run on that Compute Node. Note that this is just a soft affinity. If the target Compute Node is busy or unavailable at the time the Task is scheduled, then the Task will be scheduled elsewhere.
     *
     * @return the affinityId value
     */
    public String affinityId() {
        return this.affinityId;
    }

    /**
     * Set you can pass the affinityId of a Node to indicate that this Task needs to run on that Compute Node. Note that this is just a soft affinity. If the target Compute Node is busy or unavailable at the time the Task is scheduled, then the Task will be scheduled elsewhere.
     *
     * @param affinityId the affinityId value to set
     * @return the AffinityInformation object itself.
     */
    public AffinityInformation withAffinityId(String affinityId) {
        this.affinityId = affinityId;
        return this;
    }

}
