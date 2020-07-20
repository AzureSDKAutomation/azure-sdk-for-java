/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerService;
import rx.Observable;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceOrchestratorProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceCustomProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceServicePrincipalProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceMasterProfile;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceAgentPoolProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceWindowsProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceLinuxProfile;
import com.microsoft.azure.management.containerservice.v2020_07_01.ContainerServiceDiagnosticsProfile;

class ContainerServiceImpl extends GroupableResourceCoreImpl<ContainerService, ContainerServiceInner, ContainerServiceImpl, ContainerServiceManager> implements ContainerService, ContainerService.Definition, ContainerService.Update {
    ContainerServiceImpl(String name, ContainerServiceInner inner, ContainerServiceManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ContainerService> createResourceAsync() {
        ContainerServicesInner client = this.manager().inner().containerServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ContainerService> updateResourceAsync() {
        ContainerServicesInner client = this.manager().inner().containerServices();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ContainerServiceInner> getInnerAsync() {
        ContainerServicesInner client = this.manager().inner().containerServices();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<ContainerServiceAgentPoolProfile> agentPoolProfiles() {
        return this.inner().agentPoolProfiles();
    }

    @Override
    public ContainerServiceCustomProfile customProfile() {
        return this.inner().customProfile();
    }

    @Override
    public ContainerServiceDiagnosticsProfile diagnosticsProfile() {
        return this.inner().diagnosticsProfile();
    }

    @Override
    public ContainerServiceLinuxProfile linuxProfile() {
        return this.inner().linuxProfile();
    }

    @Override
    public ContainerServiceMasterProfile masterProfile() {
        return this.inner().masterProfile();
    }

    @Override
    public ContainerServiceOrchestratorProfile orchestratorProfile() {
        return this.inner().orchestratorProfile();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ContainerServiceServicePrincipalProfile servicePrincipalProfile() {
        return this.inner().servicePrincipalProfile();
    }

    @Override
    public ContainerServiceWindowsProfile windowsProfile() {
        return this.inner().windowsProfile();
    }

    @Override
    public ContainerServiceImpl withLinuxProfile(ContainerServiceLinuxProfile linuxProfile) {
        this.inner().withLinuxProfile(linuxProfile);
        return this;
    }

    @Override
    public ContainerServiceImpl withMasterProfile(ContainerServiceMasterProfile masterProfile) {
        this.inner().withMasterProfile(masterProfile);
        return this;
    }

    @Override
    public ContainerServiceImpl withOrchestratorProfile(ContainerServiceOrchestratorProfile orchestratorProfile) {
        this.inner().withOrchestratorProfile(orchestratorProfile);
        return this;
    }

    @Override
    public ContainerServiceImpl withAgentPoolProfiles(List<ContainerServiceAgentPoolProfile> agentPoolProfiles) {
        this.inner().withAgentPoolProfiles(agentPoolProfiles);
        return this;
    }

    @Override
    public ContainerServiceImpl withCustomProfile(ContainerServiceCustomProfile customProfile) {
        this.inner().withCustomProfile(customProfile);
        return this;
    }

    @Override
    public ContainerServiceImpl withDiagnosticsProfile(ContainerServiceDiagnosticsProfile diagnosticsProfile) {
        this.inner().withDiagnosticsProfile(diagnosticsProfile);
        return this;
    }

    @Override
    public ContainerServiceImpl withServicePrincipalProfile(ContainerServiceServicePrincipalProfile servicePrincipalProfile) {
        this.inner().withServicePrincipalProfile(servicePrincipalProfile);
        return this;
    }

    @Override
    public ContainerServiceImpl withWindowsProfile(ContainerServiceWindowsProfile windowsProfile) {
        this.inner().withWindowsProfile(windowsProfile);
        return this;
    }

}
