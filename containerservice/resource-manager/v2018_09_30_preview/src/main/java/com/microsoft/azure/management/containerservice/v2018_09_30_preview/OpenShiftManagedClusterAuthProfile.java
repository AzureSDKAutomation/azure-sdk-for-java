/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2018_09_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines all possible authentication profiles for the OpenShift cluster.
 */
public class OpenShiftManagedClusterAuthProfile {
    /**
     * Type of authentication profile to use.
     */
    @JsonProperty(value = "identityProviders")
    private List<OpenShiftManagedClusterIdentityProvider> identityProviders;

    /**
     * Get type of authentication profile to use.
     *
     * @return the identityProviders value
     */
    public List<OpenShiftManagedClusterIdentityProvider> identityProviders() {
        return this.identityProviders;
    }

    /**
     * Set type of authentication profile to use.
     *
     * @param identityProviders the identityProviders value to set
     * @return the OpenShiftManagedClusterAuthProfile object itself.
     */
    public OpenShiftManagedClusterAuthProfile withIdentityProviders(List<OpenShiftManagedClusterIdentityProvider> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

}
