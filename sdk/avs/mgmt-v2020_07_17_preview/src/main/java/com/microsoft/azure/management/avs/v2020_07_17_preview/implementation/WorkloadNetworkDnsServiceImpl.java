/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_07_17_preview.implementation;

import com.microsoft.azure.management.avs.v2020_07_17_preview.WorkloadNetworkDnsService;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.avs.v2020_07_17_preview.DnsServiceLogLevelEnum;
import com.microsoft.azure.management.avs.v2020_07_17_preview.DnsServiceStatusEnum;
import com.microsoft.azure.management.avs.v2020_07_17_preview.WorkloadNetworkDnsServiceProvisioningState;

class WorkloadNetworkDnsServiceImpl extends CreatableUpdatableImpl<WorkloadNetworkDnsService, WorkloadNetworkDnsServiceInner, WorkloadNetworkDnsServiceImpl> implements WorkloadNetworkDnsService, WorkloadNetworkDnsService.Definition, WorkloadNetworkDnsService.Update {
    private final AVSManager manager;
    private String resourceGroupName;
    private String privateCloudName;
    private String dnsServiceId;

    WorkloadNetworkDnsServiceImpl(String name, AVSManager manager) {
        super(name, new WorkloadNetworkDnsServiceInner());
        this.manager = manager;
        // Set resource name
        this.dnsServiceId = name;
        //
    }

    WorkloadNetworkDnsServiceImpl(WorkloadNetworkDnsServiceInner inner, AVSManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.dnsServiceId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.privateCloudName = IdParsingUtils.getValueFromIdByName(inner.id(), "privateClouds");
        this.dnsServiceId = IdParsingUtils.getValueFromIdByName(inner.id(), "dnsServices");
        //
    }

    @Override
    public AVSManager manager() {
        return this.manager;
    }

    @Override
    public Observable<WorkloadNetworkDnsService> createResourceAsync() {
        WorkloadNetworksInner client = this.manager().inner().workloadNetworks();
        return client.createDnsServiceAsync(this.resourceGroupName, this.privateCloudName, this.dnsServiceId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<WorkloadNetworkDnsService> updateResourceAsync() {
        WorkloadNetworksInner client = this.manager().inner().workloadNetworks();
        return client.updateDnsServiceAsync(this.resourceGroupName, this.privateCloudName, this.dnsServiceId, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<WorkloadNetworkDnsServiceInner> getInnerAsync() {
        WorkloadNetworksInner client = this.manager().inner().workloadNetworks();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String defaultDnsZone() {
        return this.inner().defaultDnsZone();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String dnsServiceIp() {
        return this.inner().dnsServiceIp();
    }

    @Override
    public List<String> fqdnZones() {
        return this.inner().fqdnZones();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DnsServiceLogLevelEnum logLevel() {
        return this.inner().logLevel();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public WorkloadNetworkDnsServiceProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Long revision() {
        return this.inner().revision();
    }

    @Override
    public DnsServiceStatusEnum status() {
        return this.inner().status();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public WorkloadNetworkDnsServiceImpl withExistingWorkloadNetwork(String resourceGroupName, String privateCloudName) {
        this.resourceGroupName = resourceGroupName;
        this.privateCloudName = privateCloudName;
        return this;
    }

    @Override
    public WorkloadNetworkDnsServiceImpl withDefaultDnsZone(String defaultDnsZone) {
        this.inner().withDefaultDnsZone(defaultDnsZone);
        return this;
    }

    @Override
    public WorkloadNetworkDnsServiceImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public WorkloadNetworkDnsServiceImpl withDnsServiceIp(String dnsServiceIp) {
        this.inner().withDnsServiceIp(dnsServiceIp);
        return this;
    }

    @Override
    public WorkloadNetworkDnsServiceImpl withFqdnZones(List<String> fqdnZones) {
        this.inner().withFqdnZones(fqdnZones);
        return this;
    }

    @Override
    public WorkloadNetworkDnsServiceImpl withLogLevel(DnsServiceLogLevelEnum logLevel) {
        this.inner().withLogLevel(logLevel);
        return this;
    }

    @Override
    public WorkloadNetworkDnsServiceImpl withRevision(Long revision) {
        this.inner().withRevision(revision);
        return this;
    }

}
