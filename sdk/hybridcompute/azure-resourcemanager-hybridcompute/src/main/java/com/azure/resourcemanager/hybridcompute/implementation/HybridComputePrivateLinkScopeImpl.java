// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.fluent.models.HybridComputePrivateLinkScopeInner;
import com.azure.resourcemanager.hybridcompute.models.HybridComputePrivateLinkScope;
import com.azure.resourcemanager.hybridcompute.models.PublicNetworkAccessType;
import com.azure.resourcemanager.hybridcompute.models.TagsResource;
import java.util.Collections;
import java.util.Map;

public final class HybridComputePrivateLinkScopeImpl
    implements HybridComputePrivateLinkScope,
        HybridComputePrivateLinkScope.Definition,
        HybridComputePrivateLinkScope.Update {
    private HybridComputePrivateLinkScopeInner innerObject;

    private final HybridComputeManager serviceManager;

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

    public PublicNetworkAccessType publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String privateLinkScopeId() {
        return this.innerModel().privateLinkScopeId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public HybridComputePrivateLinkScopeInner innerModel() {
        return this.innerObject;
    }

    private HybridComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String scopeName;

    private TagsResource updatePrivateLinkScopeTags;

    public HybridComputePrivateLinkScopeImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public HybridComputePrivateLinkScope create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkScopes()
                .createOrUpdateWithResponse(resourceGroupName, scopeName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public HybridComputePrivateLinkScope create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkScopes()
                .createOrUpdateWithResponse(resourceGroupName, scopeName, this.innerModel(), context)
                .getValue();
        return this;
    }

    HybridComputePrivateLinkScopeImpl(String name, HybridComputeManager serviceManager) {
        this.innerObject = new HybridComputePrivateLinkScopeInner();
        this.serviceManager = serviceManager;
        this.scopeName = name;
    }

    public HybridComputePrivateLinkScopeImpl update() {
        this.updatePrivateLinkScopeTags = new TagsResource();
        return this;
    }

    public HybridComputePrivateLinkScope apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkScopes()
                .updateTagsWithResponse(resourceGroupName, scopeName, updatePrivateLinkScopeTags, Context.NONE)
                .getValue();
        return this;
    }

    public HybridComputePrivateLinkScope apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkScopes()
                .updateTagsWithResponse(resourceGroupName, scopeName, updatePrivateLinkScopeTags, context)
                .getValue();
        return this;
    }

    HybridComputePrivateLinkScopeImpl(
        HybridComputePrivateLinkScopeInner innerObject, HybridComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.scopeName = Utils.getValueFromIdByName(innerObject.id(), "privateLinkScopes");
    }

    public HybridComputePrivateLinkScope refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkScopes()
                .getByResourceGroupWithResponse(resourceGroupName, scopeName, Context.NONE)
                .getValue();
        return this;
    }

    public HybridComputePrivateLinkScope refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkScopes()
                .getByResourceGroupWithResponse(resourceGroupName, scopeName, context)
                .getValue();
        return this;
    }

    public HybridComputePrivateLinkScopeImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public HybridComputePrivateLinkScopeImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public HybridComputePrivateLinkScopeImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePrivateLinkScopeTags.withTags(tags);
            return this;
        }
    }

    public HybridComputePrivateLinkScopeImpl withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess) {
        this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
