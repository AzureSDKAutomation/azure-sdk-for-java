/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.DevicesManager;
import com.microsoft.azure.management.iothub.v2020_03_01.implementation.OperationInner;

/**
 * Type representing Operation.
 */
public interface Operation extends HasInner<OperationInner>, HasManager<DevicesManager> {
    /**
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * @return the name value.
     */
    String name();

}
