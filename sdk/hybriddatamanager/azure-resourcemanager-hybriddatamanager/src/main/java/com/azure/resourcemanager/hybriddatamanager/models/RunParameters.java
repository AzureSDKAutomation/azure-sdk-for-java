// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybriddatamanager.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Run parameters for a job. */
@Fluent
public final class RunParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunParameters.class);

    /*
     * Enum to detect if user confirmation is required. If not passed will
     * default to NotRequired.
     */
    @JsonProperty(value = "userConfirmation")
    private UserConfirmation userConfirmation;

    /*
     * A generic json used differently by each data service type.
     */
    @JsonProperty(value = "dataServiceInput")
    private Object dataServiceInput;

    /*
     * List of customer secrets containing a key identifier and key value. The
     * key identifier is a way for the specific data source to understand the
     * key. Value contains customer secret encrypted by the encryptionKeys.
     */
    @JsonProperty(value = "customerSecrets")
    private List<CustomerSecret> customerSecrets;

    /**
     * Get the userConfirmation property: Enum to detect if user confirmation is required. If not passed will default to
     * NotRequired.
     *
     * @return the userConfirmation value.
     */
    public UserConfirmation userConfirmation() {
        return this.userConfirmation;
    }

    /**
     * Set the userConfirmation property: Enum to detect if user confirmation is required. If not passed will default to
     * NotRequired.
     *
     * @param userConfirmation the userConfirmation value to set.
     * @return the RunParameters object itself.
     */
    public RunParameters withUserConfirmation(UserConfirmation userConfirmation) {
        this.userConfirmation = userConfirmation;
        return this;
    }

    /**
     * Get the dataServiceInput property: A generic json used differently by each data service type.
     *
     * @return the dataServiceInput value.
     */
    public Object dataServiceInput() {
        return this.dataServiceInput;
    }

    /**
     * Set the dataServiceInput property: A generic json used differently by each data service type.
     *
     * @param dataServiceInput the dataServiceInput value to set.
     * @return the RunParameters object itself.
     */
    public RunParameters withDataServiceInput(Object dataServiceInput) {
        this.dataServiceInput = dataServiceInput;
        return this;
    }

    /**
     * Get the customerSecrets property: List of customer secrets containing a key identifier and key value. The key
     * identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted
     * by the encryptionKeys.
     *
     * @return the customerSecrets value.
     */
    public List<CustomerSecret> customerSecrets() {
        return this.customerSecrets;
    }

    /**
     * Set the customerSecrets property: List of customer secrets containing a key identifier and key value. The key
     * identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted
     * by the encryptionKeys.
     *
     * @param customerSecrets the customerSecrets value to set.
     * @return the RunParameters object itself.
     */
    public RunParameters withCustomerSecrets(List<CustomerSecret> customerSecrets) {
        this.customerSecrets = customerSecrets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customerSecrets() != null) {
            customerSecrets().forEach(e -> e.validate());
        }
    }
}
