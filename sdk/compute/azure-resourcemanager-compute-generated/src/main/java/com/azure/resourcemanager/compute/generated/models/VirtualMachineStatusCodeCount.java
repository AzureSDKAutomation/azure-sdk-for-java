// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status code and count of the virtual machine scale set instance view status summary. */
@Immutable
public final class VirtualMachineStatusCodeCount {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineStatusCodeCount.class);

    /*
     * The instance view status code.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * The number of instances having a particular status code.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Integer count;

    /**
     * Get the code property: The instance view status code.
     *
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the count property: The number of instances having a particular status code.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
