// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import net.progressum.latex.lang.psi.LatexBracketOptions;
import net.progressum.latex.lang.psi.LatexParameters;
import net.progressum.latex.lang.psi.LatexVisitor;
import org.jetbrains.annotations.NotNull;

public class LatexBracketOptionsImpl extends ASTWrapperPsiElement implements LatexBracketOptions {

  public LatexBracketOptionsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitBracketOptions(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatexParameters getParameters() {
    return findNotNullChildByClass(LatexParameters.class);
  }

}
