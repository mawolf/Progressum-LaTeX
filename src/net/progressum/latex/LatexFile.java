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

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class LatexFile extends PsiFileBase {

    public LatexFile(FileViewProvider viewProvider) {
        super(viewProvider, LatexFileType.INSTANCE.getLanguage());
    }

    @NotNull
    public FileType getFileType() {
        return LatexFileType.INSTANCE;
    }

    public String toString() {
        return "Latex File: " + getName();
    }

}
