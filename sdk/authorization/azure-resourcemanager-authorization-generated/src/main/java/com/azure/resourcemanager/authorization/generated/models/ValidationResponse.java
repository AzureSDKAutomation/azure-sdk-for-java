// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.generated.models;

import com.azure.resourcemanager.authorization.generated.fluent.models.ValidationResponseInner;

/** An immutable client-side representation of ValidationResponse. */
public interface ValidationResponse {
    /**
     * Gets the isValid property: Whether or not validation succeeded.
     *
     * @return the isValid value.
     */
    Boolean isValid();

    /**
     * Gets the errorInfo property: Failed validation result details.
     *
     * @return the errorInfo value.
     */
    ValidationResponseErrorInfo errorInfo();

    /**
     * Gets the inner com.azure.resourcemanager.authorization.generated.fluent.models.ValidationResponseInner object.
     *
     * @return the inner object.
     */
    ValidationResponseInner innerModel();
}
