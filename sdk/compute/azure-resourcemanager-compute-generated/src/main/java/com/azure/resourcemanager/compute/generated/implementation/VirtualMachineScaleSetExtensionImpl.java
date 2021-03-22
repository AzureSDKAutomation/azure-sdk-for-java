// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetExtensionInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetExtensionUpdate;
import java.util.Collections;
import java.util.List;

public final class VirtualMachineScaleSetExtensionImpl
    implements VirtualMachineScaleSetExtension,
        VirtualMachineScaleSetExtension.Definition,
        VirtualMachineScaleSetExtension.Update {
    private VirtualMachineScaleSetExtensionInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String forceUpdateTag() {
        return this.innerModel().forceUpdateTag();
    }

    public String publisher() {
        return this.innerModel().publisher();
    }

    public String typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public String typeHandlerVersion() {
        return this.innerModel().typeHandlerVersion();
    }

    public Boolean autoUpgradeMinorVersion() {
        return this.innerModel().autoUpgradeMinorVersion();
    }

    public Boolean enableAutomaticUpgrade() {
        return this.innerModel().enableAutomaticUpgrade();
    }

    public Object settings() {
        return this.innerModel().settings();
    }

    public Object protectedSettings() {
        return this.innerModel().protectedSettings();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<String> provisionAfterExtensions() {
        List<String> inner = this.innerModel().provisionAfterExtensions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineScaleSetExtensionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmScaleSetName;

    private String vmssExtensionName;

    private VirtualMachineScaleSetExtensionUpdate updateExtensionParameters;

    public VirtualMachineScaleSetExtensionImpl withExistingVirtualMachineScaleSet(
        String resourceGroupName, String vmScaleSetName) {
        this.resourceGroupName = resourceGroupName;
        this.vmScaleSetName = vmScaleSetName;
        return this;
    }

    public VirtualMachineScaleSetExtension create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSetExtensions()
                .createOrUpdate(resourceGroupName, vmScaleSetName, vmssExtensionName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualMachineScaleSetExtension create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSetExtensions()
                .createOrUpdate(resourceGroupName, vmScaleSetName, vmssExtensionName, this.innerModel(), context);
        return this;
    }

    VirtualMachineScaleSetExtensionImpl(
        String name, com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineScaleSetExtensionInner();
        this.serviceManager = serviceManager;
        this.vmssExtensionName = name;
    }

    public VirtualMachineScaleSetExtensionImpl update() {
        this.updateExtensionParameters = new VirtualMachineScaleSetExtensionUpdate();
        return this;
    }

    public VirtualMachineScaleSetExtension apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSetExtensions()
                .update(resourceGroupName, vmScaleSetName, vmssExtensionName, updateExtensionParameters, Context.NONE);
        return this;
    }

    public VirtualMachineScaleSetExtension apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSetExtensions()
                .update(resourceGroupName, vmScaleSetName, vmssExtensionName, updateExtensionParameters, context);
        return this;
    }

    VirtualMachineScaleSetExtensionImpl(
        VirtualMachineScaleSetExtensionInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmScaleSetName = Utils.getValueFromIdByName(innerObject.id(), "virtualMachineScaleSets");
        this.vmssExtensionName = Utils.getValueFromIdByName(innerObject.id(), "extensions");
    }

    public VirtualMachineScaleSetExtension refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSetExtensions()
                .getWithResponse(resourceGroupName, vmScaleSetName, vmssExtensionName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualMachineScaleSetExtension refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSetExtensions()
                .getWithResponse(resourceGroupName, vmScaleSetName, vmssExtensionName, localExpand, context)
                .getValue();
        return this;
    }

    public VirtualMachineScaleSetExtensionImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public VirtualMachineScaleSetExtensionImpl withForceUpdateTag(String forceUpdateTag) {
        if (isInCreateMode()) {
            this.innerModel().withForceUpdateTag(forceUpdateTag);
            return this;
        } else {
            this.updateExtensionParameters.withForceUpdateTag(forceUpdateTag);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withPublisher(String publisher) {
        if (isInCreateMode()) {
            this.innerModel().withPublisher(publisher);
            return this;
        } else {
            this.updateExtensionParameters.withPublisher(publisher);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withTypePropertiesType(String typePropertiesType) {
        if (isInCreateMode()) {
            this.innerModel().withTypePropertiesType(typePropertiesType);
            return this;
        } else {
            this.updateExtensionParameters.withTypePropertiesType(typePropertiesType);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withTypeHandlerVersion(String typeHandlerVersion) {
        if (isInCreateMode()) {
            this.innerModel().withTypeHandlerVersion(typeHandlerVersion);
            return this;
        } else {
            this.updateExtensionParameters.withTypeHandlerVersion(typeHandlerVersion);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        if (isInCreateMode()) {
            this.innerModel().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
            return this;
        } else {
            this.updateExtensionParameters.withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withEnableAutomaticUpgrade(Boolean enableAutomaticUpgrade) {
        if (isInCreateMode()) {
            this.innerModel().withEnableAutomaticUpgrade(enableAutomaticUpgrade);
            return this;
        } else {
            this.updateExtensionParameters.withEnableAutomaticUpgrade(enableAutomaticUpgrade);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withSettings(Object settings) {
        if (isInCreateMode()) {
            this.innerModel().withSettings(settings);
            return this;
        } else {
            this.updateExtensionParameters.withSettings(settings);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withProtectedSettings(Object protectedSettings) {
        if (isInCreateMode()) {
            this.innerModel().withProtectedSettings(protectedSettings);
            return this;
        } else {
            this.updateExtensionParameters.withProtectedSettings(protectedSettings);
            return this;
        }
    }

    public VirtualMachineScaleSetExtensionImpl withProvisionAfterExtensions(List<String> provisionAfterExtensions) {
        if (isInCreateMode()) {
            this.innerModel().withProvisionAfterExtensions(provisionAfterExtensions);
            return this;
        } else {
            this.updateExtensionParameters.withProvisionAfterExtensions(provisionAfterExtensions);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
