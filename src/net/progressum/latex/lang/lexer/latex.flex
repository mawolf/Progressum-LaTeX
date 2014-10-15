package net.progressum.latex.lang.lexer;

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

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

%%

%class _LatexLexer
%implements FlexLexer
%unicode
%public

%function advance
%type IElementType

%eof{
return;
%eof}

eol = [\r\n]

number = [0-9]+

command = "\\"[^\[][a-zA-Z]*
string = [a-zA-Z0-9_]*
comments = "%".*{eol}

whitespace = [\ \t]

%%

"\\usepackage" { return LatexTokenTypes.USEPACKAGE; }
"\\documentclass" {return LatexTokenTypes.DOCUMENTCLASS; }
{command} { return LatexTokenTypes.COMMAND; }

{number} { return LatexTokenTypes.STRING; }
{comments} { return LatexTokenTypes.COMMENT; }
{whitespace} {  return LatexTokenTypes.WHITESPACE; }

"{" { return LatexTokenTypes.LEFT_CURLY; }
"}" { return LatexTokenTypes.RIGHT_CURLY; }
"[" { return LatexTokenTypes.LEFT_SQUARE; }
"]" { return LatexTokenTypes.RIGHT_SQUARE; }
"," { return LatexTokenTypes.COMMA; }
"\\" { return LatexTokenTypes.BACKSLASH; }
"*" { return LatexTokenTypes.ASTERISK; }

"$" { return LatexTokenTypes.DOLLAR; }

{string} { return LatexTokenTypes.STRING; }
{eol} { return LatexTokenTypes.EOL; }
. { return LatexTokenTypes.STRING; }

/* Error */
<<EOF>> { return null; }

