/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Oracle sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = OracleSink.class)
@JsonTypeName("OracleSink")
public class OracleSink extends CopySink {
    /**
     * SQL pre-copy script. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /**
     * Get sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set sQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set
     * @return the OracleSink object itself.
     */
    public OracleSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

}
