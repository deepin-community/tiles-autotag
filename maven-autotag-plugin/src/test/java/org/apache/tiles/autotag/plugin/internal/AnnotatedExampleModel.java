/*
 * $Id: AnnotatedExampleModel.java 1349964 2012-06-13 17:18:51Z nlebas $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tiles.autotag.plugin.internal;

import org.apache.tiles.autotag.core.runtime.ModelBody;
import org.apache.tiles.autotag.core.runtime.annotation.Parameter;

/**
 * Example start/stop template.
 *
 * @version $Rev: 1349964 $ $Date: 2012-06-13 19:18:51 +0200 (Wed, 13 Jun 2012) $
 */
public class AnnotatedExampleModel {

    /**
     * It starts.
     *
     * @param one Parameter one.
     * @param two Parameter two.
     * @param request The request.
     * @param modelBody The model body.
     */
    public void execute(
            @Parameter(defaultValue = "hello", name = "alternateOne", required = true) String one,
            int two, ExampleRequest request, ModelBody modelBody) {
        // Does nothing.
    }
}
