/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IotHubSku.
 */
public final class IotHubSku extends ExpandableStringEnum<IotHubSku> {
    /** Static value F1 for IotHubSku. */
    public static final IotHubSku F1 = fromString("F1");

    /** Static value S1 for IotHubSku. */
    public static final IotHubSku S1 = fromString("S1");

    /** Static value S2 for IotHubSku. */
    public static final IotHubSku S2 = fromString("S2");

    /** Static value S3 for IotHubSku. */
    public static final IotHubSku S3 = fromString("S3");

    /** Static value B1 for IotHubSku. */
    public static final IotHubSku B1 = fromString("B1");

    /** Static value B2 for IotHubSku. */
    public static final IotHubSku B2 = fromString("B2");

    /** Static value B3 for IotHubSku. */
    public static final IotHubSku B3 = fromString("B3");

    /**
     * Creates or finds a IotHubSku from its string representation.
     * @param name a name to look for
     * @return the corresponding IotHubSku
     */
    @JsonCreator
    public static IotHubSku fromString(String name) {
        return fromString(name, IotHubSku.class);
    }

    /**
     * @return known IotHubSku values
     */
    public static Collection<IotHubSku> values() {
        return values(IotHubSku.class);
    }
}
