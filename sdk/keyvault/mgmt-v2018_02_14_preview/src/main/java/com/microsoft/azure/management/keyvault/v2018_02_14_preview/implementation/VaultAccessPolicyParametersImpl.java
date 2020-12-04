/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14_preview.implementation;

import com.microsoft.azure.management.keyvault.v2018_02_14_preview.VaultAccessPolicyParameters;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.keyvault.v2018_02_14_preview.VaultAccessPolicyProperties;
import java.util.List;
import rx.functions.Func1;

class VaultAccessPolicyParametersImpl extends CreatableUpdatableImpl<VaultAccessPolicyParameters, VaultAccessPolicyParametersInner, VaultAccessPolicyParametersImpl> implements VaultAccessPolicyParameters, VaultAccessPolicyParameters.Update {
    private final KeyVaultManager manager;
    private String resourceGroupName;
    private String vaultName;
    private AccessPolicyUpdateKind operationKind;
    private VaultAccessPolicyProperties uproperties;

    VaultAccessPolicyParametersImpl(String name, KeyVaultManager manager) {
        super(name, new VaultAccessPolicyParametersInner());
        this.manager = manager;
        // Set resource name
        this.operationKind = name;
        //
        this.uproperties = new VaultAccessPolicyProperties();
    }

    VaultAccessPolicyParametersImpl(VaultAccessPolicyParametersInner inner, KeyVaultManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.operationKind = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.vaultName = IdParsingUtils.getValueFromIdByName(inner.id(), "vaults");
        this.operationKind = AccessPolicyUpdateKind.valueOf(IdParsingUtils.getValueFromIdByName(inner.id(), "accessPolicies"));
        //
        this.uproperties = new VaultAccessPolicyProperties();
    }

    @Override
    public KeyVaultManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VaultAccessPolicyParameters> createResourceAsync() {
        VaultsInner client = this.manager().inner().vaults();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<VaultAccessPolicyParameters> updateResourceAsync() {
        VaultsInner client = this.manager().inner().vaults();
        return client.updateAccessPolicyAsync(this.resourceGroupName, this.vaultName, this.operationKind, this.uproperties)
            .map(new Func1<VaultAccessPolicyParametersInner, VaultAccessPolicyParametersInner>() {
               @Override
               public VaultAccessPolicyParametersInner call(VaultAccessPolicyParametersInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VaultAccessPolicyParametersInner> getInnerAsync() {
        VaultsInner client = this.manager().inner().vaults();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.uproperties = new VaultAccessPolicyProperties();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public VaultAccessPolicyProperties properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public VaultAccessPolicyParametersImpl withProperties(VaultAccessPolicyProperties properties) {
        this.uproperties = properties;
        return this;
    }

}
