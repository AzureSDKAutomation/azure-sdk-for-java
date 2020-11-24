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
 * Defines values for SwaggerSchemaType.
 */
public final class SwaggerSchemaType extends ExpandableStringEnum<SwaggerSchemaType> {
    /** Static value String for SwaggerSchemaType. */
    public static final SwaggerSchemaType STRING = fromString("String");

    /** Static value Number for SwaggerSchemaType. */
    public static final SwaggerSchemaType NUMBER = fromString("Number");

    /** Static value Integer for SwaggerSchemaType. */
    public static final SwaggerSchemaType INTEGER = fromString("Integer");

    /** Static value Boolean for SwaggerSchemaType. */
    public static final SwaggerSchemaType BOOLEAN = fromString("Boolean");

    /** Static value Array for SwaggerSchemaType. */
    public static final SwaggerSchemaType ARRAY = fromString("Array");

    /** Static value File for SwaggerSchemaType. */
    public static final SwaggerSchemaType FILE = fromString("File");

    /** Static value Object for SwaggerSchemaType. */
    public static final SwaggerSchemaType OBJECT = fromString("Object");

    /** Static value Null for SwaggerSchemaType. */
    public static final SwaggerSchemaType NULL = fromString("Null");

    /**
     * Creates or finds a SwaggerSchemaType from its string representation.
     * @param name a name to look for
     * @return the corresponding SwaggerSchemaType
     */
    @JsonCreator
    public static SwaggerSchemaType fromString(String name) {
        return fromString(name, SwaggerSchemaType.class);
    }

    /**
     * @return known SwaggerSchemaType values
     */
    public static Collection<SwaggerSchemaType> values() {
        return values(SwaggerSchemaType.class);
    }
}
