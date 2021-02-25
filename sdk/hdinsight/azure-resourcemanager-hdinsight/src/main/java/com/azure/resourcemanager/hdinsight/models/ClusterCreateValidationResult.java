// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.resourcemanager.hdinsight.fluent.models.ClusterCreateValidationResultInner;
import java.time.Duration;
import java.util.List;

/** An immutable client-side representation of ClusterCreateValidationResult. */
public interface ClusterCreateValidationResult {
    /**
     * Gets the validationErrors property: The validation errors.
     *
     * @return the validationErrors value.
     */
    List<ValidationErrorInfo> validationErrors();

    /**
     * Gets the validationWarnings property: The validation warnings.
     *
     * @return the validationWarnings value.
     */
    List<ValidationErrorInfo> validationWarnings();

    /**
     * Gets the estimatedCreationDuration property: The estimated creation duration.
     *
     * @return the estimatedCreationDuration value.
     */
    Duration estimatedCreationDuration();

    /**
     * Gets the aaddsResourcesDetails property: The Azure active directory domain service resource details.
     *
     * @return the aaddsResourcesDetails value.
     */
    List<AaddsResourceDetails> aaddsResourcesDetails();

    /**
     * Gets the inner com.azure.resourcemanager.hdinsight.fluent.models.ClusterCreateValidationResultInner object.
     *
     * @return the inner object.
     */
    ClusterCreateValidationResultInner innerModel();
}
