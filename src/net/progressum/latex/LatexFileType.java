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
package net.progressum.latex;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LatexFileType extends LanguageFileType {

    @NonNls
    public static final String DEFAULT_EXTENSION = "tex";

    public static final LatexFileType INSTANCE = new LatexFileType();

    public LatexFileType() {
        super(LatexLanguage.INSTANCE);
    }


    @NotNull
    public String getName() {
        return "Progressum Latex";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "LaTeX files";
    }


    @NotNull
    public String getDefaultExtension() {
        return DEFAULT_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return IconLoader.findIcon("dk/progressum/latex/resources/jar-gray.png");
    }

}
