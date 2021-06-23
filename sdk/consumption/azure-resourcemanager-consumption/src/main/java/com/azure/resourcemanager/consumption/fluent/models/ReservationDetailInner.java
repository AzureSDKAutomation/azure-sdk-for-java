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

/** reservation detail resource. */
@JsonFlatten
@Immutable
public class ReservationDetailInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReservationDetailInner.class);

    /*
     * The reservation order ID is the identifier for a reservation purchase.
     * Each reservation order ID represents a single purchase transaction. A
     * reservation order contains reservations. The reservation order specifies
     * the VM size and region for the reservations.
     */
    @JsonProperty(value = "properties.reservationOrderId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationOrderId;

    /*
     * The instance Flexibility Ratio.
     */
    @JsonProperty(value = "properties.instanceFlexibilityRatio", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceFlexibilityRatio;

    /*
     * The instance Flexibility Group.
     */
    @JsonProperty(value = "properties.instanceFlexibilityGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceFlexibilityGroup;

    /*
     * The reservation ID is the identifier of a reservation within a
     * reservation order. Each reservation is the grouping for applying the
     * benefit scope and also specifies the number of instances to which the
     * reservation benefit can be applied to.
     */
    @JsonProperty(value = "properties.reservationId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationId;

    /*
     * This is the ARM Sku name. It can be used to join with the serviceType
     * field in additional info in usage records.
     */
    @JsonProperty(value = "properties.skuName", access = JsonProperty.Access.WRITE_ONLY)
    private String skuName;

    /*
     * This is the total hours reserved for the day. E.g. if reservation for 1
     * instance was made on 1 PM, this will be 11 hours for that day and 24
     * hours from subsequent days.
     */
    @JsonProperty(value = "properties.reservedHours", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal reservedHours;

    /*
     * The date on which consumption occurred.
     */
    @JsonProperty(value = "properties.usageDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime usageDate;

    /*
     * This is the total hours used by the instance.
     */
    @JsonProperty(value = "properties.usedHours", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal usedHours;

    /*
     * This identifier is the name of the resource or the fully qualified
     * Resource ID.
     */
    @JsonProperty(value = "properties.instanceId", access = JsonProperty.Access.WRITE_ONLY)
    private String instanceId;

    /*
     * This is the total count of instances that are reserved for the
     * reservationId.
     */
    @JsonProperty(value = "properties.totalReservedQuantity", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal totalReservedQuantity;

    /*
     * The reservation kind.
     */
    @JsonProperty(value = "properties.kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

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
     * Get the reservationOrderId property: The reservation order ID is the identifier for a reservation purchase. Each
     * reservation order ID represents a single purchase transaction. A reservation order contains reservations. The
     * reservation order specifies the VM size and region for the reservations.
     *
     * @return the reservationOrderId value.
     */
    public String reservationOrderId() {
        return this.reservationOrderId;
    }

    /**
     * Get the instanceFlexibilityRatio property: The instance Flexibility Ratio.
     *
     * @return the instanceFlexibilityRatio value.
     */
    public String instanceFlexibilityRatio() {
        return this.instanceFlexibilityRatio;
    }

    /**
     * Get the instanceFlexibilityGroup property: The instance Flexibility Group.
     *
     * @return the instanceFlexibilityGroup value.
     */
    public String instanceFlexibilityGroup() {
        return this.instanceFlexibilityGroup;
    }

    /**
     * Get the reservationId property: The reservation ID is the identifier of a reservation within a reservation order.
     * Each reservation is the grouping for applying the benefit scope and also specifies the number of instances to
     * which the reservation benefit can be applied to.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the skuName property: This is the ARM Sku name. It can be used to join with the serviceType field in
     * additional info in usage records.
     *
     * @return the skuName value.
     */
    public String skuName() {
        return this.skuName;
    }

    /**
     * Get the reservedHours property: This is the total hours reserved for the day. E.g. if reservation for 1 instance
     * was made on 1 PM, this will be 11 hours for that day and 24 hours from subsequent days.
     *
     * @return the reservedHours value.
     */
    public BigDecimal reservedHours() {
        return this.reservedHours;
    }

    /**
     * Get the usageDate property: The date on which consumption occurred.
     *
     * @return the usageDate value.
     */
    public OffsetDateTime usageDate() {
        return this.usageDate;
    }

    /**
     * Get the usedHours property: This is the total hours used by the instance.
     *
     * @return the usedHours value.
     */
    public BigDecimal usedHours() {
        return this.usedHours;
    }

    /**
     * Get the instanceId property: This identifier is the name of the resource or the fully qualified Resource ID.
     *
     * @return the instanceId value.
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * Get the totalReservedQuantity property: This is the total count of instances that are reserved for the
     * reservationId.
     *
     * @return the totalReservedQuantity value.
     */
    public BigDecimal totalReservedQuantity() {
        return this.totalReservedQuantity;
    }

    /**
     * Get the kind property: The reservation kind.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
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
