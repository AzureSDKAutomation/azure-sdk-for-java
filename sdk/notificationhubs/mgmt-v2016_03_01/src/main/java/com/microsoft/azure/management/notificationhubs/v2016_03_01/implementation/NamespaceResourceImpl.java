/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2016_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.NamespaceResource;
import rx.Observable;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.NamespacePatchParameters;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.NamespaceCreateOrUpdateParameters;
import org.joda.time.DateTime;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.NamespaceType;
import com.microsoft.azure.management.notificationhubs.v2016_03_01.Sku;
import rx.functions.Func1;

class NamespaceResourceImpl extends GroupableResourceCoreImpl<NamespaceResource, NamespaceResourceInner, NamespaceResourceImpl, NotificationHubsManager> implements NamespaceResource, NamespaceResource.Definition, NamespaceResource.Update {
    private NamespaceCreateOrUpdateParameters createParameter;
    private NamespacePatchParameters updateParameter;
    NamespaceResourceImpl(String name, NamespaceResourceInner inner, NotificationHubsManager manager) {
        super(name, inner, manager);
        this.createParameter = new NamespaceCreateOrUpdateParameters();
        this.updateParameter = new NamespacePatchParameters();
    }

    @Override
    public Observable<NamespaceResource> createResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<NamespaceResourceInner, NamespaceResourceInner>() {
               @Override
               public NamespaceResourceInner call(NamespaceResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NamespaceResource> updateResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.patchAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<NamespaceResourceInner, NamespaceResourceInner>() {
               @Override
               public NamespaceResourceInner call(NamespaceResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NamespaceResourceInner> getInnerAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new NamespaceCreateOrUpdateParameters();
        this.updateParameter = new NamespacePatchParameters();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public Boolean critical() {
        return this.inner().critical();
    }

    @Override
    public Boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public String namespaceResourceName() {
        return this.inner().namespaceResourceName();
    }

    @Override
    public NamespaceType namespaceType() {
        return this.inner().namespaceType();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String region() {
        return this.inner().region();
    }

    @Override
    public String scaleUnit() {
        return this.inner().scaleUnit();
    }

    @Override
    public String serviceBusEndpoint() {
        return this.inner().serviceBusEndpoint();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

    @Override
    public String subscriptionId() {
        return this.inner().subscriptionId();
    }

    @Override
    public NamespaceResourceImpl withCreatedAt(DateTime createdAt) {
        this.createParameter.withCreatedAt(createdAt);
        return this;
    }

    @Override
    public NamespaceResourceImpl withCritical(Boolean critical) {
        this.createParameter.withCritical(critical);
        return this;
    }

    @Override
    public NamespaceResourceImpl withEnabled(Boolean enabled) {
        this.createParameter.withEnabled(enabled);
        return this;
    }

    @Override
    public NamespaceResourceImpl withNamespaceCreateOrUpdateParametersName(String namespaceCreateOrUpdateParametersName) {
        this.createParameter.withNamespaceCreateOrUpdateParametersName(namespaceCreateOrUpdateParametersName);
        return this;
    }

    @Override
    public NamespaceResourceImpl withNamespaceType(NamespaceType namespaceType) {
        this.createParameter.withNamespaceType(namespaceType);
        return this;
    }

    @Override
    public NamespaceResourceImpl withProvisioningState(String provisioningState) {
        this.createParameter.withProvisioningState(provisioningState);
        return this;
    }

    @Override
    public NamespaceResourceImpl withRegion(String region) {
        this.createParameter.withRegion(region);
        return this;
    }

    @Override
    public NamespaceResourceImpl withScaleUnit(String scaleUnit) {
        this.createParameter.withScaleUnit(scaleUnit);
        return this;
    }

    @Override
    public NamespaceResourceImpl withServiceBusEndpoint(String serviceBusEndpoint) {
        this.createParameter.withServiceBusEndpoint(serviceBusEndpoint);
        return this;
    }

    @Override
    public NamespaceResourceImpl withStatus(String status) {
        this.createParameter.withStatus(status);
        return this;
    }

    @Override
    public NamespaceResourceImpl withSubscriptionId(String subscriptionId) {
        this.createParameter.withSubscriptionId(subscriptionId);
        return this;
    }

    @Override
    public NamespaceResourceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.createParameter.withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}
