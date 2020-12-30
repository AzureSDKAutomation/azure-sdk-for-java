// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for retention policy. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "retentionPolicyType",
    defaultImpl = RetentionPolicy.class)
@JsonTypeName("RetentionPolicy")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "LongTermRetentionPolicy", value = LongTermRetentionPolicy.class),
    @JsonSubTypes.Type(name = "SimpleRetentionPolicy", value = SimpleRetentionPolicy.class)
})
@Immutable
public class RetentionPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RetentionPolicy.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
