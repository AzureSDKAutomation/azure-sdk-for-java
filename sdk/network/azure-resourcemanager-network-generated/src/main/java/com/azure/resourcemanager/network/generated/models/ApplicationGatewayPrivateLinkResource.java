// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateLinkResourceInner;
import java.util.List;

/** An immutable client-side representation of ApplicationGatewayPrivateLinkResource. */
public interface ApplicationGatewayPrivateLinkResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Name of the private link resource that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the groupId property: Group identifier of private link resource.
     *
     * @return the groupId value.
     */
    String groupId();

    /**
     * Gets the requiredMembers property: Required member names of private link resource.
     *
     * @return the requiredMembers value.
     */
    List<String> requiredMembers();

    /**
     * Gets the requiredZoneNames property: Required DNS zone names of the the private link resource.
     *
     * @return the requiredZoneNames value.
     */
    List<String> requiredZoneNames();

    /**
     * Gets the inner
     * com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateLinkResourceInner object.
     *
     * @return the inner object.
     */
    ApplicationGatewayPrivateLinkResourceInner innerModel();
}
