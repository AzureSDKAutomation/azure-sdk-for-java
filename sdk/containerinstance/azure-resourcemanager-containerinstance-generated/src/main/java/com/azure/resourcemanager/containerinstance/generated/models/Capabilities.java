// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated.models;

import com.azure.resourcemanager.containerinstance.generated.fluent.models.CapabilitiesInner;

/** An immutable client-side representation of Capabilities. */
public interface Capabilities {
    /**
     * Gets the resourceType property: The resource type that this capability describes.
     *
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the osType property: The OS type that this capability describes.
     *
     * @return the osType value.
     */
    String osType();

    /**
     * Gets the location property: The resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the ipAddressType property: The ip address type that this capability describes.
     *
     * @return the ipAddressType value.
     */
    String ipAddressType();

    /**
     * Gets the gpu property: The GPU sku that this capability describes.
     *
     * @return the gpu value.
     */
    String gpu();

    /**
     * Gets the capabilities property: The supported capabilities.
     *
     * @return the capabilities value.
     */
    CapabilitiesAutoGenerated capabilities();

    /**
     * Gets the inner com.azure.resourcemanager.containerinstance.generated.fluent.models.CapabilitiesInner object.
     *
     * @return the inner object.
     */
    CapabilitiesInner innerModel();
}
