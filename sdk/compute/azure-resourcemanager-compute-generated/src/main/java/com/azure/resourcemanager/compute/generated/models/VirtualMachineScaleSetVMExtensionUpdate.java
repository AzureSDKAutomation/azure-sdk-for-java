// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a VMSS VM Extension. */
@JsonFlatten
@Fluent
public class VirtualMachineScaleSetVMExtensionUpdate extends SubResourceReadOnly {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMExtensionUpdate.class);

    /*
     * The name of the extension.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * How the extension handler should be forced to update even if the
     * extension configuration has not changed.
     */
    @JsonProperty(value = "properties.forceUpdateTag")
    private String forceUpdateTag;

    /*
     * The name of the extension handler publisher.
     */
    @JsonProperty(value = "properties.publisher")
    private String publisher;

    /*
     * Specifies the type of the extension; an example is
     * "CustomScriptExtension".
     */
    @JsonProperty(value = "properties.type")
    private String typePropertiesType;

    /*
     * Specifies the version of the script handler.
     */
    @JsonProperty(value = "properties.typeHandlerVersion")
    private String typeHandlerVersion;

    /*
     * Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension
     * will not upgrade minor versions unless redeployed, even with this
     * property set to true.
     */
    @JsonProperty(value = "properties.autoUpgradeMinorVersion")
    private Boolean autoUpgradeMinorVersion;

    /*
     * Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     */
    @JsonProperty(value = "properties.enableAutomaticUpgrade")
    private Boolean enableAutomaticUpgrade;

    /*
     * Json formatted public settings for the extension.
     */
    @JsonProperty(value = "properties.settings")
    private Object settings;

    /*
     * The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     */
    @JsonProperty(value = "properties.protectedSettings")
    private Object protectedSettings;

    /*
     * Indicates whether failures stemming from the extension will be
     * suppressed (Operational failures such as not connecting to the VM will
     * not be suppressed regardless of this value). The default is false.
     */
    @JsonProperty(value = "properties.suppressFailures")
    private Boolean suppressFailures;

    /**
     * Get the name property: The name of the extension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: How the extension handler should be forced to update even if the extension
     * configuration has not changed.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the publisher property: The name of the extension handler publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The name of the extension handler publisher.
     *
     * @param publisher the publisher value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the typePropertiesType property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @return the typePropertiesType value.
     */
    public String typePropertiesType() {
        return this.typePropertiesType;
    }

    /**
     * Set the typePropertiesType property: Specifies the type of the extension; an example is "CustomScriptExtension".
     *
     * @param typePropertiesType the typePropertiesType value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withTypePropertiesType(String typePropertiesType) {
        this.typePropertiesType = typePropertiesType;
        return this;
    }

    /**
     * Get the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @return the typeHandlerVersion value.
     */
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     * Set the typeHandlerVersion property: Specifies the version of the script handler.
     *
     * @param typeHandlerVersion the typeHandlerVersion value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withTypeHandlerVersion(String typeHandlerVersion) {
        this.typeHandlerVersion = typeHandlerVersion;
        return this;
    }

    /**
     * Get the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @return the autoUpgradeMinorVersion value.
     */
    public Boolean autoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * Set the autoUpgradeMinorVersion property: Indicates whether the extension should use a newer minor version if one
     * is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless
     * redeployed, even with this property set to true.
     *
     * @param autoUpgradeMinorVersion the autoUpgradeMinorVersion value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        return this;
    }

    /**
     * Get the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     *
     * @return the enableAutomaticUpgrade value.
     */
    public Boolean enableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }

    /**
     * Set the enableAutomaticUpgrade property: Indicates whether the extension should be automatically upgraded by the
     * platform if there is a newer version of the extension available.
     *
     * @param enableAutomaticUpgrade the enableAutomaticUpgrade value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        return this;
    }

    /**
     * Get the settings property: Json formatted public settings for the extension.
     *
     * @return the settings value.
     */
    public Object settings() {
        return this.settings;
    }

    /**
     * Set the settings property: Json formatted public settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withSettings(Object settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Get the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.protectedSettings;
    }

    /**
     * Set the protectedSettings property: The extension can contain either protectedSettings or
     * protectedSettingsFromKeyVault or no protected settings at all.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withProtectedSettings(Object protectedSettings) {
        this.protectedSettings = protectedSettings;
        return this;
    }

    /**
     * Get the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed regardless of this value). The
     * default is false.
     *
     * @return the suppressFailures value.
     */
    public Boolean suppressFailures() {
        return this.suppressFailures;
    }

    /**
     * Set the suppressFailures property: Indicates whether failures stemming from the extension will be suppressed
     * (Operational failures such as not connecting to the VM will not be suppressed regardless of this value). The
     * default is false.
     *
     * @param suppressFailures the suppressFailures value to set.
     * @return the VirtualMachineScaleSetVMExtensionUpdate object itself.
     */
    public VirtualMachineScaleSetVMExtensionUpdate withSuppressFailures(Boolean suppressFailures) {
        this.suppressFailures = suppressFailures;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
