/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview;

import rx.Observable;
import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation.DesktopsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Desktops.
 */
public interface Desktops extends HasInner<DesktopsInner> {
    /**
     * List desktops.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DesktopList> listAsync(String resourceGroupName, String applicationGroupName);

    /**
     * Get a desktop.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group
     * @param desktopName The name of the desktop within the specified desktop group
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Desktop> getAsync(String resourceGroupName, String applicationGroupName, String desktopName);

}
