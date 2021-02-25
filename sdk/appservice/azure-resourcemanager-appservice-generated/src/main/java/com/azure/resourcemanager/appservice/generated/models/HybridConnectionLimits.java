// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.HybridConnectionLimitsInner;

/** An immutable client-side representation of HybridConnectionLimits. */
public interface HybridConnectionLimits {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the current property: The current number of Hybrid Connections.
     *
     * @return the current value.
     */
    Integer current();

    /**
     * Gets the maximum property: The maximum number of Hybrid Connections allowed.
     *
     * @return the maximum value.
     */
    Integer maximum();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.HybridConnectionLimitsInner object.
     *
     * @return the inner object.
     */
    HybridConnectionLimitsInner innerModel();
}
