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
package net.progressum.latex.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import net.progressum.latex.lang.lexer.LatexLexer;
import net.progressum.latex.lang.lexer.LatexTokenTypes;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class LatexSyntaxHighlighter
        extends SyntaxHighlighterBase implements LatexTokenTypes {

    private final static Logger LOG = Logger.getInstance(LatexSyntaxHighlighter.class);

    /**
     * all text attributes keys defined here
     */
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("LEXER_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("LEXER_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);

    public static final TextAttributesKey KEY =
            createTextAttributesKey("LEXER_KEY", DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey COMMENT_ATT =
            createTextAttributesKey("LEXER_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("LEXER_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    /**
     * All token sets defined here
     */
    TokenSet KeywordSet = TokenSet.create(BEGIN, END, USEPACKAGE, COMMAND,
            DOCUMENTCLASS, KEYWORD);

    TokenSet BracketSet = TokenSet.create(LEFT_SQUARE, RIGHT_SQUARE,
            LEFT_CURLY, RIGHT_CURLY);

    TokenSet CommentSet = TokenSet.create(COMMENT);

    /**
     * Define all text attributes key arrays here
     */
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT_ATT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    public LatexSyntaxHighlighter() {
        KEY.getDefaultAttributes().setFontType(Font.BOLD);
        //COMMENT_ATT.getDefaultAttributes().setForegroundColor(Color.green);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new LatexLexer();

    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(SEPARATOR)) {
            return SEPARATOR_KEYS;
        } else if (KeywordSet.contains(tokenType)) {
            return KEY_KEYS;
        } else if (BracketSet.contains(tokenType)) {
            return BRACKET_KEYS;
        } else if (CommentSet.contains(tokenType)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
