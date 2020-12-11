// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.RecoveryServicesProviderInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddRecoveryServicesProviderInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AddRecoveryServicesProviderInputProperties;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryServicesProvider;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.RecoveryServicesProviderProperties;

public final class RecoveryServicesProviderImpl
    implements RecoveryServicesProvider, RecoveryServicesProvider.Definition {
    private RecoveryServicesProviderInner innerObject;

    private final SiteRecoveryManager serviceManager;

    public RecoveryServicesProviderImpl(RecoveryServicesProviderInner innerObject, SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public RecoveryServicesProviderProperties properties() {
        return this.innerModel().properties();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public RecoveryServicesProviderInner innerModel() {
        return this.innerObject;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    private String fabricName;

    private String providerName;

    private AddRecoveryServicesProviderInput createAddProviderInput;

    public RecoveryServicesProviderImpl withExistingReplicationFabric(String fabricName) {
        this.fabricName = fabricName;
        return this;
    }

    public RecoveryServicesProvider create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationRecoveryServicesProviders()
                .create(fabricName, providerName, createAddProviderInput, Context.NONE);
        return this;
    }

    public RecoveryServicesProvider create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationRecoveryServicesProviders()
                .create(fabricName, providerName, createAddProviderInput, context);
        return this;
    }

    public RecoveryServicesProviderImpl(String name, SiteRecoveryManager serviceManager) {
        this.innerObject = new RecoveryServicesProviderInner();
        this.serviceManager = serviceManager;
        this.providerName = name;
        this.createAddProviderInput = new AddRecoveryServicesProviderInput();
    }

    public RecoveryServicesProvider refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationRecoveryServicesProviders()
                .getWithResponse(fabricName, providerName, Context.NONE)
                .getValue();
        return this;
    }

    public RecoveryServicesProvider refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getReplicationRecoveryServicesProviders()
                .getWithResponse(fabricName, providerName, context)
                .getValue();
        return this;
    }

    public RecoveryServicesProviderImpl withProperties(AddRecoveryServicesProviderInputProperties properties) {
        this.createAddProviderInput.withProperties(properties);
        return this;
    }
}
