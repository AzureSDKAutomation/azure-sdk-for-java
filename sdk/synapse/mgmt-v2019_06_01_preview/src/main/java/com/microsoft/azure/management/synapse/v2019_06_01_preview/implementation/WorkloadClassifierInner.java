/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Workload classifier operations for a data warehouse.
 */
@JsonFlatten
public class WorkloadClassifierInner extends ProxyResource {
    /**
     * The workload classifier member name.
     */
    @JsonProperty(value = "properties.memberName", required = true)
    private String memberName;

    /**
     * The workload classifier label.
     */
    @JsonProperty(value = "properties.label")
    private String label;

    /**
     * The workload classifier context.
     */
    @JsonProperty(value = "properties.context")
    private String context;

    /**
     * The workload classifier start time for classification.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * The workload classifier end time for classification.
     */
    @JsonProperty(value = "properties.endTime")
    private DateTime endTime;

    /**
     * The workload classifier importance. There are five levels of importance:
     * low, below_normal, normal, above_normal, and high.
     */
    @JsonProperty(value = "properties.importance")
    private String importance;

    /**
     * Get the workload classifier member name.
     *
     * @return the memberName value
     */
    public String memberName() {
        return this.memberName;
    }

    /**
     * Set the workload classifier member name.
     *
     * @param memberName the memberName value to set
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get the workload classifier label.
     *
     * @return the label value
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the workload classifier label.
     *
     * @param label the label value to set
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the workload classifier context.
     *
     * @return the context value
     */
    public String context() {
        return this.context;
    }

    /**
     * Set the workload classifier context.
     *
     * @param context the context value to set
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withContext(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get the workload classifier start time for classification.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the workload classifier start time for classification.
     *
     * @param startTime the startTime value to set
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the workload classifier end time for classification.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the workload classifier end time for classification.
     *
     * @param endTime the endTime value to set
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withEndTime(DateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the workload classifier importance. There are five levels of importance: low, below_normal, normal, above_normal, and high.
     *
     * @return the importance value
     */
    public String importance() {
        return this.importance;
    }

    /**
     * Set the workload classifier importance. There are five levels of importance: low, below_normal, normal, above_normal, and high.
     *
     * @param importance the importance value to set
     * @return the WorkloadClassifierInner object itself.
     */
    public WorkloadClassifierInner withImportance(String importance) {
        this.importance = importance;
        return this;
    }

}
