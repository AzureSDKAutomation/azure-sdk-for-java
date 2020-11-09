/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.MetricAlertsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing MetricAlerts.
 */
public interface MetricAlerts extends SupportsCreating<MetricAlertResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<MetricAlertResource>, SupportsListingByResourceGroup<MetricAlertResource>, SupportsListing<MetricAlertResource>, HasInner<MetricAlertsInner> {
}
