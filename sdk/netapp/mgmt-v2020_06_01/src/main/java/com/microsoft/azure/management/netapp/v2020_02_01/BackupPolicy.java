/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.BackupPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_02_01.implementation.NetAppManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing BackupPolicy.
 */
public interface BackupPolicy extends HasInner<BackupPolicyInner>, Indexable, Refreshable<BackupPolicy>, Updatable<BackupPolicy.Update>, HasManager<NetAppManager> {
    /**
     * @return the dailyBackupsToKeep value.
     */
    Integer dailyBackupsToKeep();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the monthlyBackupsToKeep value.
     */
    Integer monthlyBackupsToKeep();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the name1 value.
     */
    String name1();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the volumeBackups value.
     */
    List<VolumeBackups> volumeBackups();

    /**
     * @return the volumesAssigned value.
     */
    Integer volumesAssigned();

    /**
     * @return the weeklyBackupsToKeep value.
     */
    Integer weeklyBackupsToKeep();

    /**
     * @return the yearlyBackupsToKeep value.
     */
    Integer yearlyBackupsToKeep();

    /**
     * The entirety of the BackupPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetAppAccount, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BackupPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BackupPolicy definition.
         */
        interface Blank extends WithNetAppAccount {
        }

        /**
         * The stage of the backuppolicy definition allowing to specify NetAppAccount.
         */
        interface WithNetAppAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group
            * @param accountName The name of the NetApp account
            * @return the next definition stage
            */
            WithLocation withExistingNetAppAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location the location parameter value
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify DailyBackupsToKeep.
         */
        interface WithDailyBackupsToKeep {
            /**
             * Specifies dailyBackupsToKeep.
             * @param dailyBackupsToKeep Daily backups count to keep
             * @return the next definition stage
             */
            WithCreate withDailyBackupsToKeep(Integer dailyBackupsToKeep);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled The property to decide policy is enabled or not
             * @return the next definition stage
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify MonthlyBackupsToKeep.
         */
        interface WithMonthlyBackupsToKeep {
            /**
             * Specifies monthlyBackupsToKeep.
             * @param monthlyBackupsToKeep Monthly backups count to keep
             * @return the next definition stage
             */
            WithCreate withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify VolumeBackups.
         */
        interface WithVolumeBackups {
            /**
             * Specifies volumeBackups.
             * @param volumeBackups A list of volumes assigned to this policy
             * @return the next definition stage
             */
            WithCreate withVolumeBackups(List<VolumeBackups> volumeBackups);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify VolumesAssigned.
         */
        interface WithVolumesAssigned {
            /**
             * Specifies volumesAssigned.
             * @param volumesAssigned Volumes using current backup policy
             * @return the next definition stage
             */
            WithCreate withVolumesAssigned(Integer volumesAssigned);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify WeeklyBackupsToKeep.
         */
        interface WithWeeklyBackupsToKeep {
            /**
             * Specifies weeklyBackupsToKeep.
             * @param weeklyBackupsToKeep Weekly backups count to keep
             * @return the next definition stage
             */
            WithCreate withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep);
        }

        /**
         * The stage of the backuppolicy definition allowing to specify YearlyBackupsToKeep.
         */
        interface WithYearlyBackupsToKeep {
            /**
             * Specifies yearlyBackupsToKeep.
             * @param yearlyBackupsToKeep Yearly backups count to keep
             * @return the next definition stage
             */
            WithCreate withYearlyBackupsToKeep(Integer yearlyBackupsToKeep);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BackupPolicy>, DefinitionStages.WithDailyBackupsToKeep, DefinitionStages.WithEnabled, DefinitionStages.WithMonthlyBackupsToKeep, DefinitionStages.WithTags, DefinitionStages.WithVolumeBackups, DefinitionStages.WithVolumesAssigned, DefinitionStages.WithWeeklyBackupsToKeep, DefinitionStages.WithYearlyBackupsToKeep {
        }
    }
    /**
     * The template for a BackupPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BackupPolicy>, UpdateStages.WithDailyBackupsToKeep, UpdateStages.WithEnabled, UpdateStages.WithLocation, UpdateStages.WithMonthlyBackupsToKeep, UpdateStages.WithVolumeBackups, UpdateStages.WithVolumesAssigned, UpdateStages.WithWeeklyBackupsToKeep, UpdateStages.WithYearlyBackupsToKeep {
    }

    /**
     * Grouping of BackupPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the backuppolicy update allowing to specify DailyBackupsToKeep.
         */
        interface WithDailyBackupsToKeep {
            /**
             * Specifies dailyBackupsToKeep.
             * @param dailyBackupsToKeep Daily backups count to keep
             * @return the next update stage
             */
            Update withDailyBackupsToKeep(Integer dailyBackupsToKeep);
        }

        /**
         * The stage of the backuppolicy update allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled The property to decide policy is enabled or not
             * @return the next update stage
             */
            Update withEnabled(Boolean enabled);
        }

        /**
         * The stage of the backuppolicy update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the backuppolicy update allowing to specify MonthlyBackupsToKeep.
         */
        interface WithMonthlyBackupsToKeep {
            /**
             * Specifies monthlyBackupsToKeep.
             * @param monthlyBackupsToKeep Monthly backups count to keep
             * @return the next update stage
             */
            Update withMonthlyBackupsToKeep(Integer monthlyBackupsToKeep);
        }

        /**
         * The stage of the backuppolicy update allowing to specify VolumeBackups.
         */
        interface WithVolumeBackups {
            /**
             * Specifies volumeBackups.
             * @param volumeBackups A list of volumes assigned to this policy
             * @return the next update stage
             */
            Update withVolumeBackups(List<VolumeBackups> volumeBackups);
        }

        /**
         * The stage of the backuppolicy update allowing to specify VolumesAssigned.
         */
        interface WithVolumesAssigned {
            /**
             * Specifies volumesAssigned.
             * @param volumesAssigned Volumes using current backup policy
             * @return the next update stage
             */
            Update withVolumesAssigned(Integer volumesAssigned);
        }

        /**
         * The stage of the backuppolicy update allowing to specify WeeklyBackupsToKeep.
         */
        interface WithWeeklyBackupsToKeep {
            /**
             * Specifies weeklyBackupsToKeep.
             * @param weeklyBackupsToKeep Weekly backups count to keep
             * @return the next update stage
             */
            Update withWeeklyBackupsToKeep(Integer weeklyBackupsToKeep);
        }

        /**
         * The stage of the backuppolicy update allowing to specify YearlyBackupsToKeep.
         */
        interface WithYearlyBackupsToKeep {
            /**
             * Specifies yearlyBackupsToKeep.
             * @param yearlyBackupsToKeep Yearly backups count to keep
             * @return the next update stage
             */
            Update withYearlyBackupsToKeep(Integer yearlyBackupsToKeep);
        }

    }
}
