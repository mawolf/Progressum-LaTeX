// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.parser;

import com.intellij.lang.ASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.lang.PsiParser;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.tree.IElementType;

import static net.progressum.latex.lang.lexer.LatexTokenTypes.*;
import static net.progressum.latex.lang.parser.LatexParserUtil.*;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LatexParser implements PsiParser {

    public static final Logger LOG_ = Logger.getInstance("net.progressum.latex.lang.parser.LatexParser");

    /* ********************************************************** */
    // LEFT_CURLY parameters RIGHT_CURLY
    public static boolean brace_options(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "brace_options")) return false;
        if (!nextTokenIs(builder_, LEFT_CURLY)) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = consumeToken(builder_, LEFT_CURLY);
        result_ = result_ && parameters(builder_, level_ + 1);
        result_ = result_ && consumeToken(builder_, RIGHT_CURLY);
        exit_section_(builder_, marker_, BRACE_OPTIONS, result_);
        return result_;
    }

    /* ********************************************************** */
    // LEFT_SQUARE parameters RIGHT_SQUARE
    public static boolean bracket_options(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "bracket_options")) return false;
        if (!nextTokenIs(builder_, LEFT_SQUARE)) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = consumeToken(builder_, LEFT_SQUARE);
        result_ = result_ && parameters(builder_, level_ + 1);
        result_ = result_ && consumeToken(builder_, RIGHT_SQUARE);
        exit_section_(builder_, marker_, BRACKET_OPTIONS, result_);
        return result_;
    }

    /* ********************************************************** */
    // COMMAND ASTERISK? ( bracket_options | brace_options )*
    public static boolean command_class(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "command_class")) return false;
        if (!nextTokenIs(builder_, COMMAND)) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = consumeToken(builder_, COMMAND);
        result_ = result_ && command_class_1(builder_, level_ + 1);
        result_ = result_ && command_class_2(builder_, level_ + 1);
        exit_section_(builder_, marker_, COMMAND_CLASS, result_);
        return result_;
    }

    // ASTERISK?
    private static boolean command_class_1(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "command_class_1")) return false;
        consumeToken(builder_, ASTERISK);
        return true;
    }

    // ( bracket_options | brace_options )*
    private static boolean command_class_2(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "command_class_2")) return false;
        int pos_ = current_position_(builder_);
        while (true) {
            if (!command_class_2_0(builder_, level_ + 1)) break;
            if (!empty_element_parsed_guard_(builder_, "command_class_2", pos_)) break;
            pos_ = current_position_(builder_);
        }
        return true;
    }

    // bracket_options | brace_options
    private static boolean command_class_2_0(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "command_class_2_0")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = bracket_options(builder_, level_ + 1);
        if (!result_) result_ = brace_options(builder_, level_ + 1);
        exit_section_(builder_, marker_, null, result_);
        return result_;
    }

    /* ********************************************************** */
    // DOCUMENTCLASS (bracket_options)? brace_options
    public static boolean document_class(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "document_class")) return false;
        if (!nextTokenIs(builder_, DOCUMENTCLASS)) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = consumeToken(builder_, DOCUMENTCLASS);
        result_ = result_ && document_class_1(builder_, level_ + 1);
        result_ = result_ && brace_options(builder_, level_ + 1);
        exit_section_(builder_, marker_, DOCUMENT_CLASS, result_);
        return result_;
    }

    // (bracket_options)?
    private static boolean document_class_1(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "document_class_1")) return false;
        document_class_1_0(builder_, level_ + 1);
        return true;
    }

    // (bracket_options)
    private static boolean document_class_1_0(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "document_class_1_0")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = bracket_options(builder_, level_ + 1);
        exit_section_(builder_, marker_, null, result_);
        return result_;
    }

    /* ********************************************************** */
    // usepackage_class | command_class | DOLLAR | COMMENT | STRING | EOL
    public static boolean latex_code(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "latex_code")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_, level_, _NONE_, "<latex code>");
        result_ = usepackage_class(builder_, level_ + 1);
        if (!result_) result_ = command_class(builder_, level_ + 1);
        if (!result_) result_ = consumeToken(builder_, DOLLAR);
        if (!result_) result_ = consumeToken(builder_, COMMENT);
        if (!result_) result_ = consumeToken(builder_, STRING);
        if (!result_) result_ = consumeToken(builder_, EOL);
        exit_section_(builder_, level_, marker_, LATEX_CODE, result_, false, null);
        return result_;
    }

    /* ********************************************************** */
    // top_statement
    static boolean latex_file(PsiBuilder builder_, int level_) {
        return top_statement(builder_, level_ + 1);
    }

    /* ********************************************************** */
    // latex_code*
    public static boolean parameter(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "parameter")) return false;
        Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameter>");
        int pos_ = current_position_(builder_);
        while (true) {
            if (!latex_code(builder_, level_ + 1)) break;
            if (!empty_element_parsed_guard_(builder_, "parameter", pos_)) break;
            pos_ = current_position_(builder_);
        }
        exit_section_(builder_, level_, marker_, PARAMETER, true, false, null);
        return true;
    }

    /* ********************************************************** */
    // parameter ( COMMA parameter )*
    public static boolean parameters(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "parameters")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_, level_, _NONE_, "<parameters>");
        result_ = parameter(builder_, level_ + 1);
        result_ = result_ && parameters_1(builder_, level_ + 1);
        exit_section_(builder_, level_, marker_, PARAMETERS, result_, false, null);
        return result_;
    }

    // ( COMMA parameter )*
    private static boolean parameters_1(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "parameters_1")) return false;
        int pos_ = current_position_(builder_);
        while (true) {
            if (!parameters_1_0(builder_, level_ + 1)) break;
            if (!empty_element_parsed_guard_(builder_, "parameters_1", pos_)) break;
            pos_ = current_position_(builder_);
        }
        return true;
    }

    // COMMA parameter
    private static boolean parameters_1_0(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "parameters_1_0")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = consumeToken(builder_, COMMA);
        result_ = result_ && parameter(builder_, level_ + 1);
        exit_section_(builder_, marker_, null, result_);
        return result_;
    }

    /* ********************************************************** */
    // (document_class EOL)? latex_code*
    public static boolean top_statement(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "top_statement")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_, level_, _NONE_, "<top statement>");
        result_ = top_statement_0(builder_, level_ + 1);
        result_ = result_ && top_statement_1(builder_, level_ + 1);
        exit_section_(builder_, level_, marker_, TOP_STATEMENT, result_, false, null);
        return result_;
    }

    // (document_class EOL)?
    private static boolean top_statement_0(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "top_statement_0")) return false;
        top_statement_0_0(builder_, level_ + 1);
        return true;
    }

    // document_class EOL
    private static boolean top_statement_0_0(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "top_statement_0_0")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = document_class(builder_, level_ + 1);
        result_ = result_ && consumeToken(builder_, EOL);
        exit_section_(builder_, marker_, null, result_);
        return result_;
    }

    // latex_code*
    private static boolean top_statement_1(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "top_statement_1")) return false;
        int pos_ = current_position_(builder_);
        while (true) {
            if (!latex_code(builder_, level_ + 1)) break;
            if (!empty_element_parsed_guard_(builder_, "top_statement_1", pos_)) break;
            pos_ = current_position_(builder_);
        }
        return true;
    }

    /* ********************************************************** */
    // USEPACKAGE (bracket_options)? brace_options
    public static boolean usepackage_class(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "usepackage_class")) return false;
        if (!nextTokenIs(builder_, USEPACKAGE)) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = consumeToken(builder_, USEPACKAGE);
        result_ = result_ && usepackage_class_1(builder_, level_ + 1);
        result_ = result_ && brace_options(builder_, level_ + 1);
        exit_section_(builder_, marker_, USEPACKAGE_CLASS, result_);
        return result_;
    }

    // (bracket_options)?
    private static boolean usepackage_class_1(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "usepackage_class_1")) return false;
        usepackage_class_1_0(builder_, level_ + 1);
        return true;
    }

    // (bracket_options)
    private static boolean usepackage_class_1_0(PsiBuilder builder_, int level_) {
        if (!recursion_guard_(builder_, level_, "usepackage_class_1_0")) return false;
        boolean result_;
        Marker marker_ = enter_section_(builder_);
        result_ = bracket_options(builder_, level_ + 1);
        exit_section_(builder_, marker_, null, result_);
        return result_;
    }

    public ASTNode parse(IElementType root_, PsiBuilder builder_) {
        boolean result_;
        builder_ = adapt_builder_(root_, builder_, this, null);
        Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
        if (root_ == BRACE_OPTIONS) {
            result_ = brace_options(builder_, 0);
        } else if (root_ == BRACKET_OPTIONS) {
            result_ = bracket_options(builder_, 0);
        } else if (root_ == COMMAND_CLASS) {
            result_ = command_class(builder_, 0);
        } else if (root_ == DOCUMENT_CLASS) {
            result_ = document_class(builder_, 0);
        } else if (root_ == LATEX_CODE) {
            result_ = latex_code(builder_, 0);
        } else if (root_ == PARAMETER) {
            result_ = parameter(builder_, 0);
        } else if (root_ == PARAMETERS) {
            result_ = parameters(builder_, 0);
        } else if (root_ == TOP_STATEMENT) {
            result_ = top_statement(builder_, 0);
        } else if (root_ == USEPACKAGE_CLASS) {
            result_ = usepackage_class(builder_, 0);
        } else {
            result_ = parse_root_(root_, builder_, 0);
        }
        exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
        return builder_.getTreeBuilt();
    }

    protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
        return latex_file(builder_, level_ + 1);
    }

}
