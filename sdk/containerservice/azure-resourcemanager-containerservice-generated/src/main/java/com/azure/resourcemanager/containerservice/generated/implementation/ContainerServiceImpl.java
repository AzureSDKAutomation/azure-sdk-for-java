// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerservice.generated.fluent.models.ContainerServiceInner;
import com.azure.resourcemanager.containerservice.generated.models.ContainerService;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceAgentPoolProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceCustomProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceDiagnosticsProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceLinuxProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceMasterProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceOrchestratorProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServicePrincipalProfile;
import com.azure.resourcemanager.containerservice.generated.models.ContainerServiceWindowsProfile;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ContainerServiceImpl
    implements ContainerService, ContainerService.Definition, ContainerService.Update {
    private ContainerServiceInner innerObject;

    private final com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager;

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

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ContainerServiceOrchestratorProfile orchestratorProfile() {
        return this.innerModel().orchestratorProfile();
    }

    public ContainerServiceCustomProfile customProfile() {
        return this.innerModel().customProfile();
    }

    public ContainerServicePrincipalProfile servicePrincipalProfile() {
        return this.innerModel().servicePrincipalProfile();
    }

    public ContainerServiceMasterProfile masterProfile() {
        return this.innerModel().masterProfile();
    }

    public List<ContainerServiceAgentPoolProfile> agentPoolProfiles() {
        List<ContainerServiceAgentPoolProfile> inner = this.innerModel().agentPoolProfiles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ContainerServiceWindowsProfile windowsProfile() {
        return this.innerModel().windowsProfile();
    }

    public ContainerServiceLinuxProfile linuxProfile() {
        return this.innerModel().linuxProfile();
    }

    public ContainerServiceDiagnosticsProfile diagnosticsProfile() {
        return this.innerModel().diagnosticsProfile();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ContainerServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerservice.generated.ContainerServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String containerServiceName;

    public ContainerServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ContainerService create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerServices()
                .createOrUpdate(resourceGroupName, containerServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ContainerService create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerServices()
                .createOrUpdate(resourceGroupName, containerServiceName, this.innerModel(), context);
        return this;
    }

    ContainerServiceImpl(
        String name, com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerObject = new ContainerServiceInner();
        this.serviceManager = serviceManager;
        this.containerServiceName = name;
    }

    public ContainerServiceImpl update() {
        return this;
    }

    public ContainerService apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerServices()
                .createOrUpdate(resourceGroupName, containerServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public ContainerService apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerServices()
                .createOrUpdate(resourceGroupName, containerServiceName, this.innerModel(), context);
        return this;
    }

    ContainerServiceImpl(
        ContainerServiceInner innerObject,
        com.azure.resourcemanager.containerservice.generated.ContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.containerServiceName = Utils.getValueFromIdByName(innerObject.id(), "containerServices");
    }

    public ContainerService refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerServices()
                .getByResourceGroupWithResponse(resourceGroupName, containerServiceName, Context.NONE)
                .getValue();
        return this;
    }

    public ContainerService refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainerServices()
                .getByResourceGroupWithResponse(resourceGroupName, containerServiceName, context)
                .getValue();
        return this;
    }

    public ContainerServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ContainerServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ContainerServiceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public ContainerServiceImpl withOrchestratorProfile(ContainerServiceOrchestratorProfile orchestratorProfile) {
        this.innerModel().withOrchestratorProfile(orchestratorProfile);
        return this;
    }

    public ContainerServiceImpl withCustomProfile(ContainerServiceCustomProfile customProfile) {
        this.innerModel().withCustomProfile(customProfile);
        return this;
    }

    public ContainerServiceImpl withServicePrincipalProfile(ContainerServicePrincipalProfile servicePrincipalProfile) {
        this.innerModel().withServicePrincipalProfile(servicePrincipalProfile);
        return this;
    }

    public ContainerServiceImpl withMasterProfile(ContainerServiceMasterProfile masterProfile) {
        this.innerModel().withMasterProfile(masterProfile);
        return this;
    }

    public ContainerServiceImpl withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles) {
        this.innerModel().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    public ContainerServiceImpl withWindowsProfile(ContainerServiceWindowsProfile windowsProfile) {
        this.innerModel().withWindowsProfile(windowsProfile);
        return this;
    }

    public ContainerServiceImpl withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        this.innerModel().withLinuxProfile(linuxProfile);
        return this;
    }

    public ContainerServiceImpl withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile) {
        this.innerModel().withDiagnosticsProfile(diagnosticsProfile);
        return this;
    }
}
