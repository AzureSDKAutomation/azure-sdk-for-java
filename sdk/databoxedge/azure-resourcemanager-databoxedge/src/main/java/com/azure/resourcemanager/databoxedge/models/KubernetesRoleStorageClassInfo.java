// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Kubernetes storage class info. */
@Immutable
public final class KubernetesRoleStorageClassInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KubernetesRoleStorageClassInfo.class);

    /*
     * Storage class name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Storage class type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * If provisioned storage is posix compliant.
     */
    @JsonProperty(value = "posixCompliant", access = JsonProperty.Access.WRITE_ONLY)
    private PosixComplianceStatus posixCompliant;

    /**
     * Get the name property: Storage class name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Storage class type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the posixCompliant property: If provisioned storage is posix compliant.
     *
     * @return the posixCompliant value.
     */
    public PosixComplianceStatus posixCompliant() {
        return this.posixCompliant;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
