// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import net.progressum.latex.lang.psi.LatexBraceOptions;
import net.progressum.latex.lang.psi.LatexBracketOptions;
import net.progressum.latex.lang.psi.LatexUsepackageClass;
import net.progressum.latex.lang.psi.LatexVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LatexUsepackageClassImpl extends ASTWrapperPsiElement implements LatexUsepackageClass {

  public LatexUsepackageClassImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitUsepackageClass(this);
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
