// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.AppServiceEnvironmentResourceInner;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironmentPatchResource;
import com.azure.resourcemanager.appservice.generated.models.AppServiceEnvironmentResource;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentStatus;
import com.azure.resourcemanager.appservice.generated.models.LoadBalancingMode;
import com.azure.resourcemanager.appservice.generated.models.NameValuePair;
import com.azure.resourcemanager.appservice.generated.models.ProvisioningState;
import com.azure.resourcemanager.appservice.generated.models.Site;
import com.azure.resourcemanager.appservice.generated.models.VirtualNetworkProfile;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AppServiceEnvironmentResourceImpl
    implements AppServiceEnvironmentResource,
        AppServiceEnvironmentResource.Definition,
        AppServiceEnvironmentResource.Update {
    private AppServiceEnvironmentResourceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

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

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public HostingEnvironmentStatus status() {
        return this.innerModel().status();
    }

    public VirtualNetworkProfile virtualNetwork() {
        return this.innerModel().virtualNetwork();
    }

    public LoadBalancingMode internalLoadBalancingMode() {
        return this.innerModel().internalLoadBalancingMode();
    }

    public String multiSize() {
        return this.innerModel().multiSize();
    }

    public Integer multiRoleCount() {
        return this.innerModel().multiRoleCount();
    }

    public Integer ipsslAddressCount() {
        return this.innerModel().ipsslAddressCount();
    }

    public String dnsSuffix() {
        return this.innerModel().dnsSuffix();
    }

    public Integer maximumNumberOfMachines() {
        return this.innerModel().maximumNumberOfMachines();
    }

    public Integer frontEndScaleFactor() {
        return this.innerModel().frontEndScaleFactor();
    }

    public Boolean suspended() {
        return this.innerModel().suspended();
    }

    public List<NameValuePair> clusterSettings() {
        List<NameValuePair> inner = this.innerModel().clusterSettings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> userWhitelistedIpRanges() {
        List<String> inner = this.innerModel().userWhitelistedIpRanges();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean hasLinuxWorkers() {
        return this.innerModel().hasLinuxWorkers();
    }

    public Integer dedicatedHostCount() {
        return this.innerModel().dedicatedHostCount();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AppServiceEnvironmentResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private AppServiceEnvironmentPatchResource updateHostingEnvironmentEnvelope;

    public AppServiceEnvironmentResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AppServiceEnvironmentResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public AppServiceEnvironmentResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), context);
        return this;
    }

    AppServiceEnvironmentResourceImpl(
        String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new AppServiceEnvironmentResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public AppServiceEnvironmentResourceImpl update() {
        this.updateHostingEnvironmentEnvelope = new AppServiceEnvironmentPatchResource();
        return this;
    }

    public AppServiceEnvironmentResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .updateWithResponse(resourceGroupName, name, updateHostingEnvironmentEnvelope, Context.NONE)
                .getValue();
        return this;
    }

    public AppServiceEnvironmentResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .updateWithResponse(resourceGroupName, name, updateHostingEnvironmentEnvelope, context)
                .getValue();
        return this;
    }

    AppServiceEnvironmentResourceImpl(
        AppServiceEnvironmentResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "hostingEnvironments");
    }

    public AppServiceEnvironmentResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
                .getValue();
        return this;
    }

    public AppServiceEnvironmentResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAppServiceEnvironments()
                .getByResourceGroupWithResponse(resourceGroupName, name, context)
                .getValue();
        return this;
    }

    public PagedIterable<Site> changeVnet(VirtualNetworkProfile vnetInfo) {
        return serviceManager.appServiceEnvironments().changeVnet(resourceGroupName, name, vnetInfo);
    }

    public PagedIterable<Site> changeVnet(VirtualNetworkProfile vnetInfo, Context context) {
        return serviceManager.appServiceEnvironments().changeVnet(resourceGroupName, name, vnetInfo, context);
    }

    public void reboot() {
        serviceManager.appServiceEnvironments().reboot(resourceGroupName, name);
    }

    public Response<Void> rebootWithResponse(Context context) {
        return serviceManager.appServiceEnvironments().rebootWithResponse(resourceGroupName, name, context);
    }

    public PagedIterable<Site> resume() {
        return serviceManager.appServiceEnvironments().resume(resourceGroupName, name);
    }

    public PagedIterable<Site> resume(Context context) {
        return serviceManager.appServiceEnvironments().resume(resourceGroupName, name, context);
    }

    public PagedIterable<Site> suspend() {
        return serviceManager.appServiceEnvironments().suspend(resourceGroupName, name);
    }

    public PagedIterable<Site> suspend(Context context) {
        return serviceManager.appServiceEnvironments().suspend(resourceGroupName, name, context);
    }

    public AppServiceEnvironmentResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AppServiceEnvironmentResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AppServiceEnvironmentResourceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AppServiceEnvironmentResourceImpl withVirtualNetwork(VirtualNetworkProfile virtualNetwork) {
        if (isInCreateMode()) {
            this.innerModel().withVirtualNetwork(virtualNetwork);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withVirtualNetwork(virtualNetwork);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withInternalLoadBalancingMode(
        LoadBalancingMode internalLoadBalancingMode) {
        if (isInCreateMode()) {
            this.innerModel().withInternalLoadBalancingMode(internalLoadBalancingMode);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withInternalLoadBalancingMode(internalLoadBalancingMode);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withMultiSize(String multiSize) {
        if (isInCreateMode()) {
            this.innerModel().withMultiSize(multiSize);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withMultiSize(multiSize);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withIpsslAddressCount(Integer ipsslAddressCount) {
        if (isInCreateMode()) {
            this.innerModel().withIpsslAddressCount(ipsslAddressCount);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withIpsslAddressCount(ipsslAddressCount);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withDnsSuffix(String dnsSuffix) {
        if (isInCreateMode()) {
            this.innerModel().withDnsSuffix(dnsSuffix);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withDnsSuffix(dnsSuffix);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withFrontEndScaleFactor(Integer frontEndScaleFactor) {
        if (isInCreateMode()) {
            this.innerModel().withFrontEndScaleFactor(frontEndScaleFactor);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withFrontEndScaleFactor(frontEndScaleFactor);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withClusterSettings(List<NameValuePair> clusterSettings) {
        if (isInCreateMode()) {
            this.innerModel().withClusterSettings(clusterSettings);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withClusterSettings(clusterSettings);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withUserWhitelistedIpRanges(List<String> userWhitelistedIpRanges) {
        if (isInCreateMode()) {
            this.innerModel().withUserWhitelistedIpRanges(userWhitelistedIpRanges);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withUserWhitelistedIpRanges(userWhitelistedIpRanges);
            return this;
        }
    }

    public AppServiceEnvironmentResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateHostingEnvironmentEnvelope.withKind(kind);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
