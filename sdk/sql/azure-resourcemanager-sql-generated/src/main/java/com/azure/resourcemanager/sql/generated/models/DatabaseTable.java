// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.DatabaseTableInner;

/** An immutable client-side representation of DatabaseTable. */
public interface DatabaseTable {
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
     * Gets the temporalType property: The table temporal type.
     *
     * @return the temporalType value.
     */
    TableTemporalType temporalType();

    /**
     * Gets the memoryOptimized property: Whether or not the table is memory optimized.
     *
     * @return the memoryOptimized value.
     */
    Boolean memoryOptimized();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.DatabaseTableInner object.
     *
     * @return the inner object.
     */
    DatabaseTableInner innerModel();
}
