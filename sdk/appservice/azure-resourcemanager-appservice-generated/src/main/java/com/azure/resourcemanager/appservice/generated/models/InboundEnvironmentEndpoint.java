// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.InboundEnvironmentEndpointInner;
import java.util.List;

/** An immutable client-side representation of InboundEnvironmentEndpoint. */
public interface InboundEnvironmentEndpoint {
    /**
     * Gets the description property: Short text describing the purpose of the network traffic.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the endpoints property: The IP addresses that network traffic will originate from in cidr notation.
     *
     * @return the endpoints value.
     */
    List<String> endpoints();

    /**
     * Gets the ports property: The ports that network traffic will arrive to the App Service Environment at.
     *
     * @return the ports value.
     */
    List<String> ports();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.InboundEnvironmentEndpointInner
     * object.
     *
     * @return the inner object.
     */
    InboundEnvironmentEndpointInner innerModel();
}