/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.Identity;
import rx.Observable;
import java.util.UUID;

class IdentityImpl extends GroupableResourceCoreImpl<Identity, IdentityInner, IdentityImpl, ManagedIdentityManager> implements Identity, Identity.Definition, Identity.Update {
    IdentityImpl(String name, IdentityInner inner, ManagedIdentityManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<Identity> createResourceAsync() {
        UserAssignedIdentitiesInner client = this.manager().inner().userAssignedIdentities();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Identity> updateResourceAsync() {
        UserAssignedIdentitiesInner client = this.manager().inner().userAssignedIdentities();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.inner())
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


    @Override
    public UUID clientId() {
        return this.inner().clientId();
    }

    @Override
    public String clientSecretUrl() {
        return this.inner().clientSecretUrl();
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
