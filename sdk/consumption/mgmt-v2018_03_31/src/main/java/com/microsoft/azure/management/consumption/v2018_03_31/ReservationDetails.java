/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_03_31;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.consumption.v2018_03_31.implementation.ConsumptionManager;
import com.microsoft.azure.management.consumption.v2018_03_31.implementation.ReservationDetailsInner;
import java.math.BigDecimal;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing ReservationDetails.
 */
public interface ReservationDetails extends HasInner<ReservationDetailsInner>, HasManager<ConsumptionManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the instanceId value.
     */
    String instanceId();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the reservationId value.
     */
    String reservationId();

    /**
     * @return the reservationOrderId value.
     */
    String reservationOrderId();

    /**
     * @return the reservedHours value.
     */
    BigDecimal reservedHours();

    /**
     * @return the skuName value.
     */
    String skuName();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the totalReservedQuantity value.
     */
    BigDecimal totalReservedQuantity();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageDate value.
     */
    DateTime usageDate();

    /**
     * @return the usedHours value.
     */
    BigDecimal usedHours();

}
