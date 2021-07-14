// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.KubeEnvironmentInner;
import com.azure.resourcemanager.appservice.generated.models.AppLogsConfiguration;
import com.azure.resourcemanager.appservice.generated.models.ArcConfiguration;
import com.azure.resourcemanager.appservice.generated.models.ExtendedLocation;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironment;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironmentPatchResource;
import com.azure.resourcemanager.appservice.generated.models.KubeEnvironmentProvisioningState;
import java.util.Collections;
import java.util.Map;

public final class KubeEnvironmentImpl implements KubeEnvironment, KubeEnvironment.Definition, KubeEnvironment.Update {
    private KubeEnvironmentInner innerObject;

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

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public KubeEnvironmentProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String deploymentErrors() {
        return this.innerModel().deploymentErrors();
    }

    public Boolean internalLoadBalancerEnabled() {
        return this.innerModel().internalLoadBalancerEnabled();
    }

    public String defaultDomain() {
        return this.innerModel().defaultDomain();
    }

    public String staticIp() {
        return this.innerModel().staticIp();
    }

    public ArcConfiguration arcConfiguration() {
        return this.innerModel().arcConfiguration();
    }

    public AppLogsConfiguration appLogsConfiguration() {
        return this.innerModel().appLogsConfiguration();
    }

    public String aksResourceId() {
        return this.innerModel().aksResourceId();
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

    public KubeEnvironmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private KubeEnvironmentPatchResource updateKubeEnvironmentEnvelope;

    public KubeEnvironmentImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public KubeEnvironment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKubeEnvironments()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public KubeEnvironment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKubeEnvironments()
                .createOrUpdate(resourceGroupName, name, this.innerModel(), context);
        return this;
    }

    KubeEnvironmentImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new KubeEnvironmentInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public KubeEnvironmentImpl update() {
        this.updateKubeEnvironmentEnvelope = new KubeEnvironmentPatchResource();
        return this;
    }

    public KubeEnvironment apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKubeEnvironments()
                .updateWithResponse(resourceGroupName, name, updateKubeEnvironmentEnvelope, Context.NONE)
                .getValue();
        return this;
    }

    public KubeEnvironment apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKubeEnvironments()
                .updateWithResponse(resourceGroupName, name, updateKubeEnvironmentEnvelope, context)
                .getValue();
        return this;
    }

    KubeEnvironmentImpl(
        KubeEnvironmentInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "kubeEnvironments");
    }

    public KubeEnvironment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKubeEnvironments()
                .getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE)
                .getValue();
        return this;
    }

    public KubeEnvironment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKubeEnvironments()
                .getByResourceGroupWithResponse(resourceGroupName, name, context)
                .getValue();
        return this;
    }

    public KubeEnvironmentImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public KubeEnvironmentImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public KubeEnvironmentImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public KubeEnvironmentImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public KubeEnvironmentImpl withInternalLoadBalancerEnabled(Boolean internalLoadBalancerEnabled) {
        this.innerModel().withInternalLoadBalancerEnabled(internalLoadBalancerEnabled);
        return this;
    }

    public KubeEnvironmentImpl withStaticIp(String staticIp) {
        this.innerModel().withStaticIp(staticIp);
        return this;
    }

    public KubeEnvironmentImpl withArcConfiguration(ArcConfiguration arcConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withArcConfiguration(arcConfiguration);
            return this;
        } else {
            this.updateKubeEnvironmentEnvelope.withArcConfiguration(arcConfiguration);
            return this;
        }
    }

    public KubeEnvironmentImpl withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withAppLogsConfiguration(appLogsConfiguration);
            return this;
        } else {
            this.updateKubeEnvironmentEnvelope.withAppLogsConfiguration(appLogsConfiguration);
            return this;
        }
    }

    public KubeEnvironmentImpl withAksResourceId(String aksResourceId) {
        this.innerModel().withAksResourceId(aksResourceId);
        return this;
    }

    public KubeEnvironmentImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.innerModel().withKind(kind);
            return this;
        } else {
            this.updateKubeEnvironmentEnvelope.withKind(kind);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
