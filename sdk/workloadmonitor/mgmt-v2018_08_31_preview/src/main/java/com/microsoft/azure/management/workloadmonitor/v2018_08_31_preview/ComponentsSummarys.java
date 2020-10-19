/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview;

import rx.Observable;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation.ComponentsSummarysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ComponentsSummarys.
 */
public interface ComponentsSummarys extends HasInner<ComponentsSummarysInner> {
    /**
     * Get subscription wide details of components.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Component> listAsync();

}
