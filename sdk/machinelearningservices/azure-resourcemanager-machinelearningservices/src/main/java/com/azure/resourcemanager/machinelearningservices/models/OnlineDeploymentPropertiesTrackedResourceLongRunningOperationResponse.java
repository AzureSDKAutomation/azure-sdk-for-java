// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.OnlineDeploymentPropertiesTrackedResourceLongRunningOperationResponseInner;

/** An immutable client-side representation of OnlineDeploymentPropertiesTrackedResourceLongRunningOperationResponse. */
public interface OnlineDeploymentPropertiesTrackedResourceLongRunningOperationResponse {
    /**
     * Gets the completionResult property: The completionResult property.
     *
     * @return the completionResult value.
     */
    OnlineDeploymentPropertiesTrackedResource completionResult();

    /**
     * Gets the location property: The location property.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the inner
     * com.azure.resourcemanager.machinelearningservices.fluent.models.OnlineDeploymentPropertiesTrackedResourceLongRunningOperationResponseInner
     * object.
     *
     * @return the inner object.
     */
    OnlineDeploymentPropertiesTrackedResourceLongRunningOperationResponseInner innerModel();
}
