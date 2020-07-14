/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Describes a Virtual Machine Extension Image.
 */
@JsonFlatten
public class VirtualMachineExtensionImageInner extends Resource {
    /**
     * The operating system this extension supports.
     */
    @JsonProperty(value = "properties.operatingSystem", required = true)
    private String operatingSystem;

    /**
     * The type of role (IaaS or PaaS) this extension supports.
     */
    @JsonProperty(value = "properties.computeRole", required = true)
    private String computeRole;

    /**
     * The schema defined by publisher, where extension consumers should
     * provide settings in a matching schema.
     */
    @JsonProperty(value = "properties.handlerSchema", required = true)
    private String handlerSchema;

    /**
     * Whether the extension can be used on xRP VMScaleSets. By default
     * existing extensions are usable on scalesets, but there might be cases
     * where a publisher wants to explicitly indicate the extension is only
     * enabled for CRP VMs but not VMSS.
     */
    @JsonProperty(value = "properties.vmScaleSetEnabled")
    private Boolean vmScaleSetEnabled;

    /**
     * Whether the handler can support multiple extensions.
     */
    @JsonProperty(value = "properties.supportsMultipleExtensions")
    private Boolean supportsMultipleExtensions;

    /**
     * Get the operating system this extension supports.
     *
     * @return the operatingSystem value
     */
    public String operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operating system this extension supports.
     *
     * @param operatingSystem the operatingSystem value to set
     * @return the VirtualMachineExtensionImageInner object itself.
     */
    public VirtualMachineExtensionImageInner withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * Get the type of role (IaaS or PaaS) this extension supports.
     *
     * @return the computeRole value
     */
    public String computeRole() {
        return this.computeRole;
    }

    /**
     * Set the type of role (IaaS or PaaS) this extension supports.
     *
     * @param computeRole the computeRole value to set
     * @return the VirtualMachineExtensionImageInner object itself.
     */
    public VirtualMachineExtensionImageInner withComputeRole(String computeRole) {
        this.computeRole = computeRole;
        return this;
    }

    /**
     * Get the schema defined by publisher, where extension consumers should provide settings in a matching schema.
     *
     * @return the handlerSchema value
     */
    public String handlerSchema() {
        return this.handlerSchema;
    }

    /**
     * Set the schema defined by publisher, where extension consumers should provide settings in a matching schema.
     *
     * @param handlerSchema the handlerSchema value to set
     * @return the VirtualMachineExtensionImageInner object itself.
     */
    public VirtualMachineExtensionImageInner withHandlerSchema(String handlerSchema) {
        this.handlerSchema = handlerSchema;
        return this;
    }

    /**
     * Get whether the extension can be used on xRP VMScaleSets. By default existing extensions are usable on scalesets, but there might be cases where a publisher wants to explicitly indicate the extension is only enabled for CRP VMs but not VMSS.
     *
     * @return the vmScaleSetEnabled value
     */
    public Boolean vmScaleSetEnabled() {
        return this.vmScaleSetEnabled;
    }

    /**
     * Set whether the extension can be used on xRP VMScaleSets. By default existing extensions are usable on scalesets, but there might be cases where a publisher wants to explicitly indicate the extension is only enabled for CRP VMs but not VMSS.
     *
     * @param vmScaleSetEnabled the vmScaleSetEnabled value to set
     * @return the VirtualMachineExtensionImageInner object itself.
     */
    public VirtualMachineExtensionImageInner withVmScaleSetEnabled(Boolean vmScaleSetEnabled) {
        this.vmScaleSetEnabled = vmScaleSetEnabled;
        return this;
    }

    /**
     * Get whether the handler can support multiple extensions.
     *
     * @return the supportsMultipleExtensions value
     */
    public Boolean supportsMultipleExtensions() {
        return this.supportsMultipleExtensions;
    }

    /**
     * Set whether the handler can support multiple extensions.
     *
     * @param supportsMultipleExtensions the supportsMultipleExtensions value to set
     * @return the VirtualMachineExtensionImageInner object itself.
     */
    public VirtualMachineExtensionImageInner withSupportsMultipleExtensions(Boolean supportsMultipleExtensions) {
        this.supportsMultipleExtensions = supportsMultipleExtensions;
        return this;
    }

}
