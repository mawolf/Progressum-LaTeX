// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import net.progressum.latex.lang.psi.LatexParameter;
import net.progressum.latex.lang.psi.LatexParameters;
import net.progressum.latex.lang.psi.LatexVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LatexParametersImpl extends ASTWrapperPsiElement implements LatexParameters {

  public LatexParametersImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitParameters(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LatexParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LatexParameter.class);
  }

}
