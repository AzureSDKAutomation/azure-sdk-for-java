/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2017_04_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Description of a NotificationHub Resource.
 */
@JsonFlatten
@SkipParentValidation
public class DebugSendResponseInner extends Resource {
    /**
     * successful send.
     */
    @JsonProperty(value = "properties.success")
    private Double success;

    /**
     * send failure.
     */
    @JsonProperty(value = "properties.failure")
    private Double failure;

    /**
     * actual failure description.
     */
    @JsonProperty(value = "properties.results")
    private Object results;

    /**
     * Get successful send.
     *
     * @return the success value
     */
    public Double success() {
        return this.success;
    }

    /**
     * Set successful send.
     *
     * @param success the success value to set
     * @return the DebugSendResponseInner object itself.
     */
    public DebugSendResponseInner withSuccess(Double success) {
        this.success = success;
        return this;
    }

    /**
     * Get send failure.
     *
     * @return the failure value
     */
    public Double failure() {
        return this.failure;
    }

    /**
     * Set send failure.
     *
     * @param failure the failure value to set
     * @return the DebugSendResponseInner object itself.
     */
    public DebugSendResponseInner withFailure(Double failure) {
        this.failure = failure;
        return this;
    }

    /**
     * Get actual failure description.
     *
     * @return the results value
     */
    public Object results() {
        return this.results;
    }

    /**
     * Set actual failure description.
     *
     * @param results the results value to set
     * @return the DebugSendResponseInner object itself.
     */
    public DebugSendResponseInner withResults(Object results) {
        this.results = results;
        return this;
    }

}
