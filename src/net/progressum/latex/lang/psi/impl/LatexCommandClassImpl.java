// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import net.progressum.latex.lang.psi.LatexBraceOptions;
import net.progressum.latex.lang.psi.LatexBracketOptions;
import net.progressum.latex.lang.psi.LatexCommandClass;
import net.progressum.latex.lang.psi.LatexVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LatexCommandClassImpl extends ASTWrapperPsiElement implements LatexCommandClass {

  public LatexCommandClassImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitCommandClass(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LatexBraceOptions> getBraceOptionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LatexBraceOptions.class);
  }

  @Override
  @NotNull
  public List<LatexBracketOptions> getBracketOptionsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LatexBracketOptions.class);
  }

}
