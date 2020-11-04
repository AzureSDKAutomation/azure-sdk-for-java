/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2015_08_19;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.search.v2015_08_19.implementation.QueryKeyInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.search.v2015_08_19.implementation.SearchManager;

/**
 * Type representing QueryKey.
 */
public interface QueryKey extends HasInner<QueryKeyInner>, HasManager<SearchManager> {
    /**
     * @return the key value.
     */
    String keyVal();

    /**
     * @return the name value.
     */
    String name();

}
