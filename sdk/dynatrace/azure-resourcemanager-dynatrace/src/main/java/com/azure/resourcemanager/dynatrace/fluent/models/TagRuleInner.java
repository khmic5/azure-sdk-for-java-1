// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dynatrace.models.LogRules;
import com.azure.resourcemanager.dynatrace.models.MetricRules;
import com.azure.resourcemanager.dynatrace.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Tag rules for a monitor resource. */
@Fluent
public final class TagRuleInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties", required = true)
    private MonitoringTagRulesProperties innerProperties = new MonitoringTagRulesProperties();

    /*
     * System metadata for this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     *
     * @return the innerProperties value.
     */
    private MonitoringTagRulesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: System metadata for this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the logRules property: Set of rules for sending logs for the Monitor resource.
     *
     * @return the logRules value.
     */
    public LogRules logRules() {
        return this.innerProperties() == null ? null : this.innerProperties().logRules();
    }

    /**
     * Set the logRules property: Set of rules for sending logs for the Monitor resource.
     *
     * @param logRules the logRules value to set.
     * @return the TagRuleInner object itself.
     */
    public TagRuleInner withLogRules(LogRules logRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MonitoringTagRulesProperties();
        }
        this.innerProperties().withLogRules(logRules);
        return this;
    }

    /**
     * Get the metricRules property: Set of rules for sending metrics for the Monitor resource.
     *
     * @return the metricRules value.
     */
    public MetricRules metricRules() {
        return this.innerProperties() == null ? null : this.innerProperties().metricRules();
    }

    /**
     * Set the metricRules property: Set of rules for sending metrics for the Monitor resource.
     *
     * @param metricRules the metricRules value to set.
     * @return the TagRuleInner object itself.
     */
    public TagRuleInner withMetricRules(MetricRules metricRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MonitoringTagRulesProperties();
        }
        this.innerProperties().withMetricRules(metricRules);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model TagRuleInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TagRuleInner.class);
}
