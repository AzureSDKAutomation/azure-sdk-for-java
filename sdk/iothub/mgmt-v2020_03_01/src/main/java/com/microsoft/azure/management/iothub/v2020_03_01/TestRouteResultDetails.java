/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2020_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detailed result of testing a route.
 */
public class TestRouteResultDetails {
    /**
     * JSON-serialized list of route compilation errors.
     */
    @JsonProperty(value = "compilationErrors")
    private List<RouteCompilationError> compilationErrors;

    /**
     * Get jSON-serialized list of route compilation errors.
     *
     * @return the compilationErrors value
     */
    public List<RouteCompilationError> compilationErrors() {
        return this.compilationErrors;
    }

    /**
     * Set jSON-serialized list of route compilation errors.
     *
     * @param compilationErrors the compilationErrors value to set
     * @return the TestRouteResultDetails object itself.
     */
    public TestRouteResultDetails withCompilationErrors(List<RouteCompilationError> compilationErrors) {
        this.compilationErrors = compilationErrors;
        return this;
    }

}
