// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.IdentifierInner;
import com.azure.resourcemanager.appservice.generated.models.Identifier;

public final class IdentifierImpl implements Identifier, Identifier.Definition, Identifier.Update {
    private IdentifierInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

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

    public String value() {
        return this.innerModel().value();
    }

    public IdentifierInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String domainOwnershipIdentifierName;

    public IdentifierImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public Identifier create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdateDomainOwnershipIdentifierWithResponse(
                    resourceGroupName, name, domainOwnershipIdentifierName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Identifier create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .createOrUpdateDomainOwnershipIdentifierWithResponse(
                    resourceGroupName, name, domainOwnershipIdentifierName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IdentifierImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new IdentifierInner();
        this.serviceManager = serviceManager;
        this.domainOwnershipIdentifierName = name;
    }

    public IdentifierImpl update() {
        return this;
    }

    public Identifier apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateDomainOwnershipIdentifierWithResponse(
                    resourceGroupName, name, domainOwnershipIdentifierName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Identifier apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .updateDomainOwnershipIdentifierWithResponse(
                    resourceGroupName, name, domainOwnershipIdentifierName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IdentifierImpl(
        IdentifierInner innerObject, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
        this.domainOwnershipIdentifierName = Utils.getValueFromIdByName(innerObject.id(), "domainOwnershipIdentifiers");
    }

    public Identifier refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getDomainOwnershipIdentifierWithResponse(
                    resourceGroupName, name, domainOwnershipIdentifierName, Context.NONE)
                .getValue();
        return this;
    }

    public Identifier refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebApps()
                .getDomainOwnershipIdentifierWithResponse(
                    resourceGroupName, name, domainOwnershipIdentifierName, context)
                .getValue();
        return this;
    }

    public IdentifierImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public IdentifierImpl withValue(String value) {
        this.innerModel().withValue(value);
        return this;
    }
}
