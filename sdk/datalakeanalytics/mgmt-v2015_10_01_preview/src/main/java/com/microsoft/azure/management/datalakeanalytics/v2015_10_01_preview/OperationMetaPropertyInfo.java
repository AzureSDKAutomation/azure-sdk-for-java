/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2015_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OperationMetaPropertyInfo model.
 */
public class OperationMetaPropertyInfo {
    /**
     * The operations OperationMetaServiceSpecification.
     */
    @JsonProperty(value = "serviceSpecification")
    private OperationMetaServiceSpecification serviceSpecification;

    /**
     * Get the operations OperationMetaServiceSpecification.
     *
     * @return the serviceSpecification value
     */
    public OperationMetaServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set the operations OperationMetaServiceSpecification.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the OperationMetaPropertyInfo object itself.
     */
    public OperationMetaPropertyInfo withServiceSpecification(OperationMetaServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

}
