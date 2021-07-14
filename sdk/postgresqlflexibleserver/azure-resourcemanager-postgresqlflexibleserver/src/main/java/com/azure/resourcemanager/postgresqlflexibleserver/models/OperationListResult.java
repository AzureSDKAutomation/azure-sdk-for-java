// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.OperationListResultInner;
import java.util.List;

/** An immutable client-side representation of OperationListResult. */
public interface OperationListResult {
    /**
     * Gets the value property: Collection of available operation details.
     *
     * @return the value value.
     */
    List<Operation> value();

    /**
     * Gets the nextLink property: URL client should use to fetch the next page (per server side paging). It's null for
     * now, added for future use.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.OperationListResultInner object.
     *
     * @return the inner object.
     */
    OperationListResultInner innerModel();
}
