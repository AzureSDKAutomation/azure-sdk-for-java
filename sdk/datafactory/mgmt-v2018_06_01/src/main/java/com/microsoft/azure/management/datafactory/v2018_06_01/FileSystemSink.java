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

/**
 * A copy activity file system sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = FileSystemSink.class)
@JsonTypeName("FileSystemSink")
public class FileSystemSink extends CopySink {
    /**
     * The type of copy behavior for copy sink.
     */
    @JsonProperty(value = "copyBehavior")
    private Object copyBehavior;

    /**
     * Get the type of copy behavior for copy sink.
     *
     * @return the copyBehavior value
     */
    public Object copyBehavior() {
        return this.copyBehavior;
    }

    /**
     * Set the type of copy behavior for copy sink.
     *
     * @param copyBehavior the copyBehavior value to set
     * @return the FileSystemSink object itself.
     */
    public FileSystemSink withCopyBehavior(Object copyBehavior) {
        this.copyBehavior = copyBehavior;
        return this;
    }

}
