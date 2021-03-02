// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountAgreementInner;
import com.azure.resourcemanager.logic.models.AgreementContent;
import com.azure.resourcemanager.logic.models.AgreementType;
import com.azure.resourcemanager.logic.models.BusinessIdentity;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;
import com.azure.resourcemanager.logic.models.IntegrationAccountAgreement;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class IntegrationAccountAgreementImpl
    implements IntegrationAccountAgreement, IntegrationAccountAgreement.Definition, IntegrationAccountAgreement.Update {
    private IntegrationAccountAgreementInner innerObject;

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

    public OffsetDateTime createdTime() {
        return this.innerModel().createdTime();
    }

    public OffsetDateTime changedTime() {
        return this.innerModel().changedTime();
    }

    public Object metadata() {
        return this.innerModel().metadata();
    }

    public AgreementType agreementType() {
        return this.innerModel().agreementType();
    }

    public String hostPartner() {
        return this.innerModel().hostPartner();
    }

    public String guestPartner() {
        return this.innerModel().guestPartner();
    }

    public BusinessIdentity hostIdentity() {
        return this.innerModel().hostIdentity();
    }

    public BusinessIdentity guestIdentity() {
        return this.innerModel().guestIdentity();
    }

    public AgreementContent content() {
        return this.innerModel().content();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public IntegrationAccountAgreementInner innerModel() {
        return this.innerObject;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String integrationAccountName;

    private String agreementName;

    public IntegrationAccountAgreementImpl withExistingIntegrationAccount(
        String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    public IntegrationAccountAgreement create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountAgreements()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, agreementName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountAgreement create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountAgreements()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, agreementName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IntegrationAccountAgreementImpl(String name, LogicManager serviceManager) {
        this.innerObject = new IntegrationAccountAgreementInner();
        this.serviceManager = serviceManager;
        this.agreementName = name;
    }

    public IntegrationAccountAgreementImpl update() {
        return this;
    }

    public IntegrationAccountAgreement apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountAgreements()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, agreementName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountAgreement apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountAgreements()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, agreementName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IntegrationAccountAgreementImpl(IntegrationAccountAgreementInner innerObject, LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.integrationAccountName = Utils.getValueFromIdByName(innerObject.id(), "integrationAccounts");
        this.agreementName = Utils.getValueFromIdByName(innerObject.id(), "agreements");
    }

    public IntegrationAccountAgreement refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountAgreements()
                .getWithResponse(resourceGroupName, integrationAccountName, agreementName, Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountAgreement refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountAgreements()
                .getWithResponse(resourceGroupName, integrationAccountName, agreementName, context)
                .getValue();
        return this;
    }

    public WorkflowTriggerCallbackUrl listContentCallbackUrl(GetCallbackUrlParameters listContentCallbackUrl) {
        return serviceManager
            .integrationAccountAgreements()
            .listContentCallbackUrl(resourceGroupName, integrationAccountName, agreementName, listContentCallbackUrl);
    }

    public Response<WorkflowTriggerCallbackUrl> listContentCallbackUrlWithResponse(
        GetCallbackUrlParameters listContentCallbackUrl, Context context) {
        return serviceManager
            .integrationAccountAgreements()
            .listContentCallbackUrlWithResponse(
                resourceGroupName, integrationAccountName, agreementName, listContentCallbackUrl, context);
    }

    public IntegrationAccountAgreementImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IntegrationAccountAgreementImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IntegrationAccountAgreementImpl withAgreementType(AgreementType agreementType) {
        this.innerModel().withAgreementType(agreementType);
        return this;
    }

    public IntegrationAccountAgreementImpl withHostPartner(String hostPartner) {
        this.innerModel().withHostPartner(hostPartner);
        return this;
    }

    public IntegrationAccountAgreementImpl withGuestPartner(String guestPartner) {
        this.innerModel().withGuestPartner(guestPartner);
        return this;
    }

    public IntegrationAccountAgreementImpl withHostIdentity(BusinessIdentity hostIdentity) {
        this.innerModel().withHostIdentity(hostIdentity);
        return this;
    }

    public IntegrationAccountAgreementImpl withGuestIdentity(BusinessIdentity guestIdentity) {
        this.innerModel().withGuestIdentity(guestIdentity);
        return this;
    }

    public IntegrationAccountAgreementImpl withContent(AgreementContent content) {
        this.innerModel().withContent(content);
        return this;
    }

    public IntegrationAccountAgreementImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public IntegrationAccountAgreementImpl withMetadata(Object metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }
}
