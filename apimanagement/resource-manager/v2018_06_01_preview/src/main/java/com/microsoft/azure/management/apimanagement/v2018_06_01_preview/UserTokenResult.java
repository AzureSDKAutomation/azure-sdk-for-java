/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.UserTokenResultInner;

/**
 * Type representing UserTokenResult.
 */
public interface UserTokenResult extends HasInner<UserTokenResultInner>, HasManager<ApiManagementManager> {
    /**
     * @return the value value.
     */
    String value();

}
