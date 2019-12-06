/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Set value for a Variable.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SetVariableActivity.class)
@JsonTypeName("SetVariable")
@JsonFlatten
public class SetVariableActivity extends ControlActivity {
    /**
     * Name of the variable whose value needs to be set.
     */
    @JsonProperty(value = "typeProperties.variableName")
    private String variableName;

    /**
     * Value to be set. Could be a static value or Expression.
     */
    @JsonProperty(value = "typeProperties.value")
    private Object value;

    /**
     * Get name of the variable whose value needs to be set.
     *
     * @return the variableName value
     */
    public String variableName() {
        return this.variableName;
    }

    /**
     * Set name of the variable whose value needs to be set.
     *
     * @param variableName the variableName value to set
     * @return the SetVariableActivity object itself.
     */
    public SetVariableActivity withVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Get value to be set. Could be a static value or Expression.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set value to be set. Could be a static value or Expression.
     *
     * @param value the value value to set
     * @return the SetVariableActivity object itself.
     */
    public SetVariableActivity withValue(Object value) {
        this.value = value;
        return this;
    }

}
