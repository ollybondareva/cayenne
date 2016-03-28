/*****************************************************************
 *   Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 ****************************************************************/

package org.apache.cayenne.modeler.dialog.template;

import javax.swing.*;
import java.awt.*;

/**
 * @since 4.0
 */
public class TemplateEditorView extends JPanel {
    protected JEditorPane editorPane;
    protected JScrollPane scrollPane;
    protected JLabel label;

    public TemplateEditorView() {
        this.editorPane = new JEditorPane();
        this.scrollPane = new JScrollPane(editorPane);
        this.label = new JLabel();
        this.label.setVisible(false);

        scrollPane = new JScrollPane(editorPane);
        scrollPane.setPreferredSize(new Dimension(210, 300));
    }

    public JEditorPane getEditorPane() {
        return editorPane;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
}
