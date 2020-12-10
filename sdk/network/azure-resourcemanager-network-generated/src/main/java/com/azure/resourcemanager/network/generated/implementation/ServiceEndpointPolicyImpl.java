// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.NetworkManager;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyDefinitionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ServiceEndpointPolicyInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicy;
import com.azure.resourcemanager.network.generated.models.ServiceEndpointPolicyDefinition;
import com.azure.resourcemanager.network.generated.models.Subnet;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ServiceEndpointPolicyImpl
    implements ServiceEndpointPolicy, ServiceEndpointPolicy.Definition, ServiceEndpointPolicy.Update {
    private ServiceEndpointPolicyInner innerObject;

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

    public List<ServiceEndpointPolicyDefinition> serviceEndpointPolicyDefinitions() {
        List<ServiceEndpointPolicyDefinitionInner> inner = this.innerModel().serviceEndpointPolicyDefinitions();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ServiceEndpointPolicyDefinitionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<Subnet> subnets() {
        List<SubnetInner> inner = this.innerModel().subnets();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner.stream().map(inner1 -> new SubnetImpl(inner1, this.manager())).collect(Collectors.toList()));
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

    public ServiceEndpointPolicyInner innerModel() {
        return this.innerObject;
    }

    private NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceEndpointPolicyName;

    private TagsObject updateParameters;

    public ServiceEndpointPolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ServiceEndpointPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicies()
                .createOrUpdate(resourceGroupName, serviceEndpointPolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public ServiceEndpointPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicies()
                .createOrUpdate(resourceGroupName, serviceEndpointPolicyName, this.innerModel(), context);
        return this;
    }

    public ServiceEndpointPolicyImpl(String name, NetworkManager serviceManager) {
        this.innerObject = new ServiceEndpointPolicyInner();
        this.serviceManager = serviceManager;
        this.serviceEndpointPolicyName = name;
    }

    public ServiceEndpointPolicyImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public ServiceEndpointPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicies()
                .updateTagsWithResponse(resourceGroupName, serviceEndpointPolicyName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceEndpointPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicies()
                .updateTagsWithResponse(resourceGroupName, serviceEndpointPolicyName, updateParameters, context)
                .getValue();
        return this;
    }

    public ServiceEndpointPolicyImpl(ServiceEndpointPolicyInner innerObject, NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceEndpointPolicyName = Utils.getValueFromIdByName(innerObject.id(), "serviceEndpointPolicies");
    }

    public ServiceEndpointPolicy refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, serviceEndpointPolicyName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public ServiceEndpointPolicy refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getServiceEndpointPolicies()
                .getByResourceGroupWithResponse(resourceGroupName, serviceEndpointPolicyName, localExpand, context)
                .getValue();
        return this;
    }

    public ServiceEndpointPolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ServiceEndpointPolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ServiceEndpointPolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ServiceEndpointPolicyImpl withServiceEndpointPolicyDefinitions(
        List<ServiceEndpointPolicyDefinitionInner> serviceEndpointPolicyDefinitions) {
        this.innerModel().withServiceEndpointPolicyDefinitions(serviceEndpointPolicyDefinitions);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
