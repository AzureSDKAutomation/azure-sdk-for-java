/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.DBForPostgreSQLManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.ConfigurationListResultInner;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.ConfigurationInner;
import java.util.List;

/**
 * Type representing ConfigurationListResult.
 */
public interface ConfigurationListResult extends HasInner<ConfigurationListResultInner>, HasManager<DBForPostgreSQLManager> {
    /**
     * @return the value value.
     */
    List<ConfigurationInner> value();

}
