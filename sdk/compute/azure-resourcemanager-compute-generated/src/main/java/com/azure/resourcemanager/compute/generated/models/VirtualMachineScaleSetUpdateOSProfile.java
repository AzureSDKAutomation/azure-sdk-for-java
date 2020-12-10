// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machine scale set OS profile. */
@Fluent
public final class VirtualMachineScaleSetUpdateOSProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetUpdateOSProfile.class);

    /*
     * A base-64 encoded string of custom data.
     */
    @JsonProperty(value = "customData")
    private String customData;

    /*
     * The Windows Configuration of the OS profile.
     */
    @JsonProperty(value = "windowsConfiguration")
    private WindowsConfiguration windowsConfiguration;

    /*
     * The Linux Configuration of the OS profile.
     */
    @JsonProperty(value = "linuxConfiguration")
    private LinuxConfiguration linuxConfiguration;

    /*
     * The List of certificates for addition to the VM.
     */
    @JsonProperty(value = "secrets")
    private List<VaultSecretGroup> secrets;

    /**
     * Get the customData property: A base-64 encoded string of custom data.
     *
     * @return the customData value.
     */
    public String customData() {
        return this.customData;
    }

    /**
     * Set the customData property: A base-64 encoded string of custom data.
     *
     * @param customData the customData value to set.
     * @return the VirtualMachineScaleSetUpdateOSProfile object itself.
     */
    public VirtualMachineScaleSetUpdateOSProfile withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Get the windowsConfiguration property: The Windows Configuration of the OS profile.
     *
     * @return the windowsConfiguration value.
     */
    public WindowsConfiguration windowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration property: The Windows Configuration of the OS profile.
     *
     * @param windowsConfiguration the windowsConfiguration value to set.
     * @return the VirtualMachineScaleSetUpdateOSProfile object itself.
     */
    public VirtualMachineScaleSetUpdateOSProfile withWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get the linuxConfiguration property: The Linux Configuration of the OS profile.
     *
     * @return the linuxConfiguration value.
     */
    public LinuxConfiguration linuxConfiguration() {
        return this.linuxConfiguration;
    }

    /**
     * Set the linuxConfiguration property: The Linux Configuration of the OS profile.
     *
     * @param linuxConfiguration the linuxConfiguration value to set.
     * @return the VirtualMachineScaleSetUpdateOSProfile object itself.
     */
    public VirtualMachineScaleSetUpdateOSProfile withLinuxConfiguration(LinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
        return this;
    }

    /**
     * Get the secrets property: The List of certificates for addition to the VM.
     *
     * @return the secrets value.
     */
    public List<VaultSecretGroup> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: The List of certificates for addition to the VM.
     *
     * @param secrets the secrets value to set.
     * @return the VirtualMachineScaleSetUpdateOSProfile object itself.
     */
    public VirtualMachineScaleSetUpdateOSProfile withSecrets(List<VaultSecretGroup> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (windowsConfiguration() != null) {
            windowsConfiguration().validate();
        }
        if (linuxConfiguration() != null) {
            linuxConfiguration().validate();
        }
        if (secrets() != null) {
            secrets().forEach(e -> e.validate());
        }
    }
}
