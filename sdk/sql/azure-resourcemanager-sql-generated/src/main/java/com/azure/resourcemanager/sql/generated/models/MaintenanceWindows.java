// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.resourcemanager.sql.generated.fluent.models.MaintenanceWindowsInner;
import java.util.List;

/** An immutable client-side representation of MaintenanceWindows. */
public interface MaintenanceWindows {
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
     * Gets the timeRanges property: The timeRanges property.
     *
     * @return the timeRanges value.
     */
    List<MaintenanceWindowTimeRange> timeRanges();

    /**
     * Gets the inner com.azure.resourcemanager.sql.generated.fluent.models.MaintenanceWindowsInner object.
     *
     * @return the inner object.
     */
    MaintenanceWindowsInner innerModel();
}
