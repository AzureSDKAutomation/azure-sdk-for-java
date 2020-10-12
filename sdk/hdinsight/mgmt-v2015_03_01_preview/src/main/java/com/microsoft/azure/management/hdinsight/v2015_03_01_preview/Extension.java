/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation.ExtensionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.hdinsight.v2015_03_01_preview.implementation.HDInsightManager;

/**
 * Type representing Extension.
 */
public interface Extension extends HasInner<ExtensionInner>, HasManager<HDInsightManager> {
    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the workspaceId value.
     */
    String workspaceId();

}
