// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Trigger based on request execution time. */
@Fluent
public final class SlowRequestsBasedTrigger {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SlowRequestsBasedTrigger.class);

    /*
     * Time taken.
     */
    @JsonProperty(value = "timeTaken")
    private String timeTaken;

    /*
     * Request Path.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Request Count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Time interval.
     */
    @JsonProperty(value = "timeInterval")
    private String timeInterval;

    /**
     * Get the timeTaken property: Time taken.
     *
     * @return the timeTaken value.
     */
    public String timeTaken() {
        return this.timeTaken;
    }

    /**
     * Set the timeTaken property: Time taken.
     *
     * @param timeTaken the timeTaken value to set.
     * @return the SlowRequestsBasedTrigger object itself.
     */
    public SlowRequestsBasedTrigger withTimeTaken(String timeTaken) {
        this.timeTaken = timeTaken;
        return this;
    }

    /**
     * Get the path property: Request Path.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Request Path.
     *
     * @param path the path value to set.
     * @return the SlowRequestsBasedTrigger object itself.
     */
    public SlowRequestsBasedTrigger withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the count property: Request Count.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Request Count.
     *
     * @param count the count value to set.
     * @return the SlowRequestsBasedTrigger object itself.
     */
    public SlowRequestsBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval property: Time interval.
     *
     * @return the timeInterval value.
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval property: Time interval.
     *
     * @param timeInterval the timeInterval value to set.
     * @return the SlowRequestsBasedTrigger object itself.
     */
    public SlowRequestsBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
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
