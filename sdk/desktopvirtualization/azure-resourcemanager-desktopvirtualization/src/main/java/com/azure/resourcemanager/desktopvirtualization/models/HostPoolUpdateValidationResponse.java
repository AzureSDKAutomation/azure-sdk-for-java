// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.resourcemanager.desktopvirtualization.fluent.models.HostPoolUpdateValidationResponseInner;
import java.util.List;

/** An immutable client-side representation of HostPoolUpdateValidationResponse. */
public interface HostPoolUpdateValidationResponse {
    /**
     * Gets the warnings property: Warnings from the hostpool update validation.
     *
     * @return the warnings value.
     */
    List<HostPoolUpdateFault> warnings();

    /**
     * Gets the errors property: Errors from the hostpool update validation.
     *
     * @return the errors value.
     */
    List<HostPoolUpdateFault> errors();

    /**
     * Gets the inner
     * com.azure.resourcemanager.desktopvirtualization.fluent.models.HostPoolUpdateValidationResponseInner object.
     *
     * @return the inner object.
     */
    HostPoolUpdateValidationResponseInner innerModel();
}
