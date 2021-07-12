// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.RecoveryPointInner;

/** An immutable client-side representation of RecoveryPoint. */
public interface RecoveryPoint {
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
     * Gets the properties property: The recovery point properties.
     *
     * @return the properties value.
     */
    RecoveryPointProperties properties();

    /**
     * Gets the location property: Resource Location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.RecoveryPointInner object.
     *
     * @return the inner object.
     */
    RecoveryPointInner innerModel();
}
