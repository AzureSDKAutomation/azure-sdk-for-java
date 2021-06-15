// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.resourcemanager.monitor.generated.fluent.models.MetricInner;
import java.util.List;

/** An immutable client-side representation of Metric. */
public interface Metric {
    /**
     * Gets the id property: the metric Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: the resource type of the metric resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the name property: the name and the display name of the metric, i.e. it is localizable string.
     *
     * @return the name value.
     */
    LocalizableString name();

    /**
     * Gets the displayDescription property: Detailed description of this metric.
     *
     * @return the displayDescription value.
     */
    String displayDescription();

    /**
     * Gets the errorCode property: 'Success' or the error details on query failures for this metric.
     *
     * @return the errorCode value.
     */
    String errorCode();

    /**
     * Gets the unit property: the unit of the metric.
     *
     * @return the unit value.
     */
    MetricUnit unit();

    /**
     * Gets the timeseries property: the time series returned when a data query is performed.
     *
     * @return the timeseries value.
     */
    List<TimeSeriesElement> timeseries();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.MetricInner object.
     *
     * @return the inner object.
     */
    MetricInner innerModel();
}
