// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.resourcemanager.containerservice.generated.fluent.models.OutboundEnvironmentEndpointInner;
import java.util.List;

/** An immutable client-side representation of OutboundEnvironmentEndpoint. */
public interface OutboundEnvironmentEndpoint {
    /**
     * Gets the category property: The category of endpoints accessed by the AKS agent node, e.g.
     * azure-resource-management, apiserver, etc.
     *
     * @return the category value.
     */
    String category();

    /**
     * Gets the endpoints property: The endpoints that AKS agent nodes connect to.
     *
     * @return the endpoints value.
     */
    List<EndpointDependency> endpoints();

    /**
     * Gets the inner
     * com.azure.resourcemanager.containerservice.generated.fluent.models.OutboundEnvironmentEndpointInner object.
     *
     * @return the inner object.
     */
    OutboundEnvironmentEndpointInner innerModel();
}
