// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.resourcemanager.appservice.generated.fluent.models.TopLevelDomainInner;

/** An immutable client-side representation of TopLevelDomain. */
public interface TopLevelDomain {
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
     * Gets the privacy property: If &lt;code&gt;true&lt;/code&gt;, then the top level domain supports domain privacy;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the privacy value.
     */
    Boolean privacy();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.TopLevelDomainInner object.
     *
     * @return the inner object.
     */
    TopLevelDomainInner innerModel();
}
