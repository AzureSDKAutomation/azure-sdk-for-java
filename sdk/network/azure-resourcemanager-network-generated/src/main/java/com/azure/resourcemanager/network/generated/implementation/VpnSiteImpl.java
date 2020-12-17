// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteInner;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkInner;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.DeviceProperties;
import com.azure.resourcemanager.network.generated.models.O365PolicyPropertiesAutoGenerated;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VpnSite;
import com.azure.resourcemanager.network.generated.models.VpnSiteLink;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VpnSiteImpl implements VpnSite, VpnSite.Definition, VpnSite.Update {
    private VpnSiteInner innerObject;

    private final NetworkManager serviceManager;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public SubResource virtualWan() {
        return this.innerModel().virtualWan();
    }

    public DeviceProperties deviceProperties() {
        return this.innerModel().deviceProperties();
    }

    public String ipAddress() {
        return this.innerModel().ipAddress();
    }

    public String siteKey() {
        return this.innerModel().siteKey();
    }

    public AddressSpace addressSpace() {
        return this.innerModel().addressSpace();
    }

    public BgpSettings bgpProperties() {
        return this.innerModel().bgpProperties();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean isSecuritySite() {
        return this.innerModel().isSecuritySite();
    }

    public List<VpnSiteLink> vpnSiteLinks() {
        List<VpnSiteLinkInner> inner = this.innerModel().vpnSiteLinks();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VpnSiteLinkImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public O365PolicyPropertiesAutoGenerated o365Policy() {
        return this.innerModel().o365Policy();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VpnSiteInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vpnSiteName;

    private TagsObject updateVpnSiteParameters;

    public VpnSiteImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VpnSite create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnSites()
                .createOrUpdate(resourceGroupName, vpnSiteName, this.innerModel(), Context.NONE);
        return this;
    }

    public VpnSite create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnSites()
                .createOrUpdate(resourceGroupName, vpnSiteName, this.innerModel(), context);
        return this;
    }

    VpnSiteImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new VpnSiteInner();
        this.serviceManager = serviceManager;
        this.vpnSiteName = name;
    }

    public VpnSiteImpl update() {
        this.updateVpnSiteParameters = new TagsObject();
        return this;
    }

    public VpnSite apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnSites()
                .updateTagsWithResponse(resourceGroupName, vpnSiteName, updateVpnSiteParameters, Context.NONE)
                .getValue();
        return this;
    }

    public VpnSite apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnSites()
                .updateTagsWithResponse(resourceGroupName, vpnSiteName, updateVpnSiteParameters, context)
                .getValue();
        return this;
    }

    VpnSiteImpl(VpnSiteInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vpnSiteName = Utils.getValueFromIdByName(innerObject.id(), "vpnSites");
    }

    public VpnSite refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnSites()
                .getByResourceGroupWithResponse(resourceGroupName, vpnSiteName, Context.NONE)
                .getValue();
        return this;
    }

    public VpnSite refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVpnSites()
                .getByResourceGroupWithResponse(resourceGroupName, vpnSiteName, context)
                .getValue();
        return this;
    }

    public VpnSiteImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VpnSiteImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VpnSiteImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateVpnSiteParameters.withTags(tags);
            return this;
        }
    }

    public VpnSiteImpl withVirtualWan(SubResource virtualWan) {
        this.innerModel().withVirtualWan(virtualWan);
        return this;
    }

    public VpnSiteImpl withDeviceProperties(DeviceProperties deviceProperties) {
        this.innerModel().withDeviceProperties(deviceProperties);
        return this;
    }

    public VpnSiteImpl withIpAddress(String ipAddress) {
        this.innerModel().withIpAddress(ipAddress);
        return this;
    }

    public VpnSiteImpl withSiteKey(String siteKey) {
        this.innerModel().withSiteKey(siteKey);
        return this;
    }

    public VpnSiteImpl withAddressSpace(AddressSpace addressSpace) {
        this.innerModel().withAddressSpace(addressSpace);
        return this;
    }

    public VpnSiteImpl withBgpProperties(BgpSettings bgpProperties) {
        this.innerModel().withBgpProperties(bgpProperties);
        return this;
    }

    public VpnSiteImpl withIsSecuritySite(Boolean isSecuritySite) {
        this.innerModel().withIsSecuritySite(isSecuritySite);
        return this;
    }

    public VpnSiteImpl withVpnSiteLinks(List<VpnSiteLinkInner> vpnSiteLinks) {
        this.innerModel().withVpnSiteLinks(vpnSiteLinks);
        return this;
    }

    public VpnSiteImpl withO365Policy(O365PolicyPropertiesAutoGenerated o365Policy) {
        this.innerModel().withO365Policy(o365Policy);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
