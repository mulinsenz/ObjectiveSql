/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2020 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.braisdom.jds.resolution;

import com.github.braisdom.jds.ast.Node;
import com.github.braisdom.jds.ast.expr.Expression;
import com.github.braisdom.jds.ast.type.Type;
import com.github.braisdom.jds.resolution.types.ResolvedType;

public interface SymbolResolver {
    /**
     * For a reference it would find the corresponding
     * declaration.
     */
    <T> T resolveDeclaration(Node node, Class<T> resultClass);

    /**
     * For types it would find the corresponding resolved types.
     */
    <T> T toResolvedType(Type javaparserType, Class<T> resultClass);

    ResolvedType calculateType(Expression expression);
}