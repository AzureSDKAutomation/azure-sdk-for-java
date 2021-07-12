// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Create protection container input properties. */
@Fluent
public final class CreateProtectionContainerInputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CreateProtectionContainerInputProperties.class);

    /*
     * Provider specific inputs for container creation.
     */
    @JsonProperty(value = "providerSpecificInput")
    private List<ReplicationProviderSpecificContainerCreationInput> providerSpecificInput;

    /**
     * Get the providerSpecificInput property: Provider specific inputs for container creation.
     *
     * @return the providerSpecificInput value.
     */
    public List<ReplicationProviderSpecificContainerCreationInput> providerSpecificInput() {
        return this.providerSpecificInput;
    }

    /**
     * Set the providerSpecificInput property: Provider specific inputs for container creation.
     *
     * @param providerSpecificInput the providerSpecificInput value to set.
     * @return the CreateProtectionContainerInputProperties object itself.
     */
    public CreateProtectionContainerInputProperties withProviderSpecificInput(
        List<ReplicationProviderSpecificContainerCreationInput> providerSpecificInput) {
        this.providerSpecificInput = providerSpecificInput;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (providerSpecificInput() != null) {
            providerSpecificInput().forEach(e -> e.validate());
        }
    }
}
