/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03_01;

import rx.Observable;
import com.microsoft.azure.management.monitor.v2018_03_01.implementation.MetricAlertsStatusInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing MetricAlertsStatus.
 */
public interface MetricAlertsStatus extends HasInner<MetricAlertsStatusInner> {
    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MetricAlertStatusCollection> listAsync(String resourceGroupName, String ruleName);

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MetricAlertStatusCollection> listByNameAsync(String resourceGroupName, String ruleName, String statusName);

}
