/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.logic.v2019_05_01.implementation.WorkflowTriggerHistoriesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkflowTriggerHistories.
 */
public interface WorkflowTriggerHistories extends HasInner<WorkflowTriggerHistoriesInner> {
    /**
     * Resubmits a workflow run based on the trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable resubmitAsync(String resourceGroupName, String workflowName, String triggerName, String historyName);

    /**
     * Gets a workflow trigger history.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @param historyName The workflow trigger history name. Corresponds to the run name for triggers that resulted in a run.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTriggerHistory> getAsync(String resourceGroupName, String workflowName, String triggerName, String historyName);

    /**
     * Gets a list of workflow trigger histories.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkflowTriggerHistory> listAsync(final String resourceGroupName, final String workflowName, final String triggerName);

}
