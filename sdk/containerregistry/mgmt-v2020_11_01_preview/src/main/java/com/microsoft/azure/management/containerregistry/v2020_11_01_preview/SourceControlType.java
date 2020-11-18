/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2020_11_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SourceControlType.
 */
public final class SourceControlType extends ExpandableStringEnum<SourceControlType> {
    /** Static value Github for SourceControlType. */
    public static final SourceControlType GITHUB = fromString("Github");

    /** Static value VisualStudioTeamService for SourceControlType. */
    public static final SourceControlType VISUAL_STUDIO_TEAM_SERVICE = fromString("VisualStudioTeamService");

    /**
     * Creates or finds a SourceControlType from its string representation.
     * @param name a name to look for
     * @return the corresponding SourceControlType
     */
    @JsonCreator
    public static SourceControlType fromString(String name) {
        return fromString(name, SourceControlType.class);
    }

    /**
     * @return known SourceControlType values
     */
    public static Collection<SourceControlType> values() {
        return values(SourceControlType.class);
    }
}
