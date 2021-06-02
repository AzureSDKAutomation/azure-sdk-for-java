// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.ApiKVReferenceInner;
import com.azure.resourcemanager.appservice.generated.models.ApiKVReference;
import com.azure.resourcemanager.appservice.generated.models.ConfigReferenceSource;
import com.azure.resourcemanager.appservice.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.appservice.generated.models.ResolveStatus;

public final class ApiKVReferenceImpl implements ApiKVReference {
    private ApiKVReferenceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    ApiKVReferenceImpl(
        ApiKVReferenceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String reference() {
        return this.innerModel().reference();
    }

    public ResolveStatus status() {
        return this.innerModel().status();
    }

    public String vaultName() {
        return this.innerModel().vaultName();
    }

    public String secretName() {
        return this.innerModel().secretName();
    }

    public String secretVersion() {
        return this.innerModel().secretVersion();
    }

    public ManagedServiceIdentity identityType() {
        return this.innerModel().identityType();
    }

    public String details() {
        return this.innerModel().details();
    }

    public ConfigReferenceSource source() {
        return this.innerModel().source();
    }

    public String activeVersion() {
        return this.innerModel().activeVersion();
    }

    public ApiKVReferenceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
