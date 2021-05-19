// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MSIX Package properties that can be patched. */
@JsonFlatten
@Fluent
public class MsixPackagePatch extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MsixPackagePatch.class);

    /*
     * Set a version of the package to be active across hostpool.
     */
    @JsonProperty(value = "properties.isActive")
    private Boolean isActive;

    /*
     * Set Registration mode. Regular or Delayed.
     */
    @JsonProperty(value = "properties.isRegularRegistration")
    private Boolean isRegularRegistration;

    /*
     * Display name for MSIX Package.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Get the isActive property: Set a version of the package to be active across hostpool.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive property: Set a version of the package to be active across hostpool.
     *
     * @param isActive the isActive value to set.
     * @return the MsixPackagePatch object itself.
     */
    public MsixPackagePatch withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get the isRegularRegistration property: Set Registration mode. Regular or Delayed.
     *
     * @return the isRegularRegistration value.
     */
    public Boolean isRegularRegistration() {
        return this.isRegularRegistration;
    }

    /**
     * Set the isRegularRegistration property: Set Registration mode. Regular or Delayed.
     *
     * @param isRegularRegistration the isRegularRegistration value to set.
     * @return the MsixPackagePatch object itself.
     */
    public MsixPackagePatch withIsRegularRegistration(Boolean isRegularRegistration) {
        this.isRegularRegistration = isRegularRegistration;
        return this;
    }

    /**
     * Get the displayName property: Display name for MSIX Package.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for MSIX Package.
     *
     * @param displayName the displayName value to set.
     * @return the MsixPackagePatch object itself.
     */
    public MsixPackagePatch withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
