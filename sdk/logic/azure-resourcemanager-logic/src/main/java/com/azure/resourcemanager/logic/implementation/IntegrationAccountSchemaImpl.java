// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.models.IntegrationAccountSchemaInner;
import com.azure.resourcemanager.logic.models.ContentLink;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;
import com.azure.resourcemanager.logic.models.IntegrationAccountSchema;
import com.azure.resourcemanager.logic.models.SchemaType;
import com.azure.resourcemanager.logic.models.WorkflowTriggerCallbackUrl;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class IntegrationAccountSchemaImpl
    implements IntegrationAccountSchema, IntegrationAccountSchema.Definition, IntegrationAccountSchema.Update {
    private IntegrationAccountSchemaInner innerObject;

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

    public SchemaType schemaType() {
        return this.innerModel().schemaType();
    }

    public String targetNamespace() {
        return this.innerModel().targetNamespace();
    }

    public String documentName() {
        return this.innerModel().documentName();
    }

    public String fileName() {
        return this.innerModel().fileName();
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

    public String content() {
        return this.innerModel().content();
    }

    public String contentType() {
        return this.innerModel().contentType();
    }

    public ContentLink contentLink() {
        return this.innerModel().contentLink();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public IntegrationAccountSchemaInner innerModel() {
        return this.innerObject;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String integrationAccountName;

    private String schemaName;

    public IntegrationAccountSchemaImpl withExistingIntegrationAccount(
        String resourceGroupName, String integrationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.integrationAccountName = integrationAccountName;
        return this;
    }

    public IntegrationAccountSchema create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountSchemas()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, schemaName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountSchema create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountSchemas()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, schemaName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IntegrationAccountSchemaImpl(String name, LogicManager serviceManager) {
        this.innerObject = new IntegrationAccountSchemaInner();
        this.serviceManager = serviceManager;
        this.schemaName = name;
    }

    public IntegrationAccountSchemaImpl update() {
        return this;
    }

    public IntegrationAccountSchema apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountSchemas()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, schemaName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountSchema apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountSchemas()
                .createOrUpdateWithResponse(
                    resourceGroupName, integrationAccountName, schemaName, this.innerModel(), context)
                .getValue();
        return this;
    }

    IntegrationAccountSchemaImpl(IntegrationAccountSchemaInner innerObject, LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.integrationAccountName = Utils.getValueFromIdByName(innerObject.id(), "integrationAccounts");
        this.schemaName = Utils.getValueFromIdByName(innerObject.id(), "schemas");
    }

    public IntegrationAccountSchema refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountSchemas()
                .getWithResponse(resourceGroupName, integrationAccountName, schemaName, Context.NONE)
                .getValue();
        return this;
    }

    public IntegrationAccountSchema refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIntegrationAccountSchemas()
                .getWithResponse(resourceGroupName, integrationAccountName, schemaName, context)
                .getValue();
        return this;
    }

    public WorkflowTriggerCallbackUrl listContentCallbackUrl(GetCallbackUrlParameters listContentCallbackUrl) {
        return serviceManager
            .integrationAccountSchemas()
            .listContentCallbackUrl(resourceGroupName, integrationAccountName, schemaName, listContentCallbackUrl);
    }

    public Response<WorkflowTriggerCallbackUrl> listContentCallbackUrlWithResponse(
        GetCallbackUrlParameters listContentCallbackUrl, Context context) {
        return serviceManager
            .integrationAccountSchemas()
            .listContentCallbackUrlWithResponse(
                resourceGroupName, integrationAccountName, schemaName, listContentCallbackUrl, context);
    }

    public IntegrationAccountSchemaImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IntegrationAccountSchemaImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IntegrationAccountSchemaImpl withSchemaType(SchemaType schemaType) {
        this.innerModel().withSchemaType(schemaType);
        return this;
    }

    public IntegrationAccountSchemaImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public IntegrationAccountSchemaImpl withTargetNamespace(String targetNamespace) {
        this.innerModel().withTargetNamespace(targetNamespace);
        return this;
    }

    public IntegrationAccountSchemaImpl withDocumentName(String documentName) {
        this.innerModel().withDocumentName(documentName);
        return this;
    }

    public IntegrationAccountSchemaImpl withFileName(String fileName) {
        this.innerModel().withFileName(fileName);
        return this;
    }

    public IntegrationAccountSchemaImpl withMetadata(Object metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }

    public IntegrationAccountSchemaImpl withContent(String content) {
        this.innerModel().withContent(content);
        return this;
    }

    public IntegrationAccountSchemaImpl withContentType(String contentType) {
        this.innerModel().withContentType(contentType);
        return this;
    }
}
