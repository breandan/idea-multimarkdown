/*
 * Copyright (c) 2015-2015 Vladimir Schneider <vladimir.schneider@gmail.com>
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 * This file is based on the IntelliJ SimplePlugin tutorial
 *
 */
package com.vladsch.idea.multimarkdown;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class MultiMarkdownIcons {
    public static final Icon FILE = IconLoader.getIcon("/com/vladsch/idea/multimarkdown/multimarkdown.png");
    public static final Icon WIKI = IconLoader.getIcon("/com/vladsch/idea/multimarkdown/wikimarkdown.png");
    public static final Icon HIDDEN_FILE = IconLoader.getIcon("/com/vladsch/idea/multimarkdown/locked-multimarkdown.png");
    public static final Icon HIDDEN_WIKI = IconLoader.getIcon("/com/vladsch/idea/multimarkdown/locked-wikimarkdown.png");
    public static final Icon MULTI_WIKI = IconLoader.getIcon("/com/vladsch/idea/multimarkdown/multi-wikimarkdown.png");
    public static final Icon QUICK_FIX = IconLoader.getIcon("/com/vladsch/idea/multimarkdown/markdownfix.png");
    public static final Icon GITHUB = IconLoader.getIcon("/com/vladsch/idea/multimarkdown/githublink.png");

}
