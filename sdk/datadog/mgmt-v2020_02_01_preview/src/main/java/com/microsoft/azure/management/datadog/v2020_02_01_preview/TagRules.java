/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.TagRulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TagRules.
 */
public interface TagRules extends SupportsCreating<MonitoringTagRules.DefinitionStages.Blank>, HasInner<TagRulesInner> {
    /**
     * Get a tag rule set for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @param ruleSetName Rule set name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MonitoringTagRules> getAsync(String resourceGroupName, String monitorName, String ruleSetName);

    /**
     * List the tag rules for a given monitor resource.
     *
     * @param resourceGroupName The name of the resource group to which the Datadog resource belongs.
     * @param monitorName Monitor resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<MonitoringTagRules> listAsync(final String resourceGroupName, final String monitorName);

}
