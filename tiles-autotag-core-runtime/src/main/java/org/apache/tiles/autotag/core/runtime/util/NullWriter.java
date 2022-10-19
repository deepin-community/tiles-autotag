/*
 * $Id: NullWriter.java 1306435 2012-03-28 15:39:11Z nlebas $
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

package org.apache.tiles.autotag.core.runtime.util;

import java.io.Writer;

/**
 * A writer that does not write anything.
 *
 * @version $Rev: 1306435 $ $Date: 2012-03-28 17:39:11 +0200 (Wed, 28 Mar 2012) $
 */
public class NullWriter extends Writer {

    /** {@inheritDoc} */
    @Override
    public void close() {
        // Does nothing
    }

    /** {@inheritDoc} */
    @Override
    public void flush() {
        // Does nothing
    }

    /** {@inheritDoc} */
    @Override
    public void write(char[] cbuf, int off, int len) {
        // Does nothing
    }
}
