// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managedservices.fluent.models.RegistrationAssignmentInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of registration assignments. */
@Immutable
public final class RegistrationAssignmentList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RegistrationAssignmentList.class);

    /*
     * The list of registration assignments.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<RegistrationAssignmentInner> value;

    /*
     * The link to the next page of registration assignments.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The list of registration assignments.
     *
     * @return the value value.
     */
    public List<RegistrationAssignmentInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: The link to the next page of registration assignments.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
