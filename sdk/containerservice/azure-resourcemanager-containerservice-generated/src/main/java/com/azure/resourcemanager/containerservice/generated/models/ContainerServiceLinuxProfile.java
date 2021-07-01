// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for Linux VMs in the container service cluster. */
@Fluent
public final class ContainerServiceLinuxProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceLinuxProfile.class);

    /*
     * The administrator username to use for Linux VMs.
     */
    @JsonProperty(value = "adminUsername", required = true)
    private String adminUsername;

    /*
     * SSH configuration for Linux-based VMs running on Azure.
     */
    @JsonProperty(value = "ssh", required = true)
    private ContainerServiceSshConfiguration ssh;

    /**
     * Get the adminUsername property: The administrator username to use for Linux VMs.
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: The administrator username to use for Linux VMs.
     *
     * @param adminUsername the adminUsername value to set.
     * @return the ContainerServiceLinuxProfile object itself.
     */
    public ContainerServiceLinuxProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the ssh property: SSH configuration for Linux-based VMs running on Azure.
     *
     * @return the ssh value.
     */
    public ContainerServiceSshConfiguration ssh() {
        return this.ssh;
    }

    /**
     * Set the ssh property: SSH configuration for Linux-based VMs running on Azure.
     *
     * @param ssh the ssh value to set.
     * @return the ContainerServiceLinuxProfile object itself.
     */
    public ContainerServiceLinuxProfile withSsh(ContainerServiceSshConfiguration ssh) {
        this.ssh = ssh;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminUsername() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property adminUsername in model ContainerServiceLinuxProfile"));
        }
        if (ssh() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ssh in model ContainerServiceLinuxProfile"));
        } else {
            ssh().validate();
        }
    }
}
