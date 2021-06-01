// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.fluent.models.AfdDomainInner;
import com.azure.resourcemanager.cdn.generated.models.AfdDomain;
import com.azure.resourcemanager.cdn.generated.models.AfdDomainHttpsParameters;
import com.azure.resourcemanager.cdn.generated.models.AfdDomainUpdateParameters;
import com.azure.resourcemanager.cdn.generated.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.generated.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.generated.models.DomainValidationProperties;
import com.azure.resourcemanager.cdn.generated.models.DomainValidationState;
import com.azure.resourcemanager.cdn.generated.models.ResourceReference;
import com.azure.resourcemanager.cdn.generated.models.ValidationToken;

public final class AfdDomainImpl implements AfdDomain, AfdDomain.Definition, AfdDomain.Update {
    private AfdDomainInner innerObject;

    private final com.azure.resourcemanager.cdn.generated.CdnManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public AfdDomainHttpsParameters tlsSettings() {
        return this.innerModel().tlsSettings();
    }

    public ResourceReference azureDnsZone() {
        return this.innerModel().azureDnsZone();
    }

    public AfdProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public DeploymentStatus deploymentStatus() {
        return this.innerModel().deploymentStatus();
    }

    public DomainValidationState domainValidationState() {
        return this.innerModel().domainValidationState();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public DomainValidationProperties validationProperties() {
        return this.innerModel().validationProperties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AfdDomainInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cdn.generated.CdnManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String profileName;

    private String customDomainName;

    private AfdDomainUpdateParameters updateCustomDomainUpdateProperties;

    public AfdDomainImpl withExistingProfile(String resourceGroupName, String profileName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        return this;
    }

    public AfdDomain create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAfdCustomDomains()
                .create(resourceGroupName, profileName, customDomainName, this.innerModel(), Context.NONE);
        return this;
    }

    public AfdDomain create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAfdCustomDomains()
                .create(resourceGroupName, profileName, customDomainName, this.innerModel(), context);
        return this;
    }

    AfdDomainImpl(String name, com.azure.resourcemanager.cdn.generated.CdnManager serviceManager) {
        this.innerObject = new AfdDomainInner();
        this.serviceManager = serviceManager;
        this.customDomainName = name;
    }

    public AfdDomainImpl update() {
        this.updateCustomDomainUpdateProperties = new AfdDomainUpdateParameters();
        return this;
    }

    public AfdDomain apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAfdCustomDomains()
                .update(
                    resourceGroupName, profileName, customDomainName, updateCustomDomainUpdateProperties, Context.NONE);
        return this;
    }

    public AfdDomain apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAfdCustomDomains()
                .update(resourceGroupName, profileName, customDomainName, updateCustomDomainUpdateProperties, context);
        return this;
    }

    AfdDomainImpl(AfdDomainInner innerObject, com.azure.resourcemanager.cdn.generated.CdnManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.profileName = Utils.getValueFromIdByName(innerObject.id(), "profiles");
        this.customDomainName = Utils.getValueFromIdByName(innerObject.id(), "customDomains");
    }

    public AfdDomain refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAfdCustomDomains()
                .getWithResponse(resourceGroupName, profileName, customDomainName, Context.NONE)
                .getValue();
        return this;
    }

    public AfdDomain refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAfdCustomDomains()
                .getWithResponse(resourceGroupName, profileName, customDomainName, context)
                .getValue();
        return this;
    }

    public ValidationToken refreshValidationToken() {
        return serviceManager
            .afdCustomDomains()
            .refreshValidationToken(resourceGroupName, profileName, customDomainName);
    }

    public ValidationToken refreshValidationToken(Context context) {
        return serviceManager
            .afdCustomDomains()
            .refreshValidationToken(resourceGroupName, profileName, customDomainName, context);
    }

    public AfdDomainImpl withTlsSettings(AfdDomainHttpsParameters tlsSettings) {
        if (isInCreateMode()) {
            this.innerModel().withTlsSettings(tlsSettings);
            return this;
        } else {
            this.updateCustomDomainUpdateProperties.withTlsSettings(tlsSettings);
            return this;
        }
    }

    public AfdDomainImpl withAzureDnsZone(ResourceReference azureDnsZone) {
        if (isInCreateMode()) {
            this.innerModel().withAzureDnsZone(azureDnsZone);
            return this;
        } else {
            this.updateCustomDomainUpdateProperties.withAzureDnsZone(azureDnsZone);
            return this;
        }
    }

    public AfdDomainImpl withHostname(String hostname) {
        this.innerModel().withHostname(hostname);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
