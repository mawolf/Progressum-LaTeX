/*
 * Copyright (C) 2014 Martin Wolf
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of  MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.progressum.latex.lang.lexer;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import net.progressum.latex.lang.psi.impl.*;

public interface LatexTokenTypes {

    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
    IElementType WHITESPACE = TokenType.WHITE_SPACE;
    IElementType ASTERISK = new LatexElementTypeImpl("*");
    IElementType DOLLAR = new LatexElementTypeImpl("$");
    IElementType DEFAULT = new LatexElementTypeImpl("default");
    IElementType KEYWORD = new LatexElementTypeImpl("keyword");
    IElementType BEGIN = new LatexElementTypeImpl("begin");
    IElementType END = new LatexElementTypeImpl("end");
    IElementType EOL = new LatexElementTypeImpl("eol");
    IElementType BACKSLASH = new LatexElementTypeImpl("\\");
    IElementType BRACE_OPTIONS = new LatexElementTypeImpl("BRACE_OPTIONS");
    IElementType BRACKET_OPTIONS = new LatexElementTypeImpl("BRACKET_OPTIONS");
    IElementType COMMAND_CLASS = new LatexElementTypeImpl("COMMAND_CLASS");
    IElementType DOCUMENT_CLASS = new LatexElementTypeImpl("DOCUMENT_CLASS");
    IElementType LATEX_CODE = new LatexElementTypeImpl("LATEX_CODE");
    IElementType PARAMETER = new LatexElementTypeImpl("PARAMETER");
    IElementType PARAMETERS = new LatexElementTypeImpl("PARAMETERS");
    IElementType NEWLINE = new LatexElementTypeImpl("NEWLINE");
    IElementType TOP_STATEMENT = new LatexElementTypeImpl("TOP_STATEMENT");
    IElementType USEPACKAGE_CLASS = new LatexElementTypeImpl("USEPACKAGE_CLASS");
    IElementType COMMA = new LatexElementTypeImpl("COMMA");
    IElementType COMMAND = new LatexElementTypeImpl("COMMAND");
    IElementType COMMENT = new LatexElementTypeImpl("COMMENT");
    IElementType DOCUMENTCLASS = new LatexElementTypeImpl("DOCUMENTCLASS");
    IElementType LEFT_CURLY = new LatexElementTypeImpl("LEFT_CURLY");
    IElementType LEFT_SQUARE = new LatexElementTypeImpl("LEFT_SQUARE");
    IElementType RIGHT_CURLY = new LatexElementTypeImpl("RIGHT_CURLY");
    IElementType RIGHT_SQUARE = new LatexElementTypeImpl("RIGHT_SQUARE");
    IElementType STRING = new LatexElementTypeImpl("STRING");
    IElementType USEPACKAGE = new LatexElementTypeImpl("USEPACKAGE");

    class Factory {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == BRACE_OPTIONS) {
                return new LatexBraceOptionsImpl(node);
            } else if (type == BRACKET_OPTIONS) {
                return new LatexBracketOptionsImpl(node);
            } else if (type == COMMAND_CLASS) {
                return new LatexCommandClassImpl(node);
            } else if (type == DOCUMENT_CLASS) {
                return new LatexDocumentClassImpl(node);
            } else if (type == LATEX_CODE) {
                return new LatexLatexCodeImpl(node);
            } else if (type == PARAMETER) {
                return new LatexParameterImpl(node);
            } else if (type == PARAMETERS) {
                return new LatexParametersImpl(node);
            } else if (type == TOP_STATEMENT) {
                return new LatexTopStatementImpl(node);
            } else if (type == USEPACKAGE_CLASS) {
                return new LatexUsepackageClassImpl(node);
            }
            throw new AssertionError("Unknown element type: " + type);
        }
    }
}
