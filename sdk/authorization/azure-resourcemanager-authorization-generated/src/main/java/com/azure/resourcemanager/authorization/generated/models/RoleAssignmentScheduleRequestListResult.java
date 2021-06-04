// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentScheduleRequestInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Role assignment schedule request list operation result. */
@Fluent
public final class RoleAssignmentScheduleRequestListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleAssignmentScheduleRequestListResult.class);

    /*
     * Role assignment schedule request list.
     */
    @JsonProperty(value = "value")
    private List<RoleAssignmentScheduleRequestInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Role assignment schedule request list.
     *
     * @return the value value.
     */
    public List<RoleAssignmentScheduleRequestInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Role assignment schedule request list.
     *
     * @param value the value value to set.
     * @return the RoleAssignmentScheduleRequestListResult object itself.
     */
    public RoleAssignmentScheduleRequestListResult withValue(List<RoleAssignmentScheduleRequestInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleAssignmentScheduleRequestListResult object itself.
     */
    public RoleAssignmentScheduleRequestListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
