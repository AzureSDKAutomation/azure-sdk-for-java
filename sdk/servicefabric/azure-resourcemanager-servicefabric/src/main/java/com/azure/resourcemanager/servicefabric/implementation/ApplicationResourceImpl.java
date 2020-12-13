// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicefabric.ServiceFabricManager;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ApplicationResource;
import com.azure.resourcemanager.servicefabric.models.ApplicationResourceUpdate;
import com.azure.resourcemanager.servicefabric.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApplicationResourceImpl
    implements ApplicationResource, ApplicationResource.Definition, ApplicationResource.Update {
    private ApplicationResourceInner innerObject;

    private final ServiceFabricManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public ManagedIdentity identity() {
        return this.innerModel().identity();
    }

    public String typeVersion() {
        return this.innerModel().typeVersion();
    }

    public Map<String, String> parameters() {
        Map<String, String> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ApplicationUpgradePolicy upgradePolicy() {
        return this.innerModel().upgradePolicy();
    }

    public Long minimumNodes() {
        return this.innerModel().minimumNodes();
    }

    public Long maximumNodes() {
        return this.innerModel().maximumNodes();
    }

    public Boolean removeApplicationCapacity() {
        return this.innerModel().removeApplicationCapacity();
    }

    public List<ApplicationMetricDescription> metrics() {
        List<ApplicationMetricDescription> inner = this.innerModel().metrics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationUserAssignedIdentity> managedIdentities() {
        List<ApplicationUserAssignedIdentity> inner = this.innerModel().managedIdentities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String typeName() {
        return this.innerModel().typeName();
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

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public ApplicationResourceInner innerModel() {
        return this.innerObject;
    }

    private ServiceFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String applicationName;

    private ApplicationResourceUpdate updateParameters;

    public ApplicationResourceImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public ApplicationResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createOrUpdate(resourceGroupName, clusterName, applicationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ApplicationResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .createOrUpdate(resourceGroupName, clusterName, applicationName, this.innerModel(), context);
        return this;
    }

    public ApplicationResourceImpl(String name, ServiceFabricManager serviceManager) {
        this.innerObject = new ApplicationResourceInner();
        this.serviceManager = serviceManager;
        this.applicationName = name;
    }

    public ApplicationResourceImpl update() {
        this.updateParameters = new ApplicationResourceUpdate();
        return this;
    }

    public ApplicationResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .update(resourceGroupName, clusterName, applicationName, updateParameters, Context.NONE);
        return this;
    }

    public ApplicationResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .update(resourceGroupName, clusterName, applicationName, updateParameters, context);
        return this;
    }

    public ApplicationResourceImpl(ApplicationResourceInner innerObject, ServiceFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.applicationName = Utils.getValueFromIdByName(innerObject.id(), "applications");
    }

    public ApplicationResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, clusterName, applicationName, Context.NONE)
                .getValue();
        return this;
    }

    public ApplicationResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getApplications()
                .getWithResponse(resourceGroupName, clusterName, applicationName, context)
                .getValue();
        return this;
    }

    public ApplicationResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApplicationResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApplicationResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ApplicationResourceImpl withIdentity(ManagedIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ApplicationResourceImpl withTypeVersion(String typeVersion) {
        if (isInCreateMode()) {
            this.innerModel().withTypeVersion(typeVersion);
            return this;
        } else {
            this.updateParameters.withTypeVersion(typeVersion);
            return this;
        }
    }

    public ApplicationResourceImpl withParameters(Map<String, String> parameters) {
        if (isInCreateMode()) {
            this.innerModel().withParameters(parameters);
            return this;
        } else {
            this.updateParameters.withParameters(parameters);
            return this;
        }
    }

    public ApplicationResourceImpl withUpgradePolicy(ApplicationUpgradePolicy upgradePolicy) {
        if (isInCreateMode()) {
            this.innerModel().withUpgradePolicy(upgradePolicy);
            return this;
        } else {
            this.updateParameters.withUpgradePolicy(upgradePolicy);
            return this;
        }
    }

    public ApplicationResourceImpl withMinimumNodes(Long minimumNodes) {
        if (isInCreateMode()) {
            this.innerModel().withMinimumNodes(minimumNodes);
            return this;
        } else {
            this.updateParameters.withMinimumNodes(minimumNodes);
            return this;
        }
    }

    public ApplicationResourceImpl withMaximumNodes(Long maximumNodes) {
        if (isInCreateMode()) {
            this.innerModel().withMaximumNodes(maximumNodes);
            return this;
        } else {
            this.updateParameters.withMaximumNodes(maximumNodes);
            return this;
        }
    }

    public ApplicationResourceImpl withRemoveApplicationCapacity(Boolean removeApplicationCapacity) {
        if (isInCreateMode()) {
            this.innerModel().withRemoveApplicationCapacity(removeApplicationCapacity);
            return this;
        } else {
            this.updateParameters.withRemoveApplicationCapacity(removeApplicationCapacity);
            return this;
        }
    }

    public ApplicationResourceImpl withMetrics(List<ApplicationMetricDescription> metrics) {
        if (isInCreateMode()) {
            this.innerModel().withMetrics(metrics);
            return this;
        } else {
            this.updateParameters.withMetrics(metrics);
            return this;
        }
    }

    public ApplicationResourceImpl withManagedIdentities(List<ApplicationUserAssignedIdentity> managedIdentities) {
        if (isInCreateMode()) {
            this.innerModel().withManagedIdentities(managedIdentities);
            return this;
        } else {
            this.updateParameters.withManagedIdentities(managedIdentities);
            return this;
        }
    }

    public ApplicationResourceImpl withTypeName(String typeName) {
        this.innerModel().withTypeName(typeName);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
