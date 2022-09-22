/* 
 * Copyright 2021 Nils Hoffmann.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lifstools.jmzqc;

import java.net.URI;
import java.util.Collections;
import java.util.List;

/**
 * Input file used to generate the QC metrics.
 */
public record InputFile(
        CvParameter fileFormat,
        List<CvParameter> fileProperties,
        URI location,
        String name) {

    public InputFile    {
        if (fileProperties == null) {
            fileProperties = Collections.emptyList();
        }
    }
}
