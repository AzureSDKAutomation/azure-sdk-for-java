/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateLinkHub;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.PrivateEndpointConnectionForPrivateLinkHubBasic;

class PrivateLinkHubImpl extends GroupableResourceCoreImpl<PrivateLinkHub, PrivateLinkHubInner, PrivateLinkHubImpl, SynapseManager> implements PrivateLinkHub, PrivateLinkHub.Definition, PrivateLinkHub.Update {
    PrivateLinkHubImpl(String name, PrivateLinkHubInner inner, SynapseManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PrivateLinkHub> createResourceAsync() {
        PrivateLinkHubsInner client = this.manager().inner().privateLinkHubs();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PrivateLinkHub> updateResourceAsync() {
        PrivateLinkHubsInner client = this.manager().inner().privateLinkHubs();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PrivateLinkHubInner> getInnerAsync() {
        PrivateLinkHubsInner client = this.manager().inner().privateLinkHubs();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<PrivateEndpointConnectionForPrivateLinkHubBasic> privateEndpointConnections() {
        return this.inner().privateEndpointConnections();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

}
