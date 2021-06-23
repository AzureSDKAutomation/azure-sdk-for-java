// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** A marketplace resource. */
@JsonFlatten
@Immutable
public class MarketplaceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MarketplaceInner.class);

    /*
     * The id of the billing period resource that the usage belongs to.
     */
    @JsonProperty(value = "properties.billingPeriodId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPeriodId;

    /*
     * The start of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageStart;

    /*
     * The end of the date time range covered by the usage detail.
     */
    @JsonProperty(value = "properties.usageEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageEnd;

    /*
     * The marketplace resource rate.
     */
    @JsonProperty(value = "properties.resourceRate", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal resourceRate;

    /*
     * The type of offer.
     */
    @JsonProperty(value = "properties.offerName", access = JsonProperty.Access.WRITE_ONLY)
    private String offerName;

    /*
     * The name of resource group.
     */
    @JsonProperty(value = "properties.resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * Additional information.
     */
    @JsonProperty(value = "properties.additionalInfo", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalInfo;

    /*
     * The order number.
     */
    @JsonProperty(value = "properties.orderNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String orderNumber;

    /*
     * The name of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceName", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceName;

    /*
     * The uri of the resource instance that the usage is about.
     */
    @JsonProperty(value = "properties.instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /*
     * The ISO currency in which the meter is charged, for example, USD.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /*
     * The quantity of usage.
     */
    @JsonProperty(value = "properties.consumedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal consumedQuantity;

    /*
     * The unit of measure.
     */
    @JsonProperty(value = "properties.unitOfMeasure", access = JsonProperty.Access.WRITE_ONLY)
    private String unitOfMeasure;

    /*
     * The amount of cost before tax.
     */
    @JsonProperty(value = "properties.pretaxCost", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal pretaxCost;

    /*
     * The estimated usage is subject to change.
     */
    @JsonProperty(value = "properties.isEstimated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isEstimated;

    /*
     * The meter id (GUID).
     */
    @JsonProperty(value = "properties.meterId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID meterId;

    /*
     * Subscription guid.
     */
    @JsonProperty(value = "properties.subscriptionGuid", access = JsonProperty.Access.WRITE_ONLY)
    private UUID subscriptionGuid;

    /*
     * Subscription name.
     */
    @JsonProperty(value = "properties.subscriptionName", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionName;

    /*
     * Account name.
     */
    @JsonProperty(value = "properties.accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /*
     * Department name.
     */
    @JsonProperty(value = "properties.departmentName", access = JsonProperty.Access.WRITE_ONLY)
    private String departmentName;

    /*
     * Consumed service name.
     */
    @JsonProperty(value = "properties.consumedService", access = JsonProperty.Access.WRITE_ONLY)
    private String consumedService;

    /*
     * The cost center of this department if it is a department and a
     * costcenter exists
     */
    @JsonProperty(value = "properties.costCenter", access = JsonProperty.Access.WRITE_ONLY)
    private String costCenter;

    /*
     * Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand.
     */
    @JsonProperty(value = "properties.additionalProperties", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalProperties;

    /*
     * The name of publisher.
     */
    @JsonProperty(value = "properties.publisherName", access = JsonProperty.Access.WRITE_ONLY)
    private String publisherName;

    /*
     * The name of plan.
     */
    @JsonProperty(value = "properties.planName", access = JsonProperty.Access.WRITE_ONLY)
    private String planName;

    /*
     * Flag indicating whether this is a recurring charge or not.
     */
    @JsonProperty(value = "properties.isRecurringCharge", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isRecurringCharge;

    /*
     * The etag for the resource.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> tags;

    /**
     * Get the billingPeriodId property: The id of the billing period resource that the usage belongs to.
     *
     * @return the billingPeriodId value.
     */
    public String billingPeriodId() {
        return this.billingPeriodId;
    }

    /**
     * Get the usageStart property: The start of the date time range covered by the usage detail.
     *
     * @return the usageStart value.
     */
    public OffsetDateTime usageStart() {
        return this.usageStart;
    }

    /**
     * Get the usageEnd property: The end of the date time range covered by the usage detail.
     *
     * @return the usageEnd value.
     */
    public OffsetDateTime usageEnd() {
        return this.usageEnd;
    }

    /**
     * Get the resourceRate property: The marketplace resource rate.
     *
     * @return the resourceRate value.
     */
    public BigDecimal resourceRate() {
        return this.resourceRate;
    }

    /**
     * Get the offerName property: The type of offer.
     *
     * @return the offerName value.
     */
    public String offerName() {
        return this.offerName;
    }

    /**
     * Get the resourceGroup property: The name of resource group.
     *
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the additionalInfo property: Additional information.
     *
     * @return the additionalInfo value.
     */
    public String additionalInfo() {
        return this.additionalInfo;
    }

    /**
     * Get the orderNumber property: The order number.
     *
     * @return the orderNumber value.
     */
    public String orderNumber() {
        return this.orderNumber;
    }

    /**
     * Get the instanceName property: The name of the resource instance that the usage is about.
     *
     * @return the instanceName value.
     */
    public String instanceName() {
        return this.instanceName;
    }

    /**
     * Get the instanceId property: The uri of the resource instance that the usage is about.
     *
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the currency property: The ISO currency in which the meter is charged, for example, USD.
     *
     * @return the currency value.
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get the consumedQuantity property: The quantity of usage.
     *
     * @return the consumedQuantity value.
     */
    public BigDecimal consumedQuantity() {
        return this.consumedQuantity;
    }

    /**
     * Get the unitOfMeasure property: The unit of measure.
     *
     * @return the unitOfMeasure value.
     */
    public String unitOfMeasure() {
        return this.unitOfMeasure;
    }

    /**
     * Get the pretaxCost property: The amount of cost before tax.
     *
     * @return the pretaxCost value.
     */
    public BigDecimal pretaxCost() {
        return this.pretaxCost;
    }

    /**
     * Get the isEstimated property: The estimated usage is subject to change.
     *
     * @return the isEstimated value.
     */
    public Boolean isEstimated() {
        return this.isEstimated;
    }

    /**
     * Get the meterId property: The meter id (GUID).
     *
     * @return the meterId value.
     */
    public UUID meterId() {
        return this.meterId;
    }

    /**
     * Get the subscriptionGuid property: Subscription guid.
     *
     * @return the subscriptionGuid value.
     */
    public UUID subscriptionGuid() {
        return this.subscriptionGuid;
    }

    /**
     * Get the subscriptionName property: Subscription name.
     *
     * @return the subscriptionName value.
     */
    public String subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * Get the accountName property: Account name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get the departmentName property: Department name.
     *
     * @return the departmentName value.
     */
    public String departmentName() {
        return this.departmentName;
    }

    /**
     * Get the consumedService property: Consumed service name.
     *
     * @return the consumedService value.
     */
    public String consumedService() {
        return this.consumedService;
    }

    /**
     * Get the costCenter property: The cost center of this department if it is a department and a costcenter exists.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Get the additionalProperties property: Additional details of this usage item. By default this is not populated,
     * unless it's specified in $expand.
     *
     * @return the additionalProperties value.
     */
    public String additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Get the publisherName property: The name of publisher.
     *
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.publisherName;
    }

    /**
     * Get the planName property: The name of plan.
     *
     * @return the planName value.
     */
    public String planName() {
        return this.planName;
    }

    /**
     * Get the isRecurringCharge property: Flag indicating whether this is a recurring charge or not.
     *
     * @return the isRecurringCharge value.
     */
    public Boolean isRecurringCharge() {
        return this.isRecurringCharge;
    }

    /**
     * Get the etag property: The etag for the resource.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
