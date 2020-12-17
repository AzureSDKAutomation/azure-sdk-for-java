// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.IkeSaParametersInner;

/** An immutable client-side representation of IkeSaParameters. */
public interface IkeSaParameters {
    /**
     * Gets the mainModeSa property: A list of main mode security associations.
     *
     * @return the mainModeSa value.
     */
    IkeSaParametersMainModeSa mainModeSa();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.IkeSaParametersInner object.
     *
     * @return the inner object.
     */
    IkeSaParametersInner innerModel();
}
