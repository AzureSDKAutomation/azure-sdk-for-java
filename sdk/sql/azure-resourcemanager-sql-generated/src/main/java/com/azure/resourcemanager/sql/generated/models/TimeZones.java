// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of TimeZones. */
public interface TimeZones {
    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location.
     */
    PagedIterable<TimeZone> listByLocation(String locationName);

    /**
     * Gets a list of managed instance time zones by location.
     *
     * @param locationName The locationName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed instance time zones by location.
     */
    PagedIterable<TimeZone> listByLocation(String locationName, Context context);

    /**
     * Gets a managed instance time zone.
     *
     * @param locationName The locationName parameter.
     * @param timeZoneId The timeZoneId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance time zone.
     */
    TimeZone get(String locationName, String timeZoneId);

    /**
     * Gets a managed instance time zone.
     *
     * @param locationName The locationName parameter.
     * @param timeZoneId The timeZoneId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed instance time zone.
     */
    Response<TimeZone> getWithResponse(String locationName, String timeZoneId, Context context);
}
