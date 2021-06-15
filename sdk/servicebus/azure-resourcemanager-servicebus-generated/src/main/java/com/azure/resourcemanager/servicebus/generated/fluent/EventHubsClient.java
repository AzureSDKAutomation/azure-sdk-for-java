// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicebus.generated.fluent.models.EventhubInner;

/** An instance of this class provides access to all the operations defined in EventHubsClient. */
public interface EventHubsClient {
    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Event Hubs in a service bus Namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventhubInner> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Gets all the Event Hubs in a service bus Namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Event Hubs in a service bus Namespace.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventhubInner> listByNamespace(String resourceGroupName, String namespaceName, Context context);
}
