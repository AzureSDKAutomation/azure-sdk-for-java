/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2018-11-30.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.managedserviceidentity.v2018-11-30.Identity;
import rx.Observable;
import com.microsoft.azure.management.managedserviceidentity.v2018-11-30.IdentityPatch;
import java.util.UUID;
import rx.functions.Func1;

class IdentityImpl extends GroupableResourceCoreImpl<Identity, IdentityInner, IdentityImpl, ManagedIdentityManager> implements Identity, Identity.Definition, Identity.Update {
    private IdentityPatch updateParameter;
    IdentityImpl(String name, IdentityInner inner, ManagedIdentityManager manager) {
        super(name, inner, manager);
        this.updateParameter = new IdentityPatch();
    }

    @Override
    public Observable<Identity> createResourceAsync() {
        UserAssignedIdentitiesInner client = this.manager().inner().userAssignedIdentities();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<IdentityInner, IdentityInner>() {
               @Override
               public IdentityInner call(IdentityInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Identity> updateResourceAsync() {
        UserAssignedIdentitiesInner client = this.manager().inner().userAssignedIdentities();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<IdentityInner, IdentityInner>() {
               @Override
               public IdentityInner call(IdentityInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IdentityInner> getInnerAsync() {
        UserAssignedIdentitiesInner client = this.manager().inner().userAssignedIdentities();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new IdentityPatch();
    }

    @Override
    public UUID clientId() {
        return this.inner().clientId();
    }

    @Override
    public UUID principalId() {
        return this.inner().principalId();
    }

    @Override
    public UUID tenantId() {
        return this.inner().tenantId();
    }

}
