/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_09_01_preview.implementation;

import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringServicePrefix;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringServicePrefixEvent;
import com.microsoft.azure.management.peering.v2019_09_01_preview.LearnedType;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PrefixValidationState;
import com.microsoft.azure.management.peering.v2019_09_01_preview.ProvisioningState;

class PeeringServicePrefixImpl extends CreatableUpdatableImpl<PeeringServicePrefix, PeeringServicePrefixInner, PeeringServicePrefixImpl> implements PeeringServicePrefix, PeeringServicePrefix.Definition, PeeringServicePrefix.Update {
    private final PeeringManager manager;
    private String resourceGroupName;
    private String peeringServiceName;
    private String prefixName;
    private String cprefix;
    private String uprefix;

    PeeringServicePrefixImpl(String name, PeeringManager manager) {
        super(name, new PeeringServicePrefixInner());
        this.manager = manager;
        // Set resource name
        this.prefixName = name;
        //
    }

    PeeringServicePrefixImpl(PeeringServicePrefixInner inner, PeeringManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.prefixName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.peeringServiceName = IdParsingUtils.getValueFromIdByName(inner.id(), "peeringServices");
        this.prefixName = IdParsingUtils.getValueFromIdByName(inner.id(), "prefixes");
        //
    }

    @Override
    public PeeringManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PeeringServicePrefix> createResourceAsync() {
        PrefixesInner client = this.manager().inner().prefixes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.peeringServiceName, this.prefixName, this.cprefix)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PeeringServicePrefix> updateResourceAsync() {
        PrefixesInner client = this.manager().inner().prefixes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.peeringServiceName, this.prefixName, this.uprefix)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PeeringServicePrefixInner> getInnerAsync() {
        PrefixesInner client = this.manager().inner().prefixes();
        return client.getAsync(this.resourceGroupName, this.peeringServiceName, this.prefixName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String errorMessage() {
        return this.inner().errorMessage();
    }

    @Override
    public List<PeeringServicePrefixEvent> events() {
        return this.inner().events();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public LearnedType learnedType() {
        return this.inner().learnedType();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String prefix() {
        return this.inner().prefix();
    }

    @Override
    public PrefixValidationState prefixValidationState() {
        return this.inner().prefixValidationState();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PeeringServicePrefixImpl withExistingPeeringService(String resourceGroupName, String peeringServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.peeringServiceName = peeringServiceName;
        return this;
    }

    @Override
    public PeeringServicePrefixImpl withPrefix(String prefix) {
        if (isInCreateMode()) {
            this.cprefix = prefix;
        } else {
            this.uprefix = prefix;
        }
        return this;
    }

}
