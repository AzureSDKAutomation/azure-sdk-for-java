/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents quarantine policy for a container registry.
 */
public class QuarantinePolicy {
    /**
     * The value that indicates whether the policy is enabled or not. Possible
     * values include: 'enabled', 'disabled'.
     */
    @JsonProperty(value = "status")
    private PolicyStatus status;

    /**
     * Get the value that indicates whether the policy is enabled or not. Possible values include: 'enabled', 'disabled'.
     *
     * @return the status value
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the value that indicates whether the policy is enabled or not. Possible values include: 'enabled', 'disabled'.
     *
     * @param status the status value to set
     * @return the QuarantinePolicy object itself.
     */
    public QuarantinePolicy withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

}
