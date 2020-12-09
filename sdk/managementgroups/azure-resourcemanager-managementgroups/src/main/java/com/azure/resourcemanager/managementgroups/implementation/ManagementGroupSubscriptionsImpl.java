// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managementgroups.ManagementGroupsManager;
import com.azure.resourcemanager.managementgroups.fluent.ManagementGroupSubscriptionsClient;
import com.azure.resourcemanager.managementgroups.fluent.models.SubscriptionUnderManagementGroupInner;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupSubscriptions;
import com.azure.resourcemanager.managementgroups.models.SubscriptionUnderManagementGroup;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagementGroupSubscriptionsImpl implements ManagementGroupSubscriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementGroupSubscriptionsImpl.class);

    private final ManagementGroupSubscriptionsClient innerClient;

    private final ManagementGroupsManager serviceManager;

    public ManagementGroupSubscriptionsImpl(
        ManagementGroupSubscriptionsClient innerClient, ManagementGroupsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public SubscriptionUnderManagementGroup create(String groupId, String subscriptionId) {
        SubscriptionUnderManagementGroupInner inner = this.serviceClient().create(groupId, subscriptionId);
        if (inner != null) {
            return new SubscriptionUnderManagementGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SubscriptionUnderManagementGroup> createWithResponse(
        String groupId, String subscriptionId, String cacheControl, Context context) {
        Response<SubscriptionUnderManagementGroupInner> inner =
            this.serviceClient().createWithResponse(groupId, subscriptionId, cacheControl, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionUnderManagementGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String groupId, String subscriptionId) {
        this.serviceClient().delete(groupId, subscriptionId);
    }

    public Response<Void> deleteWithResponse(
        String groupId, String subscriptionId, String cacheControl, Context context) {
        return this.serviceClient().deleteWithResponse(groupId, subscriptionId, cacheControl, context);
    }

    public SubscriptionUnderManagementGroup getSubscription(String groupId, String subscriptionId) {
        SubscriptionUnderManagementGroupInner inner = this.serviceClient().getSubscription(groupId, subscriptionId);
        if (inner != null) {
            return new SubscriptionUnderManagementGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SubscriptionUnderManagementGroup> getSubscriptionWithResponse(
        String groupId, String subscriptionId, String cacheControl, Context context) {
        Response<SubscriptionUnderManagementGroupInner> inner =
            this.serviceClient().getSubscriptionWithResponse(groupId, subscriptionId, cacheControl, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionUnderManagementGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SubscriptionUnderManagementGroup> getSubscriptionsUnderManagementGroup(String groupId) {
        PagedIterable<SubscriptionUnderManagementGroupInner> inner =
            this.serviceClient().getSubscriptionsUnderManagementGroup(groupId);
        return inner.mapPage(inner1 -> new SubscriptionUnderManagementGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<SubscriptionUnderManagementGroup> getSubscriptionsUnderManagementGroup(
        String groupId, Context context) {
        PagedIterable<SubscriptionUnderManagementGroupInner> inner =
            this.serviceClient().getSubscriptionsUnderManagementGroup(groupId, context);
        return inner.mapPage(inner1 -> new SubscriptionUnderManagementGroupImpl(inner1, this.manager()));
    }

    private ManagementGroupSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private ManagementGroupsManager manager() {
        return this.serviceManager;
    }
}
