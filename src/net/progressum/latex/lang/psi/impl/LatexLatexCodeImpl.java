// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import net.progressum.latex.lang.psi.LatexCommandClass;
import net.progressum.latex.lang.psi.LatexLatexCode;
import net.progressum.latex.lang.psi.LatexUsepackageClass;
import net.progressum.latex.lang.psi.LatexVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LatexLatexCodeImpl extends ASTWrapperPsiElement implements LatexLatexCode {

  public LatexLatexCodeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitLatexCode(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LatexCommandClass getCommandClass() {
    return findChildByClass(LatexCommandClass.class);
  }

  @Override
  @Nullable
  public LatexUsepackageClass getUsepackageClass() {
    return findChildByClass(LatexUsepackageClass.class);
  }

}
