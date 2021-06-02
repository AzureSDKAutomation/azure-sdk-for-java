// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.StaticSiteCustomDomainOverviewArmResourceInner;
import com.azure.resourcemanager.appservice.generated.models.CustomDomainStatus;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteCustomDomainOverviewArmResource;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteCustomDomainRequestPropertiesArmResource;
import java.time.OffsetDateTime;

public final class StaticSiteCustomDomainOverviewArmResourceImpl
    implements StaticSiteCustomDomainOverviewArmResource,
        StaticSiteCustomDomainOverviewArmResource.Definition,
        StaticSiteCustomDomainOverviewArmResource.Update {
    private StaticSiteCustomDomainOverviewArmResourceInner innerObject;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String domainName() {
        return this.innerModel().domainName();
    }

    public OffsetDateTime createdOn() {
        return this.innerModel().createdOn();
    }

    public CustomDomainStatus status() {
        return this.innerModel().status();
    }

    public String validationToken() {
        return this.innerModel().validationToken();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public StaticSiteCustomDomainOverviewArmResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String domainName;

    private StaticSiteCustomDomainRequestPropertiesArmResource createStaticSiteCustomDomainRequestPropertiesEnvelope;

    private StaticSiteCustomDomainRequestPropertiesArmResource updateStaticSiteCustomDomainRequestPropertiesEnvelope;

    public StaticSiteCustomDomainOverviewArmResourceImpl withExistingStaticSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    public StaticSiteCustomDomainOverviewArmResource create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateStaticSiteCustomDomain(
                    resourceGroupName,
                    name,
                    domainName,
                    createStaticSiteCustomDomainRequestPropertiesEnvelope,
                    Context.NONE);
        return this;
    }

    public StaticSiteCustomDomainOverviewArmResource create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateStaticSiteCustomDomain(
                    resourceGroupName,
                    name,
                    domainName,
                    createStaticSiteCustomDomainRequestPropertiesEnvelope,
                    context);
        return this;
    }

    StaticSiteCustomDomainOverviewArmResourceImpl(
        String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new StaticSiteCustomDomainOverviewArmResourceInner();
        this.serviceManager = serviceManager;
        this.domainName = name;
        this.createStaticSiteCustomDomainRequestPropertiesEnvelope =
            new StaticSiteCustomDomainRequestPropertiesArmResource();
    }

    public StaticSiteCustomDomainOverviewArmResourceImpl update() {
        this.updateStaticSiteCustomDomainRequestPropertiesEnvelope =
            new StaticSiteCustomDomainRequestPropertiesArmResource();
        return this;
    }

    public StaticSiteCustomDomainOverviewArmResource apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateStaticSiteCustomDomain(
                    resourceGroupName,
                    name,
                    domainName,
                    updateStaticSiteCustomDomainRequestPropertiesEnvelope,
                    Context.NONE);
        return this;
    }

    public StaticSiteCustomDomainOverviewArmResource apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateStaticSiteCustomDomain(
                    resourceGroupName,
                    name,
                    domainName,
                    updateStaticSiteCustomDomainRequestPropertiesEnvelope,
                    context);
        return this;
    }

    StaticSiteCustomDomainOverviewArmResourceImpl(
        StaticSiteCustomDomainOverviewArmResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "staticSites");
        this.domainName = Utils.getValueFromIdByName(innerObject.id(), "customDomains");
    }

    public StaticSiteCustomDomainOverviewArmResource refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getStaticSiteCustomDomainWithResponse(resourceGroupName, name, domainName, Context.NONE)
                .getValue();
        return this;
    }

    public StaticSiteCustomDomainOverviewArmResource refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getStaticSiteCustomDomainWithResponse(resourceGroupName, name, domainName, context)
                .getValue();
        return this;
    }

    public void validateCustomDomainCanBeAddedToStaticSite(
        StaticSiteCustomDomainRequestPropertiesArmResource staticSiteCustomDomainRequestPropertiesEnvelope) {
        serviceManager
            .staticSites()
            .validateCustomDomainCanBeAddedToStaticSite(
                resourceGroupName, name, domainName, staticSiteCustomDomainRequestPropertiesEnvelope);
    }

    public void validateCustomDomainCanBeAddedToStaticSite(
        StaticSiteCustomDomainRequestPropertiesArmResource staticSiteCustomDomainRequestPropertiesEnvelope,
        Context context) {
        serviceManager
            .staticSites()
            .validateCustomDomainCanBeAddedToStaticSite(
                resourceGroupName, name, domainName, staticSiteCustomDomainRequestPropertiesEnvelope, context);
    }

    public StaticSiteCustomDomainOverviewArmResourceImpl withKind(String kind) {
        if (isInCreateMode()) {
            this.createStaticSiteCustomDomainRequestPropertiesEnvelope.withKind(kind);
            return this;
        } else {
            this.updateStaticSiteCustomDomainRequestPropertiesEnvelope.withKind(kind);
            return this;
        }
    }

    public StaticSiteCustomDomainOverviewArmResourceImpl withValidationMethod(String validationMethod) {
        if (isInCreateMode()) {
            this.createStaticSiteCustomDomainRequestPropertiesEnvelope.withValidationMethod(validationMethod);
            return this;
        } else {
            this.updateStaticSiteCustomDomainRequestPropertiesEnvelope.withValidationMethod(validationMethod);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
