// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cloudshell.models;

import com.azure.resourcemanager.cloudshell.fluent.models.CloudShellConsoleInner;

/** An immutable client-side representation of CloudShellConsole. */
public interface CloudShellConsole {
    /**
     * Gets the properties property: Cloud shell console properties.
     *
     * @return the properties value.
     */
    ConsoleProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.cloudshell.fluent.models.CloudShellConsoleInner object.
     *
     * @return the inner object.
     */
    CloudShellConsoleInner innerModel();
}
