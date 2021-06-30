// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customproviders.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.customproviders.fluent.models.CustomRPManifestInner;
import com.azure.resourcemanager.customproviders.models.CustomRPActionRouteDefinition;
import com.azure.resourcemanager.customproviders.models.CustomRPManifest;
import com.azure.resourcemanager.customproviders.models.CustomRPResourceTypeRouteDefinition;
import com.azure.resourcemanager.customproviders.models.CustomRPValidations;
import com.azure.resourcemanager.customproviders.models.ProvisioningState;
import com.azure.resourcemanager.customproviders.models.ResourceProvidersUpdate;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CustomRPManifestImpl
    implements CustomRPManifest, CustomRPManifest.Definition, CustomRPManifest.Update {
    private CustomRPManifestInner innerObject;

    private final com.azure.resourcemanager.customproviders.CustomprovidersManager serviceManager;

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

    public List<CustomRPActionRouteDefinition> actions() {
        List<CustomRPActionRouteDefinition> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CustomRPResourceTypeRouteDefinition> resourceTypes() {
        List<CustomRPResourceTypeRouteDefinition> inner = this.innerModel().resourceTypes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CustomRPValidations> validations() {
        List<CustomRPValidations> inner = this.innerModel().validations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public CustomRPManifestInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.customproviders.CustomprovidersManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceProviderName;

    private ResourceProvidersUpdate updatePatchableResource;

    public CustomRPManifestImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CustomRPManifest create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomResourceProviders()
                .createOrUpdate(resourceGroupName, resourceProviderName, this.innerModel(), Context.NONE);
        return this;
    }

    public CustomRPManifest create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomResourceProviders()
                .createOrUpdate(resourceGroupName, resourceProviderName, this.innerModel(), context);
        return this;
    }

    CustomRPManifestImpl(String name, com.azure.resourcemanager.customproviders.CustomprovidersManager serviceManager) {
        this.innerObject = new CustomRPManifestInner();
        this.serviceManager = serviceManager;
        this.resourceProviderName = name;
    }

    public CustomRPManifestImpl update() {
        this.updatePatchableResource = new ResourceProvidersUpdate();
        return this;
    }

    public CustomRPManifest apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomResourceProviders()
                .updateWithResponse(resourceGroupName, resourceProviderName, updatePatchableResource, Context.NONE)
                .getValue();
        return this;
    }

    public CustomRPManifest apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomResourceProviders()
                .updateWithResponse(resourceGroupName, resourceProviderName, updatePatchableResource, context)
                .getValue();
        return this;
    }

    CustomRPManifestImpl(
        CustomRPManifestInner innerObject,
        com.azure.resourcemanager.customproviders.CustomprovidersManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceProviderName = Utils.getValueFromIdByName(innerObject.id(), "resourceProviders");
    }

    public CustomRPManifest refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomResourceProviders()
                .getByResourceGroupWithResponse(resourceGroupName, resourceProviderName, Context.NONE)
                .getValue();
        return this;
    }

    public CustomRPManifest refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomResourceProviders()
                .getByResourceGroupWithResponse(resourceGroupName, resourceProviderName, context)
                .getValue();
        return this;
    }

    public CustomRPManifestImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CustomRPManifestImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CustomRPManifestImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePatchableResource.withTags(tags);
            return this;
        }
    }

    public CustomRPManifestImpl withActions(List<CustomRPActionRouteDefinition> actions) {
        this.innerModel().withActions(actions);
        return this;
    }

    public CustomRPManifestImpl withResourceTypes(List<CustomRPResourceTypeRouteDefinition> resourceTypes) {
        this.innerModel().withResourceTypes(resourceTypes);
        return this;
    }

    public CustomRPManifestImpl withValidations(List<CustomRPValidations> validations) {
        this.innerModel().withValidations(validations);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
