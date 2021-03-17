// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixInner;
import com.azure.resourcemanager.network.generated.models.CommissionedState;
import com.azure.resourcemanager.network.generated.models.CustomIpPrefix;
import com.azure.resourcemanager.network.generated.models.ExtendedLocation;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class CustomIpPrefixImpl implements CustomIpPrefix, CustomIpPrefix.Definition, CustomIpPrefix.Update {
    private CustomIpPrefixInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

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

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String cidr() {
        return this.innerModel().cidr();
    }

    public String signedMessage() {
        return this.innerModel().signedMessage();
    }

    public String authorizationMessage() {
        return this.innerModel().authorizationMessage();
    }

    public CustomIpPrefix customIpPrefixParent() {
        CustomIpPrefixInner inner = this.innerModel().customIpPrefixParent();
        if (inner != null) {
            return new CustomIpPrefixImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<CustomIpPrefix> childCustomIpPrefixes() {
        List<CustomIpPrefixInner> inner = this.innerModel().childCustomIpPrefixes();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new CustomIpPrefixImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public CommissionedState commissionedState() {
        return this.innerModel().commissionedState();
    }

    public List<SubResource> publicIpPrefixes() {
        List<SubResource> inner = this.innerModel().publicIpPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
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

    public CustomIpPrefixInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String customIpPrefixName;

    private TagsObject updateParameters;

    public CustomIpPrefixImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CustomIpPrefix create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .createOrUpdate(resourceGroupName, customIpPrefixName, this.innerModel(), Context.NONE);
        return this;
    }

    public CustomIpPrefix create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .createOrUpdate(resourceGroupName, customIpPrefixName, this.innerModel(), context);
        return this;
    }

    CustomIpPrefixImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new CustomIpPrefixInner();
        this.serviceManager = serviceManager;
        this.customIpPrefixName = name;
    }

    public CustomIpPrefixImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public CustomIpPrefix apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .updateTagsWithResponse(resourceGroupName, customIpPrefixName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public CustomIpPrefix apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .updateTagsWithResponse(resourceGroupName, customIpPrefixName, updateParameters, context)
                .getValue();
        return this;
    }

    CustomIpPrefixImpl(
        CustomIpPrefixInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.customIpPrefixName = Utils.getValueFromIdByName(innerObject.id(), "customIpPrefixes");
    }

    public CustomIpPrefix refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .getByResourceGroupWithResponse(resourceGroupName, customIpPrefixName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public CustomIpPrefix refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomIpPrefixes()
                .getByResourceGroupWithResponse(resourceGroupName, customIpPrefixName, localExpand, context)
                .getValue();
        return this;
    }

    public CustomIpPrefixImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CustomIpPrefixImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CustomIpPrefixImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public CustomIpPrefixImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public CustomIpPrefixImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public CustomIpPrefixImpl withCidr(String cidr) {
        this.innerModel().withCidr(cidr);
        return this;
    }

    public CustomIpPrefixImpl withSignedMessage(String signedMessage) {
        this.innerModel().withSignedMessage(signedMessage);
        return this;
    }

    public CustomIpPrefixImpl withAuthorizationMessage(String authorizationMessage) {
        this.innerModel().withAuthorizationMessage(authorizationMessage);
        return this;
    }

    public CustomIpPrefixImpl withCustomIpPrefixParent(CustomIpPrefixInner customIpPrefixParent) {
        this.innerModel().withCustomIpPrefixParent(customIpPrefixParent);
        return this;
    }

    public CustomIpPrefixImpl withCommissionedState(CommissionedState commissionedState) {
        this.innerModel().withCommissionedState(commissionedState);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
