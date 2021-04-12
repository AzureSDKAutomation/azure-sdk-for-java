// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.fluent.models.ServiceTierAdvisorInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents the response to a list service tier advisor request. */
@Fluent
public final class ServiceTierAdvisorListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceTierAdvisorListResult.class);

    /*
     * The list of service tier advisors for specified database.
     */
    @JsonProperty(value = "value", required = true)
    private List<ServiceTierAdvisorInner> value;

    /**
     * Get the value property: The list of service tier advisors for specified database.
     *
     * @return the value value.
     */
    public List<ServiceTierAdvisorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of service tier advisors for specified database.
     *
     * @param value the value value to set.
     * @return the ServiceTierAdvisorListResult object itself.
     */
    public ServiceTierAdvisorListResult withValue(List<ServiceTierAdvisorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model ServiceTierAdvisorListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
