/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2020_03_13;

import rx.Observable;
import com.microsoft.azure.management.search.v2020_03_13.implementation.AdminKeysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AdminKeys.
 */
public interface AdminKeys extends HasInner<AdminKeysInner> {
    /**
     * Gets the primary and secondary admin API keys for the specified Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AdminKeyResult> getAsync(String resourceGroupName, String searchServiceName);

    /**
     * Regenerates either the primary or secondary admin API key. You can only regenerate one key at a time.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource group.
     * @param keyKind Specifies which key to regenerate. Valid values include 'primary' and 'secondary'. Possible values include: 'primary', 'secondary'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AdminKeyResult> regenerateAsync(String resourceGroupName, String searchServiceName, AdminKeyKind keyKind);

}
