// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineScaleSetVMInstanceViewInner;
import com.azure.resourcemanager.compute.generated.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.generated.models.ApplicationProfile;
import com.azure.resourcemanager.compute.generated.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.generated.models.HardwareProfile;
import com.azure.resourcemanager.compute.generated.models.NetworkProfile;
import com.azure.resourcemanager.compute.generated.models.OSProfile;
import com.azure.resourcemanager.compute.generated.models.Plan;
import com.azure.resourcemanager.compute.generated.models.SecurityProfile;
import com.azure.resourcemanager.compute.generated.models.Sku;
import com.azure.resourcemanager.compute.generated.models.StorageProfile;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVM;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMInstanceView;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMNetworkProfileConfiguration;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineScaleSetVMProtectionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualMachineScaleSetVMImpl implements VirtualMachineScaleSetVM {
    private VirtualMachineScaleSetVMInner innerObject;

    private final ComputeManager serviceManager;

    public VirtualMachineScaleSetVMImpl(VirtualMachineScaleSetVMInner innerObject, ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

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

    public String instanceId() {
        return this.innerModel().instanceId();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public List<VirtualMachineExtension> resources() {
        List<VirtualMachineExtensionInner> inner = this.innerModel().resources();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualMachineExtensionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean latestModelApplied() {
        return this.innerModel().latestModelApplied();
    }

    public String vmId() {
        return this.innerModel().vmId();
    }

    public VirtualMachineScaleSetVMInstanceView instanceView() {
        VirtualMachineScaleSetVMInstanceViewInner inner = this.innerModel().instanceView();
        if (inner != null) {
            return new VirtualMachineScaleSetVMInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public HardwareProfile hardwareProfile() {
        return this.innerModel().hardwareProfile();
    }

    public ApplicationProfile applicationProfile() {
        return this.innerModel().applicationProfile();
    }

    public StorageProfile storageProfile() {
        return this.innerModel().storageProfile();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public OSProfile osProfile() {
        return this.innerModel().osProfile();
    }

    public SecurityProfile securityProfile() {
        return this.innerModel().securityProfile();
    }

    public NetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public VirtualMachineScaleSetVMNetworkProfileConfiguration networkProfileConfiguration() {
        return this.innerModel().networkProfileConfiguration();
    }

    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerModel().diagnosticsProfile();
    }

    public SubResource availabilitySet() {
        return this.innerModel().availabilitySet();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String licenseType() {
        return this.innerModel().licenseType();
    }

    public String modelDefinitionApplied() {
        return this.innerModel().modelDefinitionApplied();
    }

    public VirtualMachineScaleSetVMProtectionPolicy protectionPolicy() {
        return this.innerModel().protectionPolicy();
    }

    public VirtualMachineScaleSetVMInner innerModel() {
        return this.innerObject;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }
}
