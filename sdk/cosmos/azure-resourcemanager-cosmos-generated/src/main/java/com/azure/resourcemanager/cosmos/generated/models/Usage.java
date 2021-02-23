// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated.models;

import com.azure.resourcemanager.cosmos.generated.fluent.models.UsageInner;

/** An immutable client-side representation of Usage. */
public interface Usage {
    /**
     * Gets the unit property: The unit of the metric.
     *
     * @return the unit value.
     */
    UnitType unit();

    /**
     * Gets the name property: The name information for the metric.
     *
     * @return the name value.
     */
    MetricName name();

    /**
     * Gets the quotaPeriod property: The quota period used to summarize the usage values.
     *
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * Gets the limit property: Maximum value for this metric.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the currentValue property: Current value for this metric.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the inner com.azure.resourcemanager.cosmos.generated.fluent.models.UsageInner object.
     *
     * @return the inner object.
     */
    UsageInner innerModel();
}
