/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model.transform;

import java.util.Map;
import java.util.Map.Entry;
import java.math.*;
import java.nio.ByteBuffer;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Build JSON Unmarshaller
 */
public class BuildJsonUnmarshaller implements Unmarshaller<Build, JsonUnmarshallerContext> {

    public Build unmarshall(JsonUnmarshallerContext context) throws Exception {
        Build build = new Build();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    build.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    build.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    context.nextToken();
                    build.setStartTime(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    context.nextToken();
                    build.setEndTime(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("currentPhase", targetDepth)) {
                    context.nextToken();
                    build.setCurrentPhase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("buildStatus", targetDepth)) {
                    context.nextToken();
                    build.setBuildStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceVersion", targetDepth)) {
                    context.nextToken();
                    build.setSourceVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectName", targetDepth)) {
                    context.nextToken();
                    build.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phases", targetDepth)) {
                    context.nextToken();
                    build.setPhases(new ListUnmarshaller<BuildPhase>(BuildPhaseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    build.setSource(ProjectSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("artifacts", targetDepth)) {
                    context.nextToken();
                    build.setArtifacts(BuildArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    context.nextToken();
                    build.setEnvironment(ProjectEnvironmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logs", targetDepth)) {
                    context.nextToken();
                    build.setLogs(LogsLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeoutInMinutes", targetDepth)) {
                    context.nextToken();
                    build.setTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("buildComplete", targetDepth)) {
                    context.nextToken();
                    build.setBuildComplete(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("initiator", targetDepth)) {
                    context.nextToken();
                    build.setInitiator(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return build;
    }

    private static BuildJsonUnmarshaller instance;

    public static BuildJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildJsonUnmarshaller();
        return instance;
    }
}
