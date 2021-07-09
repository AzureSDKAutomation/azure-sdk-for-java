// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.DiagnoseResponseResultInner;

/** An immutable client-side representation of DiagnoseResponseResult. */
public interface DiagnoseResponseResult {
    /**
     * Gets the value property: Value of DiagnoseResponse.
     *
     * @return the value value.
     */
    DiagnoseResponseResultValue value();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.DiagnoseResponseResultInner
     * object.
     *
     * @return the inner object.
     */
    DiagnoseResponseResultInner innerModel();
}
