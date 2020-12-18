// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountPartnerInner;
import com.azure.resourcemanager.logic.models.IntegrationAccountPartner;
import com.azure.resourcemanager.logic.models.PartnerContent;
import com.azure.resourcemanager.logic.models.PartnerType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class IntegrationAccountPartnerImpl
    implements IntegrationAccountPartner, IntegrationAccountPartner.Definition, IntegrationAccountPartner.Update {
    private IntegrationAccountPartnerInner innerObject;

    private final LogicManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PartnerType partnerType() {
        return this.innerModel().partnerType();
    }

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public OffsetDateTime changedTime() {
        return this.innerModel().changedTime();
    }

    public Object metadata() {
        return this.innerModel().metadata();
    }

    public PartnerContent content() {
        return this.innerModel().content();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public IntegrationAccountPartnerInner innerModel() {
        return this.innerObject;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String integrationAccountName;

    private String partnerName;

    public IntegrationAccountPartnerImpl withExistingIntegrationAccount(
        String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    public IntegrationAccountPartner create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountPartners()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, partnerName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountPartner create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountPartners()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, partnerName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IntegrationAccountPartnerImpl(String name, LogicManager serviceManager) {
        this.innerObject = new IntegrationAccountPartnerInner();
        this.serviceManager = serviceManager;
        this.partnerName = name;
    }

    public IntegrationAccountPartnerImpl update() {
        return this;
    }

    public IntegrationAccountPartner apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountPartners()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, partnerName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountPartner apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountPartners()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, partnerName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IntegrationAccountPartnerImpl(IntegrationAccountPartnerInner innerObject, LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.integrationAccountName = Utils.getValueFromIdByName(innerObject.id(), "integrationAccounts");
        this.partnerName = Utils.getValueFromIdByName(innerObject.id(), "partners");
    }

    public IntegrationAccountPartner refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountPartners()
                .getWithResponse(resourceGroupName, integrationAccountName, partnerName, Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountPartner refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountPartners()
                .getWithResponse(resourceGroupName, integrationAccountName, partnerName, context)
                .getValue();
        return this;
    }

    public IntegrationAccountPartnerImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IntegrationAccountPartnerImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IntegrationAccountPartnerImpl withPartnerType(PartnerType partnerType) {
        this.innerModel().withPartnerType(partnerType);
        return this;
    }

    public IntegrationAccountPartnerImpl withContent(PartnerContent content) {
        this.innerModel().withContent(content);
        return this;
    }

    public IntegrationAccountPartnerImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public IntegrationAccountPartnerImpl withMetadata(Object metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }
}
