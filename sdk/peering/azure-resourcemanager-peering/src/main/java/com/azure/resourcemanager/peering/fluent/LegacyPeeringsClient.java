// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.peering.fluent.models.PeeringInner;
import com.azure.resourcemanager.peering.models.LegacyPeeringsKind;

/** An instance of this class provides access to all the operations defined in LegacyPeeringsClient. */
public interface LegacyPeeringsClient {
    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeeringInner> list(String peeringLocation, LegacyPeeringsKind kind);

    /**
     * Lists all of the legacy peerings under the given subscription matching the specified kind and location.
     *
     * @param peeringLocation The location of the peering.
     * @param kind The kind of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the paginated list of peerings.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PeeringInner> list(String peeringLocation, LegacyPeeringsKind kind, Context context);
}
