/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.appservice.v2019_08_01.DeletedSite;

/**
 * Type representing DeletedWebApps.
 */
public interface DeletedWebApps {
    /**
     * Get deleted app for a subscription at location.
     * Description for Get deleted app for a subscription at location.
     *
     * @param location the String value
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeletedSite> getDeletedWebAppByLocationAsync(String location, String deletedSiteId);

    /**
     * Get all deleted apps for a subscription at location.
     * Description for Get all deleted apps for a subscription at location.
     *
     * @param location the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeletedSite> listByLocationAsync(final String location);

    /**
     * Get all deleted apps for a subscription.
     * Description for Get all deleted apps for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<DeletedSite> listAsync();

}
