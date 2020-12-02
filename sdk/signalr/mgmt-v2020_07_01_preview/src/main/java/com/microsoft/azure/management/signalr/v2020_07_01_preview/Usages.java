/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_07_01_preview;

import rx.Observable;
import com.microsoft.azure.management.signalr.v2020_07_01_preview.implementation.UsagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Usages.
 */
public interface Usages extends HasInner<UsagesInner> {
    /**
     * List usage quotas for Azure SignalR service by location.
     *
     * @param location the location like "eastus"
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SignalRUsage> listAsync(final String location);

}
