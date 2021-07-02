// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.redis.generated.models.ScheduleEntry;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response to put/get patch schedules for Redis cache. */
@JsonFlatten
@Fluent
public class RedisPatchScheduleInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RedisPatchScheduleInner.class);

    /*
     * List of patch schedules for a Redis cache.
     */
    @JsonProperty(value = "properties.scheduleEntries", required = true)
    private List<ScheduleEntry> scheduleEntries;

    /**
     * Get the scheduleEntries property: List of patch schedules for a Redis cache.
     *
     * @return the scheduleEntries value.
     */
    public List<ScheduleEntry> scheduleEntries() {
        return this.scheduleEntries;
    }

    /**
     * Set the scheduleEntries property: List of patch schedules for a Redis cache.
     *
     * @param scheduleEntries the scheduleEntries value to set.
     * @return the RedisPatchScheduleInner object itself.
     */
    public RedisPatchScheduleInner withScheduleEntries(List<ScheduleEntry> scheduleEntries) {
        this.scheduleEntries = scheduleEntries;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scheduleEntries() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property scheduleEntries in model RedisPatchScheduleInner"));
        } else {
            scheduleEntries().forEach(e -> e.validate());
        }
    }
}
