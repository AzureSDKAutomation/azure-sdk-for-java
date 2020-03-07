/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for WsdlImportMethod.
 */
public final class WsdlImportMethod extends ExpandableStringEnum<WsdlImportMethod> {
    /** Static value NotSpecified for WsdlImportMethod. */
    public static final WsdlImportMethod NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value SoapToRest for WsdlImportMethod. */
    public static final WsdlImportMethod SOAP_TO_REST = fromString("SoapToRest");

    /** Static value SoapPassThrough for WsdlImportMethod. */
    public static final WsdlImportMethod SOAP_PASS_THROUGH = fromString("SoapPassThrough");

    /**
     * Creates or finds a WsdlImportMethod from its string representation.
     * @param name a name to look for
     * @return the corresponding WsdlImportMethod
     */
    @JsonCreator
    public static WsdlImportMethod fromString(String name) {
        return fromString(name, WsdlImportMethod.class);
    }

    /**
     * @return known WsdlImportMethod values
     */
    public static Collection<WsdlImportMethod> values() {
        return values(WsdlImportMethod.class);
    }
}
