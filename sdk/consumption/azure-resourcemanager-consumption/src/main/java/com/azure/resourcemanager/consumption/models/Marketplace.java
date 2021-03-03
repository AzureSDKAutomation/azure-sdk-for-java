// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.models;

import com.azure.resourcemanager.consumption.fluent.models.MarketplaceInner;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** An immutable client-side representation of Marketplace. */
public interface Marketplace {
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
     * Gets the billingPeriodId property: The id of the billing period resource that the usage belongs to.
     *
     * @return the billingPeriodId value.
     */
    String billingPeriodId();

    /**
     * Gets the usageStart property: The start of the date time range covered by the usage detail.
     *
     * @return the usageStart value.
     */
    OffsetDateTime usageStart();

    /**
     * Gets the usageEnd property: The end of the date time range covered by the usage detail.
     *
     * @return the usageEnd value.
     */
    OffsetDateTime usageEnd();

    /**
     * Gets the resourceRate property: The marketplace resource rate.
     *
     * @return the resourceRate value.
     */
    BigDecimal resourceRate();

    /**
     * Gets the offerName property: The type of offer.
     *
     * @return the offerName value.
     */
    String offerName();

    /**
     * Gets the resourceGroup property: The name of resource group.
     *
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * Gets the orderNumber property: The order number.
     *
     * @return the orderNumber value.
     */
    String orderNumber();

    /**
     * Gets the instanceName property: The name of the resource instance that the usage is about.
     *
     * @return the instanceName value.
     */
    String instanceName();

    /**
     * Gets the instanceId property: The uri of the resource instance that the usage is about.
     *
     * @return the instanceId value.
     */
    String instanceId();

    /**
     * Gets the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    String currency();

    /**
     * Gets the consumedQuantity property: The quantity of usage.
     *
     * @return the consumedQuantity value.
     */
    BigDecimal consumedQuantity();

    /**
     * Gets the unitOfMeasure property: The unit of measure.
     *
     * @return the unitOfMeasure value.
     */
    String unitOfMeasure();

    /**
     * Gets the pretaxCost property: The amount of cost before tax.
     *
     * @return the pretaxCost value.
     */
    BigDecimal pretaxCost();

    /**
     * Gets the isEstimated property: The estimated usage is subject to change.
     *
     * @return the isEstimated value.
     */
    Boolean isEstimated();

    /**
     * Gets the meterId property: The meter id (GUID).
     *
     * @return the meterId value.
     */
    UUID meterId();

    /**
     * Gets the subscriptionGuid property: Subscription guid.
     *
     * @return the subscriptionGuid value.
     */
    UUID subscriptionGuid();

    /**
     * Gets the subscriptionName property: Subscription name.
     *
     * @return the subscriptionName value.
     */
    String subscriptionName();

    /**
     * Gets the accountName property: Account name.
     *
     * @return the accountName value.
     */
    String accountName();

    /**
     * Gets the departmentName property: Department name.
     *
     * @return the departmentName value.
     */
    String departmentName();

    /**
     * Gets the consumedService property: Consumed service name.
     *
     * @return the consumedService value.
     */
    String consumedService();

    /**
     * Gets the costCenter property: The cost center of this department if it is a department and a costcenter exists.
     *
     * @return the costCenter value.
     */
    String costCenter();

    /**
     * Gets the additionalProperties property: Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand.
     *
     * @return the additionalProperties value.
     */
    String additionalProperties();

    /**
     * Gets the publisherName property: The name of publisher.
     *
     * @return the publisherName value.
     */
    String publisherName();

    /**
     * Gets the planName property: The name of plan.
     *
     * @return the planName value.
     */
    String planName();

    /**
     * Gets the isRecurringCharge property: Flag indicating whether this is a recurring charge or not.
     *
     * @return the isRecurringCharge value.
     */
    Boolean isRecurringCharge();

    /**
     * Gets the etag property: Resource etag.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the inner com.azure.resourcemanager.consumption.fluent.models.MarketplaceInner object.
     *
     * @return the inner object.
     */
    MarketplaceInner innerModel();
}
