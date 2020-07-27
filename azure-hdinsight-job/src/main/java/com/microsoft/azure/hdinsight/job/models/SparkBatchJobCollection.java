/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.hdinsight.job.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SparkBatchJobCollection model.
 */
public class SparkBatchJobCollection {
    /**
     * The from property.
     */
    @JsonProperty(value = "from")
    private Integer from;

    /**
     * The total property.
     */
    @JsonProperty(value = "total")
    private Integer total;

    /**
     * The sessions property.
     */
    @JsonProperty(value = "sessions")
    private List<SparkBatchJob> sessions;

    /**
     * Get the from value.
     *
     * @return the from value
     */
    public Integer from() {
        return this.from;
    }

    /**
     * Set the from value.
     *
     * @param from the from value to set
     * @return the SparkBatchJobCollection object itself.
     */
    public SparkBatchJobCollection withFrom(Integer from) {
        this.from = from;
        return this;
    }

    /**
     * Get the total value.
     *
     * @return the total value
     */
    public Integer total() {
        return this.total;
    }

    /**
     * Set the total value.
     *
     * @param total the total value to set
     * @return the SparkBatchJobCollection object itself.
     */
    public SparkBatchJobCollection withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get the sessions value.
     *
     * @return the sessions value
     */
    public List<SparkBatchJob> sessions() {
        return this.sessions;
    }

    /**
     * Set the sessions value.
     *
     * @param sessions the sessions value to set
     * @return the SparkBatchJobCollection object itself.
     */
    public SparkBatchJobCollection withSessions(List<SparkBatchJob> sessions) {
        this.sessions = sessions;
        return this;
    }

}
