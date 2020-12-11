// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.resourcemanager.consumption.fluent.models.BudgetInner;
import java.math.BigDecimal;
import java.util.Map;

/** An immutable client-side representation of Budget. */
public interface Budget {
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
     * Gets the category property: The category of the budget, whether the budget tracks cost or usage.
     *
     * @return the category value.
     */
    CategoryType category();

    /**
     * Gets the amount property: The total amount of cost to track with the budget.
     *
     * @return the amount value.
     */
    BigDecimal amount();

    /**
     * Gets the timeGrain property: The time covered by a budget. Tracking of the amount will be reset based on the time
     * grain. BillingMonth, BillingQuarter, and BillingAnnual are only supported by WD customers.
     *
     * @return the timeGrain value.
     */
    TimeGrainType timeGrain();

    /**
     * Gets the timePeriod property: Has start and end date of the budget. The start date must be first of the month and
     * should be less than the end date. Budget start date must be on or after June 1, 2017. Future start date should
     * not be more than twelve months. Past start date should be selected within the timegrain period. There are no
     * restrictions on the end date.
     *
     * @return the timePeriod value.
     */
    BudgetTimePeriod timePeriod();

    /**
     * Gets the filter property: May be used to filter budgets by resource group, resource, or meter.
     *
     * @return the filter value.
     */
    BudgetFilter filter();

    /**
     * Gets the currentSpend property: The current amount of cost which is being tracked for a budget.
     *
     * @return the currentSpend value.
     */
    CurrentSpend currentSpend();

    /**
     * Gets the notifications property: Dictionary of notifications associated with the budget. Budget can have up to
     * five notifications.
     *
     * @return the notifications value.
     */
    Map<String, Notification> notifications();

    /**
     * Gets the etag property: eTag of the resource. To handle concurrent update scenario, this field will be used to
     * determine whether the user is updating the latest version or not.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.fluent.models.BudgetInner object.
     *
     * @return the inner object.
     */
    BudgetInner innerModel();
}
