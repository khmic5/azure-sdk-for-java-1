// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AutomationActionWorkspace;
import org.junit.jupiter.api.Assertions;

public final class AutomationActionWorkspaceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationActionWorkspace model =
            BinaryData
                .fromString("{\"actionType\":\"Workspace\",\"workspaceResourceId\":\"l\"}")
                .toObject(AutomationActionWorkspace.class);
        Assertions.assertEquals("l", model.workspaceResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationActionWorkspace model = new AutomationActionWorkspace().withWorkspaceResourceId("l");
        model = BinaryData.fromObject(model).toObject(AutomationActionWorkspace.class);
        Assertions.assertEquals("l", model.workspaceResourceId());
    }
}
