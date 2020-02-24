/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_12_12;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.UsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.cosmosdb.v2019_12_12.implementation.CosmosDBManager;

/**
 * Type representing CollectionDatabasisDatabaseAccountUsage.
 */
public interface CollectionDatabasisDatabaseAccountUsage extends HasInner<UsageInner>, HasManager<CosmosDBManager> {
    /**
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * @return the limit value.
     */
    Long limit();

    /**
     * @return the name value.
     */
    MetricName name();

    /**
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * @return the unit value.
     */
    UnitType unit();

}
