// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cdn.generated.fluent.models.ResourceUsageInner;

/** An instance of this class provides access to all the operations defined in ResourceUsagesClient. */
public interface ResourceUsagesClient {
    /**
     * Check the quota and actual usage of the CDN profiles under the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check resource usage API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceUsageInner> list();

    /**
     * Check the quota and actual usage of the CDN profiles under the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check resource usage API.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ResourceUsageInner> list(Context context);
}
