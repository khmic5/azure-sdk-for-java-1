// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationActivationState;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/** Event Grid Partner Destination. */
@Fluent
public final class PartnerDestinationInner extends Resource {
    /*
     * Properties of the Partner Destination.
     */
    @JsonProperty(value = "properties")
    private PartnerDestinationProperties innerProperties;

    /*
     * The system metadata relating to Partner Destination resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of PartnerDestinationInner class. */
    public PartnerDestinationInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Partner Destination.
     *
     * @return the innerProperties value.
     */
    private PartnerDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Partner Destination resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public PartnerDestinationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PartnerDestinationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the partnerRegistrationImmutableId property: The immutable Id of the corresponding partner registration.
     *
     * @return the partnerRegistrationImmutableId value.
     */
    public UUID partnerRegistrationImmutableId() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerRegistrationImmutableId();
    }

    /**
     * Set the partnerRegistrationImmutableId property: The immutable Id of the corresponding partner registration.
     *
     * @param partnerRegistrationImmutableId the partnerRegistrationImmutableId value to set.
     * @return the PartnerDestinationInner object itself.
     */
    public PartnerDestinationInner withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerDestinationProperties();
        }
        this.innerProperties().withPartnerRegistrationImmutableId(partnerRegistrationImmutableId);
        return this;
    }

    /**
     * Get the endpointServiceContext property: Endpoint context associated with this partner destination.
     *
     * @return the endpointServiceContext value.
     */
    public String endpointServiceContext() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointServiceContext();
    }

    /**
     * Set the endpointServiceContext property: Endpoint context associated with this partner destination.
     *
     * @param endpointServiceContext the endpointServiceContext value to set.
     * @return the PartnerDestinationInner object itself.
     */
    public PartnerDestinationInner withEndpointServiceContext(String endpointServiceContext) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerDestinationProperties();
        }
        this.innerProperties().withEndpointServiceContext(endpointServiceContext);
        return this;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the partner destination. If this timer
     * expires and the partner destination was never activated, the partner destination and corresponding channel are
     * deleted.
     *
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTimeIfNotActivatedUtc();
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the partner destination. If this timer
     * expires and the partner destination was never activated, the partner destination and corresponding channel are
     * deleted.
     *
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the PartnerDestinationInner object itself.
     */
    public PartnerDestinationInner withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerDestinationProperties();
        }
        this.innerProperties().withExpirationTimeIfNotActivatedUtc(expirationTimeIfNotActivatedUtc);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the partner destination.
     *
     * @return the provisioningState value.
     */
    public PartnerDestinationProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the activationState property: Activation state of the partner destination.
     *
     * @return the activationState value.
     */
    public PartnerDestinationActivationState activationState() {
        return this.innerProperties() == null ? null : this.innerProperties().activationState();
    }

    /**
     * Set the activationState property: Activation state of the partner destination.
     *
     * @param activationState the activationState value to set.
     * @return the PartnerDestinationInner object itself.
     */
    public PartnerDestinationInner withActivationState(PartnerDestinationActivationState activationState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerDestinationProperties();
        }
        this.innerProperties().withActivationState(activationState);
        return this;
    }

    /**
     * Get the endpointBaseUrl property: Endpoint Base URL of the partner destination.
     *
     * @return the endpointBaseUrl value.
     */
    public String endpointBaseUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointBaseUrl();
    }

    /**
     * Set the endpointBaseUrl property: Endpoint Base URL of the partner destination.
     *
     * @param endpointBaseUrl the endpointBaseUrl value to set.
     * @return the PartnerDestinationInner object itself.
     */
    public PartnerDestinationInner withEndpointBaseUrl(String endpointBaseUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerDestinationProperties();
        }
        this.innerProperties().withEndpointBaseUrl(endpointBaseUrl);
        return this;
    }

    /**
     * Get the messageForActivation property: Context or helpful message that can be used during the approval process.
     *
     * @return the messageForActivation value.
     */
    public String messageForActivation() {
        return this.innerProperties() == null ? null : this.innerProperties().messageForActivation();
    }

    /**
     * Set the messageForActivation property: Context or helpful message that can be used during the approval process.
     *
     * @param messageForActivation the messageForActivation value to set.
     * @return the PartnerDestinationInner object itself.
     */
    public PartnerDestinationInner withMessageForActivation(String messageForActivation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PartnerDestinationProperties();
        }
        this.innerProperties().withMessageForActivation(messageForActivation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
