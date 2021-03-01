// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.adp.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.adp.models.ProvisioningState;
import com.azure.resourcemanager.adp.models.SystemData;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** ADP account. */
@JsonFlatten
@Immutable
public class AccountInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccountInner.class);

    /*
     * The system meta data relating to this resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The account's data-plane ID
     */
    @JsonProperty(value = "properties.accountId", access = JsonProperty.Access.WRITE_ONLY)
    private String accountId;

    /*
     * Gets the status of the account at the time the operation was called
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the accountId property: The account's data-plane ID.
     *
     * @return the accountId value.
     */
    public String accountId() {
        return this.accountId;
    }

    /**
     * Get the provisioningState property: Gets the status of the account at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public AccountInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AccountInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
