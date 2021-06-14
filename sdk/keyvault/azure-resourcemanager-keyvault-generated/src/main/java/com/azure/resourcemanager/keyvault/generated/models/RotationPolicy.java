// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RotationPolicy model. */
@Fluent
public final class RotationPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RotationPolicy.class);

    /*
     * The attributes of key rotation policy.
     */
    @JsonProperty(value = "attributes")
    private KeyRotationPolicyAttributes attributes;

    /*
     * The lifetimeActions for key rotation action.
     */
    @JsonProperty(value = "lifetimeActions")
    private List<LifetimeAction> lifetimeActions;

    /**
     * Get the attributes property: The attributes of key rotation policy.
     *
     * @return the attributes value.
     */
    public KeyRotationPolicyAttributes attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The attributes of key rotation policy.
     *
     * @param attributes the attributes value to set.
     * @return the RotationPolicy object itself.
     */
    public RotationPolicy withAttributes(KeyRotationPolicyAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the lifetimeActions property: The lifetimeActions for key rotation action.
     *
     * @return the lifetimeActions value.
     */
    public List<LifetimeAction> lifetimeActions() {
        return this.lifetimeActions;
    }

    /**
     * Set the lifetimeActions property: The lifetimeActions for key rotation action.
     *
     * @param lifetimeActions the lifetimeActions value to set.
     * @return the RotationPolicy object itself.
     */
    public RotationPolicy withLifetimeActions(List<LifetimeAction> lifetimeActions) {
        this.lifetimeActions = lifetimeActions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attributes() != null) {
            attributes().validate();
        }
        if (lifetimeActions() != null) {
            lifetimeActions().forEach(e -> e.validate());
        }
    }
}
