/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object entry in a change that is not re-imported.
 */
public class ChangeNotReimportedEntry {
    /**
     * The anchor.
     */
    @JsonProperty(value = "anchor")
    private String anchor;

    /**
     * The parent anchor.
     */
    @JsonProperty(value = "parentAnchor")
    private String parentAnchor;

    /**
     * The primary object class.
     */
    @JsonProperty(value = "primaryObjectClass")
    private String primaryObjectClass;

    /**
     * The list of object classes.
     */
    @JsonProperty(value = "objectClasses")
    private List<String> objectClasses;

    /**
     * The delta attributes for distinguished names.
     */
    @JsonProperty(value = "dnAttributes")
    private List<AttributeDelta> dnAttributes;

    /**
     * The attributes.
     */
    @JsonProperty(value = "attributes")
    private List<AttributeDelta> attributes;

    /**
     * The distinguished name.
     */
    @JsonProperty(value = "dn")
    private String dn;

    /**
     * Get the anchor.
     *
     * @return the anchor value
     */
    public String anchor() {
        return this.anchor;
    }

    /**
     * Set the anchor.
     *
     * @param anchor the anchor value to set
     * @return the ChangeNotReimportedEntry object itself.
     */
    public ChangeNotReimportedEntry withAnchor(String anchor) {
        this.anchor = anchor;
        return this;
    }

    /**
     * Get the parent anchor.
     *
     * @return the parentAnchor value
     */
    public String parentAnchor() {
        return this.parentAnchor;
    }

    /**
     * Set the parent anchor.
     *
     * @param parentAnchor the parentAnchor value to set
     * @return the ChangeNotReimportedEntry object itself.
     */
    public ChangeNotReimportedEntry withParentAnchor(String parentAnchor) {
        this.parentAnchor = parentAnchor;
        return this;
    }

    /**
     * Get the primary object class.
     *
     * @return the primaryObjectClass value
     */
    public String primaryObjectClass() {
        return this.primaryObjectClass;
    }

    /**
     * Set the primary object class.
     *
     * @param primaryObjectClass the primaryObjectClass value to set
     * @return the ChangeNotReimportedEntry object itself.
     */
    public ChangeNotReimportedEntry withPrimaryObjectClass(String primaryObjectClass) {
        this.primaryObjectClass = primaryObjectClass;
        return this;
    }

    /**
     * Get the list of object classes.
     *
     * @return the objectClasses value
     */
    public List<String> objectClasses() {
        return this.objectClasses;
    }

    /**
     * Set the list of object classes.
     *
     * @param objectClasses the objectClasses value to set
     * @return the ChangeNotReimportedEntry object itself.
     */
    public ChangeNotReimportedEntry withObjectClasses(List<String> objectClasses) {
        this.objectClasses = objectClasses;
        return this;
    }

    /**
     * Get the delta attributes for distinguished names.
     *
     * @return the dnAttributes value
     */
    public List<AttributeDelta> dnAttributes() {
        return this.dnAttributes;
    }

    /**
     * Set the delta attributes for distinguished names.
     *
     * @param dnAttributes the dnAttributes value to set
     * @return the ChangeNotReimportedEntry object itself.
     */
    public ChangeNotReimportedEntry withDnAttributes(List<AttributeDelta> dnAttributes) {
        this.dnAttributes = dnAttributes;
        return this;
    }

    /**
     * Get the attributes.
     *
     * @return the attributes value
     */
    public List<AttributeDelta> attributes() {
        return this.attributes;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes value to set
     * @return the ChangeNotReimportedEntry object itself.
     */
    public ChangeNotReimportedEntry withAttributes(List<AttributeDelta> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the distinguished name.
     *
     * @return the dn value
     */
    public String dn() {
        return this.dn;
    }

    /**
     * Set the distinguished name.
     *
     * @param dn the dn value to set
     * @return the ChangeNotReimportedEntry object itself.
     */
    public ChangeNotReimportedEntry withDn(String dn) {
        this.dn = dn;
        return this;
    }

}
