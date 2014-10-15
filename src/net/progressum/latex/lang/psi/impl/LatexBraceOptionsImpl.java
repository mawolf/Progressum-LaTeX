// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.progressum.latex.lang.lexer.LatexTokenTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.progressum.latex.lang.psi.*;

public class LatexBraceOptionsImpl extends ASTWrapperPsiElement implements LatexBraceOptions {

  public LatexBraceOptionsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitBraceOptions(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public LatexParameters getParameters() {
    return findNotNullChildByClass(LatexParameters.class);
  }

}