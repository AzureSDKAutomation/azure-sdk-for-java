// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of routes that control routing from VirtualHub into a virtual network connection. */
@Fluent
public final class VnetRoute {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetRoute.class);

    /*
     * List of all Static Routes.
     */
    @JsonProperty(value = "staticRoutes")
    private List<StaticRoute> staticRoutes;

    /**
     * Get the staticRoutes property: List of all Static Routes.
     *
     * @return the staticRoutes value.
     */
    public List<StaticRoute> staticRoutes() {
        return this.staticRoutes;
    }

    /**
     * Set the staticRoutes property: List of all Static Routes.
     *
     * @param staticRoutes the staticRoutes value to set.
     * @return the VnetRoute object itself.
     */
    public VnetRoute withStaticRoutes(List<StaticRoute> staticRoutes) {
        this.staticRoutes = staticRoutes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (staticRoutes() != null) {
            staticRoutes().forEach(e -> e.validate());
        }
    }
}
