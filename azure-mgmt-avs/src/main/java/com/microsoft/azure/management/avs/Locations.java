/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs;

import com.microsoft.azure.management.avs.models.ApiErrorException;
import com.microsoft.azure.management.avs.models.Quota;
import com.microsoft.azure.management.avs.models.Trial;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Locations.
 */
public interface Locations {
    /**
     * Return trial status for subscription by region.
     *
     * @param location Azure region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ApiErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Trial object if successful.
     */
    Trial checkTrialAvailability(String location);

    /**
     * Return trial status for subscription by region.
     *
     * @param location Azure region
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Trial> checkTrialAvailabilityAsync(String location, final ServiceCallback<Trial> serviceCallback);

    /**
     * Return trial status for subscription by region.
     *
     * @param location Azure region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Trial object
     */
    Observable<Trial> checkTrialAvailabilityAsync(String location);

    /**
     * Return trial status for subscription by region.
     *
     * @param location Azure region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Trial object
     */
    Observable<ServiceResponse<Trial>> checkTrialAvailabilityWithServiceResponseAsync(String location);

    /**
     * Return quota for subscription by region.
     *
     * @param location Azure region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ApiErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Quota object if successful.
     */
    Quota checkQuotaAvailability(String location);

    /**
     * Return quota for subscription by region.
     *
     * @param location Azure region
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Quota> checkQuotaAvailabilityAsync(String location, final ServiceCallback<Quota> serviceCallback);

    /**
     * Return quota for subscription by region.
     *
     * @param location Azure region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Quota object
     */
    Observable<Quota> checkQuotaAvailabilityAsync(String location);

    /**
     * Return quota for subscription by region.
     *
     * @param location Azure region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Quota object
     */
    Observable<ServiceResponse<Quota>> checkQuotaAvailabilityWithServiceResponseAsync(String location);

}
