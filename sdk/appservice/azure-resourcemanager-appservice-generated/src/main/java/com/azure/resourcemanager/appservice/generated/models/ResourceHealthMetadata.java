// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.ResourceHealthMetadataInner;

/** An immutable client-side representation of ResourceHealthMetadata. */
public interface ResourceHealthMetadata {
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
     * Gets the category property: The category that the resource matches in the RHC Policy File.
     *
     * @return the category value.
     */
    String category();

    /**
     * Gets the signalAvailability property: Is there a health signal for the resource.
     *
     * @return the signalAvailability value.
     */
    Boolean signalAvailability();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ResourceHealthMetadataInner object.
     *
     * @return the inner object.
     */
    ResourceHealthMetadataInner innerModel();
}
