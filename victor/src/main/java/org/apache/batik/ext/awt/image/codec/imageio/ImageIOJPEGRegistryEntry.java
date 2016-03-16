/*

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.batik.ext.awt.image.codec.imageio;

/**
 * RegistryEntry implementation for loading JPEG images through Image I/O.
 *
 * @version $Id$
 */
public class ImageIOJPEGRegistryEntry 
    extends AbstractImageIORegistryEntry {

    static final byte [] sigJPEG   = {(byte)0xFF, (byte)0xd8, 
                                      (byte)0xFF};
    static final String [] exts      = {"jpeg", "jpg" };
    static final String [] mimeTypes = {"image/jpeg", "image/jpg" };
    static final MagicNumber [] magicNumbers = {
        new MagicNumber(0, sigJPEG)
    };

    public ImageIOJPEGRegistryEntry() {
        super("JPEG", exts, mimeTypes, magicNumbers);
    }

}
