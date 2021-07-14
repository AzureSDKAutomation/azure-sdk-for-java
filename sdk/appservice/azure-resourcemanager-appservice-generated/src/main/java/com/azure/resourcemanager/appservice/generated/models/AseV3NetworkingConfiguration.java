// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.AseV3NetworkingConfigurationInner;
import java.util.List;

/** An immutable client-side representation of AseV3NetworkingConfiguration. */
public interface AseV3NetworkingConfiguration {
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
     * Gets the windowsOutboundIpAddresses property: The windowsOutboundIpAddresses property.
     *
     * @return the windowsOutboundIpAddresses value.
     */
    List<String> windowsOutboundIpAddresses();

    /**
     * Gets the linuxOutboundIpAddresses property: The linuxOutboundIpAddresses property.
     *
     * @return the linuxOutboundIpAddresses value.
     */
    List<String> linuxOutboundIpAddresses();

    /**
     * Gets the externalInboundIpAddresses property: The externalInboundIpAddresses property.
     *
     * @return the externalInboundIpAddresses value.
     */
    List<String> externalInboundIpAddresses();

    /**
     * Gets the internalInboundIpAddresses property: The internalInboundIpAddresses property.
     *
     * @return the internalInboundIpAddresses value.
     */
    List<String> internalInboundIpAddresses();

    /**
     * Gets the allowNewPrivateEndpointConnections property: Property to enable and disable new private endpoint
     * connection creation on ASE.
     *
     * @return the allowNewPrivateEndpointConnections value.
     */
    Boolean allowNewPrivateEndpointConnections();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.AseV3NetworkingConfigurationInner
     * object.
     *
     * @return the inner object.
     */
    AseV3NetworkingConfigurationInner innerModel();
}
