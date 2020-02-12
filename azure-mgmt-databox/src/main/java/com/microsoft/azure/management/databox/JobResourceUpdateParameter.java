/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The JobResourceUpdateParameter.
 */
@JsonFlatten
public class JobResourceUpdateParameter {
    /**
     * Details of a job to be updated.
     */
    @JsonProperty(value = "properties.details")
    private UpdateJobDetails details;

    /**
     * Destination account details.
     */
    @JsonProperty(value = "properties.destinationAccountDetails")
    private List<DestinationAccountDetails> destinationAccountDetails;

    /**
     * The list of key value pairs that describe the resource. These tags can
     * be used in viewing and grouping this resource (across resource groups).
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get details of a job to be updated.
     *
     * @return the details value
     */
    public UpdateJobDetails details() {
        return this.details;
    }

    /**
     * Set details of a job to be updated.
     *
     * @param details the details value to set
     * @return the JobResourceUpdateParameter object itself.
     */
    public JobResourceUpdateParameter withDetails(UpdateJobDetails details) {
        this.details = details;
        return this;
    }

    /**
     * Get destination account details.
     *
     * @return the destinationAccountDetails value
     */
    public List<DestinationAccountDetails> destinationAccountDetails() {
        return this.destinationAccountDetails;
    }

    /**
     * Set destination account details.
     *
     * @param destinationAccountDetails the destinationAccountDetails value to set
     * @return the JobResourceUpdateParameter object itself.
     */
    public JobResourceUpdateParameter withDestinationAccountDetails(List<DestinationAccountDetails> destinationAccountDetails) {
        this.destinationAccountDetails = destinationAccountDetails;
        return this;
    }

    /**
     * Get the list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the list of key value pairs that describe the resource. These tags can be used in viewing and grouping this resource (across resource groups).
     *
     * @param tags the tags value to set
     * @return the JobResourceUpdateParameter object itself.
     */
    public JobResourceUpdateParameter withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
