// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.CapabilityPropertiesInner;

/** An instance of this class provides access to all the operations defined in LocationBasedCapabilitiesClient. */
public interface LocationBasedCapabilitiesClient {
    /**
     * Get capabilities at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capabilities at specified location in a given subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapabilityPropertiesInner> execute(String locationName);

    /**
     * Get capabilities at specified location in a given subscription.
     *
     * @param locationName The name of the location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return capabilities at specified location in a given subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapabilityPropertiesInner> execute(String locationName, Context context);
}
