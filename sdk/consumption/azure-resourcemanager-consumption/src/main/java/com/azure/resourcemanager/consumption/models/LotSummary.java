// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.resourcemanager.consumption.fluent.models.LotSummaryInner;
import java.util.Map;

/** An immutable client-side representation of LotSummary. */
public interface LotSummary {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the originalAmount property: Original amount.
     *
     * @return the originalAmount value.
     */
    Amount originalAmount();

    /**
     * Gets the closedBalance property: Closed balance.
     *
     * @return the closedBalance value.
     */
    Amount closedBalance();

    /**
     * Gets the source property: Lot source.
     *
     * @return the source value.
     */
    LotSource source();

    /**
     * Gets the startDate property: Start date.
     *
     * @return the startDate value.
     */
    String startDate();

    /**
     * Gets the expirationDate property: Expiration date.
     *
     * @return the expirationDate value.
     */
    String expirationDate();

    /**
     * Gets the poNumber property: PO number.
     *
     * @return the poNumber value.
     */
    String poNumber();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.fluent.models.LotSummaryInner object.
     *
     * @return the inner object.
     */
    LotSummaryInner innerModel();
}
