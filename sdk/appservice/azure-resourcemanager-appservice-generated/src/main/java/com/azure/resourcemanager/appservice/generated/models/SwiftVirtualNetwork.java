// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.SwiftVirtualNetworkInner;

/** An immutable client-side representation of SwiftVirtualNetwork. */
public interface SwiftVirtualNetwork {
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
     * Gets the subnetResourceId property: The Virtual Network subnet's resource ID. This is the subnet that this Web
     * App will join. This subnet must have a delegation to Microsoft.Web/serverFarms defined first.
     *
     * @return the subnetResourceId value.
     */
    String subnetResourceId();

    /**
     * Gets the swiftSupported property: A flag that specifies if the scale unit this Web App is on supports Swift
     * integration.
     *
     * @return the swiftSupported value.
     */
    Boolean swiftSupported();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.SwiftVirtualNetworkInner object.
     *
     * @return the inner object.
     */
    SwiftVirtualNetworkInner innerModel();
}
