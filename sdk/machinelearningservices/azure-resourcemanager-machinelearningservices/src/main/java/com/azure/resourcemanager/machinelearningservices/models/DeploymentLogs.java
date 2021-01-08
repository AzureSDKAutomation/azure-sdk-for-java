// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.DeploymentLogsInner;

/** An immutable client-side representation of DeploymentLogs. */
public interface DeploymentLogs {
    /**
     * Gets the content property: The content property.
     *
     * @return the content value.
     */
    String content();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.DeploymentLogsInner object.
     *
     * @return the inner object.
     */
    DeploymentLogsInner innerModel();
}
