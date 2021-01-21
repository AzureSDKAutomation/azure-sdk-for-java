// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.ApplicationStackResourceInner;
import java.util.List;

/** An immutable client-side representation of ApplicationStackResource. */
public interface ApplicationStackResource {
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
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the namePropertiesName property: Application stack name.
     *
     * @return the namePropertiesName value.
     */
    String namePropertiesName();

    /**
     * Gets the display property: Application stack display name.
     *
     * @return the display value.
     */
    String display();

    /**
     * Gets the dependency property: Application stack dependency.
     *
     * @return the dependency value.
     */
    String dependency();

    /**
     * Gets the majorVersions property: List of major versions available.
     *
     * @return the majorVersions value.
     */
    List<StackMajorVersion> majorVersions();

    /**
     * Gets the frameworks property: List of frameworks associated with application stack.
     *
     * @return the frameworks value.
     */
    List<ApplicationStack> frameworks();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ApplicationStackResourceInner object.
     *
     * @return the inner object.
     */
    ApplicationStackResourceInner innerModel();
}