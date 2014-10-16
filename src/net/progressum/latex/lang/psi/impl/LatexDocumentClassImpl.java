// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import net.progressum.latex.lang.psi.LatexBraceOptions;
import net.progressum.latex.lang.psi.LatexBracketOptions;
import net.progressum.latex.lang.psi.LatexDocumentClass;
import net.progressum.latex.lang.psi.LatexVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LatexDocumentClassImpl extends ASTWrapperPsiElement implements LatexDocumentClass {

  public LatexDocumentClassImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitDocumentClass(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatexBraceOptions getBraceOptions() {
    return findNotNullChildByClass(LatexBraceOptions.class);
  }

  @Override
  @Nullable
  public LatexBracketOptions getBracketOptions() {
    return findChildByClass(LatexBracketOptions.class);
  }

}
