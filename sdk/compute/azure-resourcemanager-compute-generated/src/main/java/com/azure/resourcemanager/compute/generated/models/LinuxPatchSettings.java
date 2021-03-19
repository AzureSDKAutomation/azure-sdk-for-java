// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies settings related to VM Guest Patching on Linux. */
@Fluent
public final class LinuxPatchSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinuxPatchSettings.class);

    /*
     * Specifies the mode of VM Guest Patching to IaaS virtual machine or
     * virtual machines associated to virtual machine scale set with
     * OrchestrationMode as Flexible.<br /><br /> Possible values are:<br /><br
     * /> **ImageDefault** - The virtual machine's default patching
     * configuration is used. <br /><br /> **AutomaticByPlatform** - The
     * virtual machine will be automatically updated by the platform. The
     * property provisionVMAgent must be true
     */
    @JsonProperty(value = "patchMode")
    private LinuxVMGuestPatchMode patchMode;

    /**
     * Get the patchMode property: Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines
     * associated to virtual machine scale set with OrchestrationMode as Flexible.&lt;br /&gt;&lt;br /&gt; Possible
     * values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - The virtual machine's default patching configuration is
     * used. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The virtual machine will be automatically updated by the
     * platform. The property provisionVMAgent must be true.
     *
     * @return the patchMode value.
     */
    public LinuxVMGuestPatchMode patchMode() {
        return this.patchMode;
    }

    /**
     * Set the patchMode property: Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines
     * associated to virtual machine scale set with OrchestrationMode as Flexible.&lt;br /&gt;&lt;br /&gt; Possible
     * values are:&lt;br /&gt;&lt;br /&gt; **ImageDefault** - The virtual machine's default patching configuration is
     * used. &lt;br /&gt;&lt;br /&gt; **AutomaticByPlatform** - The virtual machine will be automatically updated by the
     * platform. The property provisionVMAgent must be true.
     *
     * @param patchMode the patchMode value to set.
     * @return the LinuxPatchSettings object itself.
     */
    public LinuxPatchSettings withPatchMode(LinuxVMGuestPatchMode patchMode) {
        this.patchMode = patchMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
