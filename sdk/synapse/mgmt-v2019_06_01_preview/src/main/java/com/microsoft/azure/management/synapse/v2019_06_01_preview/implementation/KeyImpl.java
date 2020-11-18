/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import com.microsoft.azure.management.synapse.v2019_06_01_preview.Key;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class KeyImpl extends CreatableUpdatableImpl<Key, KeyInner, KeyImpl> implements Key, Key.Definition, Key.Update {
    private final SynapseManager manager;
    private String resourceGroupName;
    private String workspaceName;
    private String keyName;

    KeyImpl(String name, SynapseManager manager) {
        super(name, new KeyInner());
        this.manager = manager;
        // Set resource name
        this.keyName = name;
        //
    }

    KeyImpl(KeyInner inner, SynapseManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.keyName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.workspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "workspaces");
        this.keyName = IdParsingUtils.getValueFromIdByName(inner.id(), "keys");
        //
    }

    @Override
    public SynapseManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Key> createResourceAsync() {
        KeysInner client = this.manager().inner().keys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.keyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Key> updateResourceAsync() {
        KeysInner client = this.manager().inner().keys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.workspaceName, this.keyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<KeyInner> getInnerAsync() {
        KeysInner client = this.manager().inner().keys();
        return client.getAsync(this.resourceGroupName, this.workspaceName, this.keyName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isActiveCMK() {
        return this.inner().isActiveCMK();
    }

    @Override
    public String keyVaultUrl() {
        return this.inner().keyVaultUrl();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public KeyImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    @Override
    public KeyImpl withIsActiveCMK(Boolean isActiveCMK) {
        this.inner().withIsActiveCMK(isActiveCMK);
        return this;
    }

    @Override
    public KeyImpl withKeyVaultUrl(String keyVaultUrl) {
        this.inner().withKeyVaultUrl(keyVaultUrl);
        return this;
    }

}
