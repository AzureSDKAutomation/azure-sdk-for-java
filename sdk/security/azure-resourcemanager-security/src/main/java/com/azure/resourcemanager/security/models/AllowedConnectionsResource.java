// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.AllowedConnectionsResourceInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of AllowedConnectionsResource. */
public interface AllowedConnectionsResource {
    /**
     * Gets the location property: Location where the resource is stored.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the calculatedDateTime property: The UTC time on which the allowed connections resource was calculated.
     *
     * @return the calculatedDateTime value.
     */
    OffsetDateTime calculatedDateTime();

    /**
     * Gets the connectableResources property: List of connectable resources.
     *
     * @return the connectableResources value.
     */
    List<ConnectableResource> connectableResources();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.AllowedConnectionsResourceInner object.
     *
     * @return the inner object.
     */
    AllowedConnectionsResourceInner innerModel();
}
