/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.bing.v2020_06_10_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.bing.v2020_06_10_preview.implementation.BingManager;
import com.microsoft.azure.management.bing.v2020_06_10_preview.implementation.UsagesResultInner;
import java.util.List;

/**
 * Type representing UsagesResult.
 */
public interface UsagesResult extends HasInner<UsagesResultInner>, HasManager<BingManager> {
    /**
     * @return the value value.
     */
    List<Usage> value();

}
