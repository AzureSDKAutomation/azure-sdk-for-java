// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the customer managed key associated with the workspace. */
@Fluent
public final class CustomerManagedKeyDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomerManagedKeyDetails.class);

    /*
     * The customer managed key status on the workspace
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The key object of the workspace
     */
    @JsonProperty(value = "key")
    private WorkspaceKeyDetails key;

    /*
     * Key encryption key
     */
    @JsonProperty(value = "kekIdentity")
    private KekIdentityProperties kekIdentity;

    /**
     * Get the status property: The customer managed key status on the workspace.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the key property: The key object of the workspace.
     *
     * @return the key value.
     */
    public WorkspaceKeyDetails key() {
        return this.key;
    }

    /**
     * Set the key property: The key object of the workspace.
     *
     * @param key the key value to set.
     * @return the CustomerManagedKeyDetails object itself.
     */
    public CustomerManagedKeyDetails withKey(WorkspaceKeyDetails key) {
        this.key = key;
        return this;
    }

    /**
     * Get the kekIdentity property: Key encryption key.
     *
     * @return the kekIdentity value.
     */
    public KekIdentityProperties kekIdentity() {
        return this.kekIdentity;
    }

    /**
     * Set the kekIdentity property: Key encryption key.
     *
     * @param kekIdentity the kekIdentity value to set.
     * @return the CustomerManagedKeyDetails object itself.
     */
    public CustomerManagedKeyDetails withKekIdentity(KekIdentityProperties kekIdentity) {
        this.kekIdentity = kekIdentity;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (key() != null) {
            key().validate();
        }
        if (kekIdentity() != null) {
            kekIdentity().validate();
        }
    }
}
