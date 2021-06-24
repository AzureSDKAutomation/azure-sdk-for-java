// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.resourcemanager.resources.generated.fluent.models.ProviderResourceTypeListResultInner;
import java.util.List;

/** An immutable client-side representation of ProviderResourceTypeListResult. */
public interface ProviderResourceTypeListResult {
    /**
     * Gets the value property: An array of resource types.
     *
     * @return the value value.
     */
    List<ProviderResourceType> value();

    /**
     * Gets the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.resources.generated.fluent.models.ProviderResourceTypeListResultInner
     * object.
     *
     * @return the inner object.
     */
    ProviderResourceTypeListResultInner innerModel();
}
