/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for diagnostics on the container service cluster.
 */
public class ContainerServiceDiagnosticsProfile {
    /**
     * Profile for diagnostics on the container service VMs.
     */
    @JsonProperty(value = "vmDiagnostics", required = true)
    private ContainerServiceVMDiagnostics vmDiagnostics;

    /**
     * Get profile for diagnostics on the container service VMs.
     *
     * @return the vmDiagnostics value
     */
    public ContainerServiceVMDiagnostics vmDiagnostics() {
        return this.vmDiagnostics;
    }

    /**
     * Set profile for diagnostics on the container service VMs.
     *
     * @param vmDiagnostics the vmDiagnostics value to set
     * @return the ContainerServiceDiagnosticsProfile object itself.
     */
    public ContainerServiceDiagnosticsProfile withVmDiagnostics(ContainerServiceVMDiagnostics vmDiagnostics) {
        this.vmDiagnostics = vmDiagnostics;
        return this;
    }

}
