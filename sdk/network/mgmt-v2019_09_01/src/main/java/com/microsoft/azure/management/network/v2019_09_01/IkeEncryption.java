/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IkeEncryption.
 */
public final class IkeEncryption extends ExpandableStringEnum<IkeEncryption> {
    /** Static value DES for IkeEncryption. */
    public static final IkeEncryption DES = fromString("DES");

    /** Static value DES3 for IkeEncryption. */
    public static final IkeEncryption DES3 = fromString("DES3");

    /** Static value AES128 for IkeEncryption. */
    public static final IkeEncryption AES128 = fromString("AES128");

    /** Static value AES192 for IkeEncryption. */
    public static final IkeEncryption AES192 = fromString("AES192");

    /** Static value AES256 for IkeEncryption. */
    public static final IkeEncryption AES256 = fromString("AES256");

    /** Static value GCMAES256 for IkeEncryption. */
    public static final IkeEncryption GCMAES256 = fromString("GCMAES256");

    /** Static value GCMAES128 for IkeEncryption. */
    public static final IkeEncryption GCMAES128 = fromString("GCMAES128");

    /**
     * Creates or finds a IkeEncryption from its string representation.
     * @param name a name to look for
     * @return the corresponding IkeEncryption
     */
    @JsonCreator
    public static IkeEncryption fromString(String name) {
        return fromString(name, IkeEncryption.class);
    }

    /**
     * @return known IkeEncryption values
     */
    public static Collection<IkeEncryption> values() {
        return values(IkeEncryption.class);
    }
}
