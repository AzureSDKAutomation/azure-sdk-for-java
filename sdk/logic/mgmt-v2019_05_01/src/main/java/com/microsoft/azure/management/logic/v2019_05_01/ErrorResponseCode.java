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
 * Defines values for ErrorResponseCode.
 */
public final class ErrorResponseCode extends ExpandableStringEnum<ErrorResponseCode> {
    /** Static value NotSpecified for ErrorResponseCode. */
    public static final ErrorResponseCode NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value IntegrationServiceEnvironmentNotFound for ErrorResponseCode. */
    public static final ErrorResponseCode INTEGRATION_SERVICE_ENVIRONMENT_NOT_FOUND = fromString("IntegrationServiceEnvironmentNotFound");

    /** Static value InternalServerError for ErrorResponseCode. */
    public static final ErrorResponseCode INTERNAL_SERVER_ERROR = fromString("InternalServerError");

    /** Static value InvalidOperationId for ErrorResponseCode. */
    public static final ErrorResponseCode INVALID_OPERATION_ID = fromString("InvalidOperationId");

    /**
     * Creates or finds a ErrorResponseCode from its string representation.
     * @param name a name to look for
     * @return the corresponding ErrorResponseCode
     */
    @JsonCreator
    public static ErrorResponseCode fromString(String name) {
        return fromString(name, ErrorResponseCode.class);
    }

    /**
     * @return known ErrorResponseCode values
     */
    public static Collection<ErrorResponseCode> values() {
        return values(ErrorResponseCode.class);
    }
}
