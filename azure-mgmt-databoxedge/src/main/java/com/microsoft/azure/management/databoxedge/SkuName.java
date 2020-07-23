/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SkuName.
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /** Static value Gateway for SkuName. */
    public static final SkuName GATEWAY = fromString("Gateway");

    /** Static value Edge for SkuName. */
    public static final SkuName EDGE = fromString("Edge");

    /** Static value TEA_1Node for SkuName. */
    public static final SkuName TEA_1NODE = fromString("TEA_1Node");

    /** Static value TEA_1Node_UPS for SkuName. */
    public static final SkuName TEA_1NODE_UPS = fromString("TEA_1Node_UPS");

    /** Static value TEA_1Node_Heater for SkuName. */
    public static final SkuName TEA_1NODE_HEATER = fromString("TEA_1Node_Heater");

    /** Static value TEA_1Node_UPS_Heater for SkuName. */
    public static final SkuName TEA_1NODE_UPS_HEATER = fromString("TEA_1Node_UPS_Heater");

    /** Static value TEA_4Node_Heater for SkuName. */
    public static final SkuName TEA_4NODE_HEATER = fromString("TEA_4Node_Heater");

    /** Static value TEA_4Node_UPS_Heater for SkuName. */
    public static final SkuName TEA_4NODE_UPS_HEATER = fromString("TEA_4Node_UPS_Heater");

    /** Static value TMA for SkuName. */
    public static final SkuName TMA = fromString("TMA");

    /** Static value TDC for SkuName. */
    public static final SkuName TDC = fromString("TDC");

    /** Static value TCA_Large for SkuName. */
    public static final SkuName TCA_LARGE = fromString("TCA_Large");

    /** Static value TCA_Small for SkuName. */
    public static final SkuName TCA_SMALL = fromString("TCA_Small");

    /** Static value GPU for SkuName. */
    public static final SkuName GPU = fromString("GPU");

    /**
     * Creates or finds a SkuName from its string representation.
     * @param name a name to look for
     * @return the corresponding SkuName
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * @return known SkuName values
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
