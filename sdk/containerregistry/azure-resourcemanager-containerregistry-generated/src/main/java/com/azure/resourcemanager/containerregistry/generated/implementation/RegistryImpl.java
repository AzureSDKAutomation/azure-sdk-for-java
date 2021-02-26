// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.RegistryInner;
import com.azure.resourcemanager.containerregistry.generated.models.EncryptionProperty;
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.NetworkRuleBypassOptions;
import com.azure.resourcemanager.containerregistry.generated.models.NetworkRuleSet;
import com.azure.resourcemanager.containerregistry.generated.models.Policies;
import com.azure.resourcemanager.containerregistry.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.generated.models.PublicNetworkAccess;
import com.azure.resourcemanager.containerregistry.generated.models.Registry;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryUpdateParameters;
import com.azure.resourcemanager.containerregistry.generated.models.Sku;
import com.azure.resourcemanager.containerregistry.generated.models.Status;
import com.azure.resourcemanager.containerregistry.generated.models.SystemData;
import com.azure.resourcemanager.containerregistry.generated.models.ZoneRedundancy;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class RegistryImpl implements Registry, Registry.Definition, Registry.Update {
    private RegistryInner innerObject;

    private final ContainerRegistryManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public IdentityProperties identity() {
        return this.innerModel().identity();
    }

    public String loginServer() {
        return this.innerModel().loginServer();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Status status() {
        return this.innerModel().status();
    }

    public Boolean adminUserEnabled() {
        return this.innerModel().adminUserEnabled();
    }

    public NetworkRuleSet networkRuleSet() {
        return this.innerModel().networkRuleSet();
    }

    public Policies policies() {
        return this.innerModel().policies();
    }

    public EncryptionProperty encryption() {
        return this.innerModel().encryption();
    }

    public Boolean dataEndpointEnabled() {
        return this.innerModel().dataEndpointEnabled();
    }

    public List<String> dataEndpointHostNames() {
        List<String> inner = this.innerModel().dataEndpointHostNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public NetworkRuleBypassOptions networkRuleBypassOptions() {
        return this.innerModel().networkRuleBypassOptions();
    }

    public ZoneRedundancy zoneRedundancy() {
        return this.innerModel().zoneRedundancy();
    }

    public Boolean anonymousPullEnabled() {
        return this.innerModel().anonymousPullEnabled();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public RegistryInner innerModel() {
        return this.innerObject;
    }

    private ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String registryName;

    private RegistryUpdateParameters updateRegistryUpdateParameters;

    public RegistryImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Registry create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistries()
                .create(resourceGroupName, registryName, this.innerModel(), Context.NONE);
        return this;
    }

    public Registry create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistries()
                .create(resourceGroupName, registryName, this.innerModel(), context);
        return this;
    }

    RegistryImpl(String name, ContainerRegistryManager serviceManager) {
        this.innerObject = new RegistryInner();
        this.serviceManager = serviceManager;
        this.registryName = name;
    }

    public RegistryImpl update() {
        this.updateRegistryUpdateParameters = new RegistryUpdateParameters();
        return this;
    }

    public Registry apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistries()
                .update(resourceGroupName, registryName, updateRegistryUpdateParameters, Context.NONE);
        return this;
    }

    public Registry apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistries()
                .update(resourceGroupName, registryName, updateRegistryUpdateParameters, context);
        return this;
    }

    RegistryImpl(RegistryInner innerObject, ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.registryName = Utils.getValueFromIdByName(innerObject.id(), "registries");
    }

    public Registry refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistries()
                .getByResourceGroupWithResponse(resourceGroupName, registryName, Context.NONE)
                .getValue();
        return this;
    }

    public Registry refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegistries()
                .getByResourceGroupWithResponse(resourceGroupName, registryName, context)
                .getValue();
        return this;
    }

    public RegistryImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public RegistryImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public RegistryImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withSku(sku);
            return this;
        }
    }

    public RegistryImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withTags(tags);
            return this;
        }
    }

    public RegistryImpl withIdentity(IdentityProperties identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public RegistryImpl withAdminUserEnabled(Boolean adminUserEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withAdminUserEnabled(adminUserEnabled);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withAdminUserEnabled(adminUserEnabled);
            return this;
        }
    }

    public RegistryImpl withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkRuleSet(networkRuleSet);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withNetworkRuleSet(networkRuleSet);
            return this;
        }
    }

    public RegistryImpl withPolicies(Policies policies) {
        if (isInCreateMode()) {
            this.innerModel().withPolicies(policies);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withPolicies(policies);
            return this;
        }
    }

    public RegistryImpl withEncryption(EncryptionProperty encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withEncryption(encryption);
            return this;
        }
    }

    public RegistryImpl withDataEndpointEnabled(Boolean dataEndpointEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withDataEndpointEnabled(dataEndpointEnabled);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withDataEndpointEnabled(dataEndpointEnabled);
            return this;
        }
    }

    public RegistryImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public RegistryImpl withNetworkRuleBypassOptions(NetworkRuleBypassOptions networkRuleBypassOptions) {
        if (isInCreateMode()) {
            this.innerModel().withNetworkRuleBypassOptions(networkRuleBypassOptions);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withNetworkRuleBypassOptions(networkRuleBypassOptions);
            return this;
        }
    }

    public RegistryImpl withZoneRedundancy(ZoneRedundancy zoneRedundancy) {
        this.innerModel().withZoneRedundancy(zoneRedundancy);
        return this;
    }

    public RegistryImpl withAnonymousPullEnabled(Boolean anonymousPullEnabled) {
        if (isInCreateMode()) {
            this.innerModel().withAnonymousPullEnabled(anonymousPullEnabled);
            return this;
        } else {
            this.updateRegistryUpdateParameters.withAnonymousPullEnabled(anonymousPullEnabled);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
