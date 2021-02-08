// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.resourcemanager.monitor.generated.fluent.models.MetricNamespaceInner;

/** An immutable client-side representation of MetricNamespace. */
public interface MetricNamespace {
    /**
     * Gets the id property: The ID of the metricNamespace.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: The type of the namespace.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the name property: The name of the namespace.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the properties property: Properties which include the fully qualified namespace name.
     *
     * @return the properties value.
     */
    MetricNamespaceName properties();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.MetricNamespaceInner object.
     *
     * @return the inner object.
     */
    MetricNamespaceInner innerModel();
}