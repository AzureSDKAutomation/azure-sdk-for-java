/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2019_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.support.v2019_05_01_preview.implementation.CommunicationDetailsInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.support.v2019_05_01_preview.implementation.SupportManager;
import org.joda.time.DateTime;

/**
 * Type representing CommunicationDetails.
 */
public interface CommunicationDetails extends HasInner<CommunicationDetailsInner>, Indexable, Refreshable<CommunicationDetails>, Updatable<CommunicationDetails.Update>, HasManager<SupportManager> {
    /**
     * @return the body value.
     */
    String body();

    /**
     * @return the communicationDirection value.
     */
    CommunicationDirection communicationDirection();

    /**
     * @return the communicationType value.
     */
    CommunicationType communicationType();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the sender value.
     */
    String sender();

    /**
     * @return the subject value.
     */
    String subject();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CommunicationDetails definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSupportTicket, DefinitionStages.WithBody, DefinitionStages.WithSubject, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CommunicationDetails definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CommunicationDetails definition.
         */
        interface Blank extends WithSupportTicket {
        }

        /**
         * The stage of the communicationdetails definition allowing to specify SupportTicket.
         */
        interface WithSupportTicket {
           /**
            * Specifies supportTicketName.
            * @param supportTicketName Support ticket name
            * @return the next definition stage
            */
            WithBody withExistingSupportTicket(String supportTicketName);
        }

        /**
         * The stage of the communicationdetails definition allowing to specify Body.
         */
        interface WithBody {
           /**
            * Specifies body.
            * @param body Body of the communication
            * @return the next definition stage
            */
            WithSubject withBody(String body);
        }

        /**
         * The stage of the communicationdetails definition allowing to specify Subject.
         */
        interface WithSubject {
           /**
            * Specifies subject.
            * @param subject Subject of the communication
            * @return the next definition stage
            */
            WithCreate withSubject(String subject);
        }

        /**
         * The stage of the communicationdetails definition allowing to specify Sender.
         */
        interface WithSender {
            /**
             * Specifies sender.
             * @param sender Email address of the sender
             * @return the next definition stage
             */
            WithCreate withSender(String sender);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CommunicationDetails>, DefinitionStages.WithSender {
        }
    }
    /**
     * The template for a CommunicationDetails update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CommunicationDetails>, UpdateStages.WithSender {
    }

    /**
     * Grouping of CommunicationDetails update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the communicationdetails update allowing to specify Sender.
         */
        interface WithSender {
            /**
             * Specifies sender.
             * @param sender Email address of the sender
             * @return the next update stage
             */
            Update withSender(String sender);
        }

    }
}
