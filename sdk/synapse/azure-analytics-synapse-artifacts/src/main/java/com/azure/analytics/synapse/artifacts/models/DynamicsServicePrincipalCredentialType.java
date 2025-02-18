// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for
 * key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
 */
public final class DynamicsServicePrincipalCredentialType
        extends ExpandableStringEnum<DynamicsServicePrincipalCredentialType> {
    /** Static value ServicePrincipalKey for DynamicsServicePrincipalCredentialType. */
    public static final DynamicsServicePrincipalCredentialType SERVICE_PRINCIPAL_KEY =
            fromString("ServicePrincipalKey");

    /** Static value ServicePrincipalCert for DynamicsServicePrincipalCredentialType. */
    public static final DynamicsServicePrincipalCredentialType SERVICE_PRINCIPAL_CERT =
            fromString("ServicePrincipalCert");

    /**
     * Creates or finds a DynamicsServicePrincipalCredentialType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DynamicsServicePrincipalCredentialType.
     */
    @JsonCreator
    public static DynamicsServicePrincipalCredentialType fromString(String name) {
        return fromString(name, DynamicsServicePrincipalCredentialType.class);
    }

    /**
     * Gets known DynamicsServicePrincipalCredentialType values.
     *
     * @return known DynamicsServicePrincipalCredentialType values.
     */
    public static Collection<DynamicsServicePrincipalCredentialType> values() {
        return values(DynamicsServicePrincipalCredentialType.class);
    }
}
