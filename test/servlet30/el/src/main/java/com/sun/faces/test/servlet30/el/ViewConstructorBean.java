/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates.
 * Copyright (c) 2018 Payara Services Limited.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.faces.test.servlet30.el;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * A ViewScoped bean testing constructor functionality.
 */

@Named
@ViewScoped
public class ViewConstructorBean implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * Stores the text.
     */
    private String text;

    /**
     * Constructor.
     */
    public ViewConstructorBean() {
        this.text = "This is constructed";
    }

    /**
     * Get the text.
     */
    public String getText() {
        return this.text;
    }
}
