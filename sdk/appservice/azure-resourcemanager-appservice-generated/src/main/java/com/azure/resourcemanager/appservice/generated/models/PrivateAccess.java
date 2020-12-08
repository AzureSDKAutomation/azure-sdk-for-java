// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.PrivateAccessInner;
import java.util.List;

/** An immutable client-side representation of PrivateAccess. */
public interface PrivateAccess {
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
     * Gets the enabled property: Whether private access is enabled or not.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the virtualNetworks property: The Virtual Networks (and subnets) allowed to access the site privately.
     *
     * @return the virtualNetworks value.
     */
    List<PrivateAccessVirtualNetwork> virtualNetworks();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.PrivateAccessInner object.
     *
     * @return the inner object.
     */
    PrivateAccessInner innerModel();
}
