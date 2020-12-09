// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.AutomaticRepairsPolicy;
import com.azure.resourcemanager.compute.generated.models.ExtendedLocation;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.ScaleInPolicy;
import com.azure.resourcemanager.compute.generated.models.Sku;
import com.azure.resourcemanager.compute.generated.models.UpgradePolicy;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSet;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetIdentity;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetUpdate;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetUpdateVMProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProfile;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualMachineScaleSetImpl
    implements VirtualMachineScaleSet, VirtualMachineScaleSet.Definition, VirtualMachineScaleSet.Update {
    private VirtualMachineScaleSetInner innerObject;

    private final ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public VirtualMachineScaleSetIdentity identity() {
        return this.innerModel().identity();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public UpgradePolicy upgradePolicy() {
        return this.innerModel().upgradePolicy();
    }

    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.innerModel().automaticRepairsPolicy();
    }

    public VirtualMachineScaleSetVMProfile virtualMachineProfile() {
        return this.innerModel().virtualMachineProfile();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean overprovision() {
        return this.innerModel().overprovision();
    }

    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.innerModel().doNotRunExtensionsOnOverprovisionedVMs();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public Boolean singlePlacementGroup() {
        return this.innerModel().singlePlacementGroup();
    }

    public Boolean zoneBalance() {
        return this.innerModel().zoneBalance();
    }

    public Integer platformFaultDomainCount() {
        return this.innerModel().platformFaultDomainCount();
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public SubResource hostGroup() {
        return this.innerModel().hostGroup();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public ScaleInPolicy scaleInPolicy() {
        return this.innerModel().scaleInPolicy();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualMachineScaleSetInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmScaleSetName;

    private VirtualMachineScaleSetUpdate updateParameters;

    public VirtualMachineScaleSetImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualMachineScaleSet create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .createOrUpdate(resourceGroupName, vmScaleSetName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualMachineScaleSet create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .createOrUpdate(resourceGroupName, vmScaleSetName, this.innerModel(), context);
        return this;
    }

    public VirtualMachineScaleSetImpl(String name, ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineScaleSetInner();
        this.serviceManager = serviceManager;
        this.vmScaleSetName = name;
    }

    public VirtualMachineScaleSetImpl update() {
        this.updateParameters = new VirtualMachineScaleSetUpdate();
        return this;
    }

    public VirtualMachineScaleSet apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .update(resourceGroupName, vmScaleSetName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualMachineScaleSet apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .update(resourceGroupName, vmScaleSetName, updateParameters, context);
        return this;
    }

    public VirtualMachineScaleSetImpl(VirtualMachineScaleSetInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmScaleSetName = Utils.getValueFromIdByName(innerObject.id(), "virtualMachineScaleSets");
    }

    public VirtualMachineScaleSet refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualMachineScaleSet refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, context)
                .getValue();
        return this;
    }

    public VirtualMachineScaleSetImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualMachineScaleSetImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualMachineScaleSetImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withPlan(Plan plan) {
        if (isInCreateMode()) {
            this.innerModel().withPlan(plan);
            return this;
        } else {
            this.updateParameters.withPlan(plan);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withIdentity(VirtualMachineScaleSetIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public VirtualMachineScaleSetImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualMachineScaleSetImpl withUpgradePolicy(UpgradePolicy upgradePolicy) {
        if (isInCreateMode()) {
            this.innerModel().withUpgradePolicy(upgradePolicy);
            return this;
        } else {
            this.updateParameters.withUpgradePolicy(upgradePolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withAutomaticRepairsPolicy(automaticRepairsPolicy);
            return this;
        } else {
            this.updateParameters.withAutomaticRepairsPolicy(automaticRepairsPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withVirtualMachineProfile(VirtualMachineScaleSetVMProfile virtualMachineProfile) {
        this.innerModel().withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    public VirtualMachineScaleSetImpl withOverprovision(Boolean overprovision) {
        if (isInCreateMode()) {
            this.innerModel().withOverprovision(overprovision);
            return this;
        } else {
            this.updateParameters.withOverprovision(overprovision);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withDoNotRunExtensionsOnOverprovisionedVMs(
        Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        if (isInCreateMode()) {
            this.innerModel().withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
            return this;
        } else {
            this.updateParameters.withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withSinglePlacementGroup(Boolean singlePlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withSinglePlacementGroup(singlePlacementGroup);
            return this;
        } else {
            this.updateParameters.withSinglePlacementGroup(singlePlacementGroup);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withZoneBalance(Boolean zoneBalance) {
        this.innerModel().withZoneBalance(zoneBalance);
        return this;
    }

    public VirtualMachineScaleSetImpl withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.innerModel().withPlatformFaultDomainCount(platformFaultDomainCount);
        return this;
    }

    public VirtualMachineScaleSetImpl withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        } else {
            this.updateParameters.withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withHostGroup(SubResource hostGroup) {
        this.innerModel().withHostGroup(hostGroup);
        return this;
    }

    public VirtualMachineScaleSetImpl withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (isInCreateMode()) {
            this.innerModel().withAdditionalCapabilities(additionalCapabilities);
            return this;
        } else {
            this.updateParameters.withAdditionalCapabilities(additionalCapabilities);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withScaleInPolicy(scaleInPolicy);
            return this;
        } else {
            this.updateParameters.withScaleInPolicy(scaleInPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withVirtualMachineProfile(
        VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile) {
        this.updateParameters.withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
