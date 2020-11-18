/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the customer managed key associated with the workspace.
 */
public class CustomerManagedKeyDetails {
    /**
     * The customer managed key status on the workspace.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The key object of the workspace.
     */
    @JsonProperty(value = "key")
    private WorkspaceKeyDetails key;

    /**
     * Get the customer managed key status on the workspace.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the key object of the workspace.
     *
     * @return the key value
     */
    public WorkspaceKeyDetails key() {
        return this.key;
    }

    /**
     * Set the key object of the workspace.
     *
     * @param key the key value to set
     * @return the CustomerManagedKeyDetails object itself.
     */
    public CustomerManagedKeyDetails withKey(WorkspaceKeyDetails key) {
        this.key = key;
        return this;
    }

}
