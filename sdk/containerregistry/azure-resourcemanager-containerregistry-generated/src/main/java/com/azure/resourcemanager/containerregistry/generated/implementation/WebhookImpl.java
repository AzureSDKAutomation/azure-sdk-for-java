// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.WebhookInner;
import com.azure.resourcemanager.containerregistry.generated.models.CallbackConfig;
import com.azure.resourcemanager.containerregistry.generated.models.Event;
import com.azure.resourcemanager.containerregistry.generated.models.EventInfo;
import com.azure.resourcemanager.containerregistry.generated.models.ProvisioningState;
import com.azure.resourcemanager.containerregistry.generated.models.Webhook;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookAction;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookCreateParameters;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookStatus;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookUpdateParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class WebhookImpl implements Webhook, Webhook.Definition, Webhook.Update {
    private WebhookInner innerObject;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

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

    public WebhookStatus status() {
        return this.innerModel().status();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public List<WebhookAction> actions() {
        List<WebhookAction> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public WebhookInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String registryName;

    private String webhookName;

    private WebhookCreateParameters createWebhookCreateParameters;

    private WebhookUpdateParameters updateWebhookUpdateParameters;

    public WebhookImpl withExistingRegistry(String resourceGroupName, String registryName) {
        this.resourceGroupName = resourceGroupName;
        this.registryName = registryName;
        return this;
    }

    public Webhook create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .create(resourceGroupName, registryName, webhookName, createWebhookCreateParameters, Context.NONE);
        return this;
    }

    public Webhook create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .create(resourceGroupName, registryName, webhookName, createWebhookCreateParameters, context);
        return this;
    }

    WebhookImpl(
        String name, com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = new WebhookInner();
        this.serviceManager = serviceManager;
        this.webhookName = name;
        this.createWebhookCreateParameters = new WebhookCreateParameters();
    }

    public WebhookImpl update() {
        this.updateWebhookUpdateParameters = new WebhookUpdateParameters();
        return this;
    }

    public Webhook apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .update(resourceGroupName, registryName, webhookName, updateWebhookUpdateParameters, Context.NONE);
        return this;
    }

    public Webhook apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .update(resourceGroupName, registryName, webhookName, updateWebhookUpdateParameters, context);
        return this;
    }

    WebhookImpl(
        WebhookInner innerObject,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.registryName = Utils.getValueFromIdByName(innerObject.id(), "registries");
        this.webhookName = Utils.getValueFromIdByName(innerObject.id(), "webhooks");
    }

    public Webhook refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .getWithResponse(resourceGroupName, registryName, webhookName, Context.NONE)
                .getValue();
        return this;
    }

    public Webhook refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getWebhooks()
                .getWithResponse(resourceGroupName, registryName, webhookName, context)
                .getValue();
        return this;
    }

    public EventInfo ping() {
        return serviceManager.webhooks().ping(resourceGroupName, registryName, webhookName);
    }

    public Response<EventInfo> pingWithResponse(Context context) {
        return serviceManager.webhooks().pingWithResponse(resourceGroupName, registryName, webhookName, context);
    }

    public CallbackConfig getCallbackConfig() {
        return serviceManager.webhooks().getCallbackConfig(resourceGroupName, registryName, webhookName);
    }

    public Response<CallbackConfig> getCallbackConfigWithResponse(Context context) {
        return serviceManager
            .webhooks()
            .getCallbackConfigWithResponse(resourceGroupName, registryName, webhookName, context);
    }

    public PagedIterable<Event> listEvents() {
        return serviceManager.webhooks().listEvents(resourceGroupName, registryName, webhookName);
    }

    public PagedIterable<Event> listEvents(Context context) {
        return serviceManager.webhooks().listEvents(resourceGroupName, registryName, webhookName, context);
    }

    public WebhookImpl withRegion(Region location) {
        this.createWebhookCreateParameters.withLocation(location.toString());
        return this;
    }

    public WebhookImpl withRegion(String location) {
        this.createWebhookCreateParameters.withLocation(location);
        return this;
    }

    public WebhookImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.createWebhookCreateParameters.withTags(tags);
            return this;
        } else {
            this.updateWebhookUpdateParameters.withTags(tags);
            return this;
        }
    }

    public WebhookImpl withServiceUri(String serviceUri) {
        if (isInCreateMode()) {
            this.createWebhookCreateParameters.withServiceUri(serviceUri);
            return this;
        } else {
            this.updateWebhookUpdateParameters.withServiceUri(serviceUri);
            return this;
        }
    }

    public WebhookImpl withCustomHeaders(Map<String, String> customHeaders) {
        if (isInCreateMode()) {
            this.createWebhookCreateParameters.withCustomHeaders(customHeaders);
            return this;
        } else {
            this.updateWebhookUpdateParameters.withCustomHeaders(customHeaders);
            return this;
        }
    }

    public WebhookImpl withStatus(WebhookStatus status) {
        if (isInCreateMode()) {
            this.createWebhookCreateParameters.withStatus(status);
            return this;
        } else {
            this.updateWebhookUpdateParameters.withStatus(status);
            return this;
        }
    }

    public WebhookImpl withScope(String scope) {
        if (isInCreateMode()) {
            this.createWebhookCreateParameters.withScope(scope);
            return this;
        } else {
            this.updateWebhookUpdateParameters.withScope(scope);
            return this;
        }
    }

    public WebhookImpl withActions(List<WebhookAction> actions) {
        if (isInCreateMode()) {
            this.createWebhookCreateParameters.withActions(actions);
            return this;
        } else {
            this.updateWebhookUpdateParameters.withActions(actions);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
