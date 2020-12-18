// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.implementation;

import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.fluent.models.JsonSchemaInner;
import com.azure.resourcemanager.logic.models.JsonSchema;

public final class JsonSchemaImpl implements JsonSchema {
    private JsonSchemaInner innerObject;

    private final LogicManager serviceManager;

    JsonSchemaImpl(JsonSchemaInner innerObject, LogicManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String title() {
        return this.innerModel().title();
    }

    public String content() {
        return this.innerModel().content();
    }

    public JsonSchemaInner innerModel() {
        return this.innerObject;
    }

    private LogicManager manager() {
        return this.serviceManager;
    }
}
