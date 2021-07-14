// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.WebAppStackInner;
import java.util.List;

/** An immutable client-side representation of WebAppStack. */
public interface WebAppStack {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the location property: Web App stack location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the displayText property: Web App stack (display only).
     *
     * @return the displayText value.
     */
    String displayText();

    /**
     * Gets the value property: Web App stack name.
     *
     * @return the value value.
     */
    String value();

    /**
     * Gets the majorVersions property: List of major versions available.
     *
     * @return the majorVersions value.
     */
    List<WebAppMajorVersion> majorVersions();

    /**
     * Gets the preferredOs property: Web App stack preferred OS.
     *
     * @return the preferredOs value.
     */
    StackPreferredOs preferredOs();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.WebAppStackInner object.
     *
     * @return the inner object.
     */
    WebAppStackInner innerModel();
}
