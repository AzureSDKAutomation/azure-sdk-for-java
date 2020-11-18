/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2020-12-01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2020-12-01.implementation.DataMaskingRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing DataMaskingRules.
 */
public interface DataMaskingRules extends SupportsCreating<DataMaskingRule.DefinitionStages.Blank>, HasInner<DataMaskingRulesInner> {
    /**
     * Gets a list of Sql pool data masking rules.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DataMaskingRule> listBySqlPoolAsync(String resourceGroupName, String workspaceName, String sqlPoolName);

}
