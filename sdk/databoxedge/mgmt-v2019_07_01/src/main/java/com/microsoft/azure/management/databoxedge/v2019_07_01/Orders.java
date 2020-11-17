/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01;

import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.databoxedge.v2019_07_01.implementation.OrderInner;
import com.microsoft.azure.management.databoxedge.v2019_07_01.implementation.OrdersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Orders.
 */
public interface Orders extends HasInner<OrdersInner> {
    /**
     * Gets a specific order by name.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Order> getAsync(String deviceName, String resourceGroupName);

    /**
     * Creates or updates an order.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param order The order to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Order> createOrUpdateAsync(String deviceName, String resourceGroupName, OrderInner order);

    /**
     * Deletes the order related to the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String deviceName, String resourceGroupName);

    /**
     * Lists all the orders related to a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Order> listByDataBoxEdgeDeviceAsync(final String deviceName, final String resourceGroupName);

}
