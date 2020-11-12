/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.EncryptionProtectorInner;

/**
 * Type representing EncryptionProtector.
 */
public interface EncryptionProtector extends HasInner<EncryptionProtectorInner>, HasManager<SynapseManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the serverKeyName value.
     */
    String serverKeyName();

    /**
     * @return the serverKeyType value.
     */
    ServerKeyType serverKeyType();

    /**
     * @return the subregion value.
     */
    String subregion();

    /**
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uri value.
     */
    String uri();

}
