// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicebus.generated.fluent.SubscriptionsClient;
import com.azure.resourcemanager.servicebus.generated.fluent.models.SBSubscriptionInner;
import com.azure.resourcemanager.servicebus.generated.models.SBSubscription;
import com.azure.resourcemanager.servicebus.generated.models.Subscriptions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SubscriptionsImpl implements Subscriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubscriptionsImpl.class);

    private final SubscriptionsClient innerClient;

    private final com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager;

    public SubscriptionsImpl(
        SubscriptionsClient innerClient,
        com.azure.resourcemanager.servicebus.generated.ServiceBusManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SBSubscription> listByTopic(String resourceGroupName, String namespaceName, String topicName) {
        PagedIterable<SBSubscriptionInner> inner =
            this.serviceClient().listByTopic(resourceGroupName, namespaceName, topicName);
        return Utils.mapPage(inner, inner1 -> new SBSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<SBSubscription> listByTopic(
        String resourceGroupName, String namespaceName, String topicName, Integer skip, Integer top, Context context) {
        PagedIterable<SBSubscriptionInner> inner =
            this.serviceClient().listByTopic(resourceGroupName, namespaceName, topicName, skip, top, context);
        return Utils.mapPage(inner, inner1 -> new SBSubscriptionImpl(inner1, this.manager()));
    }

    public SBSubscription createOrUpdate(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        SBSubscriptionInner parameters) {
        SBSubscriptionInner inner =
            this
                .serviceClient()
                .createOrUpdate(resourceGroupName, namespaceName, topicName, subscriptionName, parameters);
        if (inner != null) {
            return new SBSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SBSubscription> createOrUpdateWithResponse(
        String resourceGroupName,
        String namespaceName,
        String topicName,
        String subscriptionName,
        SBSubscriptionInner parameters,
        Context context) {
        Response<SBSubscriptionInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName, namespaceName, topicName, subscriptionName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SBSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String namespaceName, String topicName, String subscriptionName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, topicName, subscriptionName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, context);
    }

    public SBSubscription get(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName) {
        SBSubscriptionInner inner =
            this.serviceClient().get(resourceGroupName, namespaceName, topicName, subscriptionName);
        if (inner != null) {
            return new SBSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SBSubscription> getWithResponse(
        String resourceGroupName, String namespaceName, String topicName, String subscriptionName, Context context) {
        Response<SBSubscriptionInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, namespaceName, topicName, subscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SBSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicebus.generated.ServiceBusManager manager() {
        return this.serviceManager;
    }
}
