/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.logic.v2019_05_01.implementation.LogicManager;
import com.microsoft.azure.management.logic.v2019_05_01.implementation.JsonSchemaInner;

/**
 * Type representing JsonSchema.
 */
public interface JsonSchema extends HasInner<JsonSchemaInner>, HasManager<LogicManager> {
    /**
     * @return the content value.
     */
    String content();

    /**
     * @return the title value.
     */
    String title();

}
