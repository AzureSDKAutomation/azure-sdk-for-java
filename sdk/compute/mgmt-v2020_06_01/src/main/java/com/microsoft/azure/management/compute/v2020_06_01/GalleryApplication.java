/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.GalleryApplicationInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2020_06_01.implementation.ComputeManager;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing GalleryApplication.
 */
public interface GalleryApplication extends HasInner<GalleryApplicationInner>, Indexable, Refreshable<GalleryApplication>, Updatable<GalleryApplication.Update>, HasManager<ComputeManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the endOfLifeDate value.
     */
    DateTime endOfLifeDate();

    /**
     * @return the eula value.
     */
    String eula();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the privacyStatementUri value.
     */
    String privacyStatementUri();

    /**
     * @return the releaseNoteUri value.
     */
    String releaseNoteUri();

    /**
     * @return the supportedOSType value.
     */
    OperatingSystemTypes supportedOSType();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the GalleryApplication definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGallery, DefinitionStages.WithLocation, DefinitionStages.WithSupportedOSType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of GalleryApplication definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a GalleryApplication definition.
         */
        interface Blank extends WithGallery {
        }

        /**
         * The stage of the galleryapplication definition allowing to specify Gallery.
         */
        interface WithGallery {
           /**
            * Specifies resourceGroupName, galleryName.
            * @param resourceGroupName The name of the resource group
            * @param galleryName The name of the Shared Application Gallery in which the Application Definition is to be created
            * @return the next definition stage
            */
            WithLocation withExistingGallery(String resourceGroupName, String galleryName);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithSupportedOSType withLocation(String location);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify SupportedOSType.
         */
        interface WithSupportedOSType {
           /**
            * Specifies supportedOSType.
            * @param supportedOSType This property allows you to specify the supported type of the OS that application is built for. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**. Possible values include: 'Windows', 'Linux'
            * @return the next definition stage
            */
            WithCreate withSupportedOSType(OperatingSystemTypes supportedOSType);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of this gallery Application Definition resource. This property is updatable
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify EndOfLifeDate.
         */
        interface WithEndOfLifeDate {
            /**
             * Specifies endOfLifeDate.
             * @param endOfLifeDate The end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable
             * @return the next definition stage
             */
            WithCreate withEndOfLifeDate(DateTime endOfLifeDate);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify Eula.
         */
        interface WithEula {
            /**
             * Specifies eula.
             * @param eula The Eula agreement for the gallery Application Definition
             * @return the next definition stage
             */
            WithCreate withEula(String eula);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify PrivacyStatementUri.
         */
        interface WithPrivacyStatementUri {
            /**
             * Specifies privacyStatementUri.
             * @param privacyStatementUri The privacy statement uri
             * @return the next definition stage
             */
            WithCreate withPrivacyStatementUri(String privacyStatementUri);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify ReleaseNoteUri.
         */
        interface WithReleaseNoteUri {
            /**
             * Specifies releaseNoteUri.
             * @param releaseNoteUri The release note uri
             * @return the next definition stage
             */
            WithCreate withReleaseNoteUri(String releaseNoteUri);
        }

        /**
         * The stage of the galleryapplication definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<GalleryApplication>, DefinitionStages.WithDescription, DefinitionStages.WithEndOfLifeDate, DefinitionStages.WithEula, DefinitionStages.WithPrivacyStatementUri, DefinitionStages.WithReleaseNoteUri, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a GalleryApplication update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<GalleryApplication>, UpdateStages.WithDescription, UpdateStages.WithEndOfLifeDate, UpdateStages.WithEula, UpdateStages.WithPrivacyStatementUri, UpdateStages.WithReleaseNoteUri, UpdateStages.WithTags {
    }

    /**
     * Grouping of GalleryApplication update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the galleryapplication update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description The description of this gallery Application Definition resource. This property is updatable
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the galleryapplication update allowing to specify EndOfLifeDate.
         */
        interface WithEndOfLifeDate {
            /**
             * Specifies endOfLifeDate.
             * @param endOfLifeDate The end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable
             * @return the next update stage
             */
            Update withEndOfLifeDate(DateTime endOfLifeDate);
        }

        /**
         * The stage of the galleryapplication update allowing to specify Eula.
         */
        interface WithEula {
            /**
             * Specifies eula.
             * @param eula The Eula agreement for the gallery Application Definition
             * @return the next update stage
             */
            Update withEula(String eula);
        }

        /**
         * The stage of the galleryapplication update allowing to specify PrivacyStatementUri.
         */
        interface WithPrivacyStatementUri {
            /**
             * Specifies privacyStatementUri.
             * @param privacyStatementUri The privacy statement uri
             * @return the next update stage
             */
            Update withPrivacyStatementUri(String privacyStatementUri);
        }

        /**
         * The stage of the galleryapplication update allowing to specify ReleaseNoteUri.
         */
        interface WithReleaseNoteUri {
            /**
             * Specifies releaseNoteUri.
             * @param releaseNoteUri The release note uri
             * @return the next update stage
             */
            Update withReleaseNoteUri(String releaseNoteUri);
        }

        /**
         * The stage of the galleryapplication update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
