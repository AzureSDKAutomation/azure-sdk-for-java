// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.resourcemanager.datadog.fluent.models.MonitoredResourceInner;

/** An immutable client-side representation of MonitoredResource. */
public interface MonitoredResource {
    /**
     * Gets the id property: The ARM id of the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the sendingMetrics property: Flag indicating if resource is sending metrics to Datadog.
     *
     * @return the sendingMetrics value.
     */
    Boolean sendingMetrics();

    /**
     * Gets the reasonForMetricsStatus property: Reason for why the resource is sending metrics (or why it is not
     * sending).
     *
     * @return the reasonForMetricsStatus value.
     */
    String reasonForMetricsStatus();

    /**
     * Gets the sendingLogs property: Flag indicating if resource is sending logs to Datadog.
     *
     * @return the sendingLogs value.
     */
    Boolean sendingLogs();

    /**
     * Gets the reasonForLogsStatus property: Reason for why the resource is sending logs (or why it is not sending).
     *
     * @return the reasonForLogsStatus value.
     */
    String reasonForLogsStatus();

    /**
     * Gets the inner com.azure.resourcemanager.datadog.fluent.models.MonitoredResourceInner object.
     *
     * @return the inner object.
     */
    MonitoredResourceInner innerModel();
}
