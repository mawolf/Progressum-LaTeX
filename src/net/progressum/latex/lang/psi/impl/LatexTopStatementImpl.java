// This is a generated file. Not intended for manual editing.
package net.progressum.latex.lang.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import net.progressum.latex.lang.psi.LatexDocumentClass;
import net.progressum.latex.lang.psi.LatexLatexCode;
import net.progressum.latex.lang.psi.LatexTopStatement;
import net.progressum.latex.lang.psi.LatexVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LatexTopStatementImpl extends ASTWrapperPsiElement implements LatexTopStatement {

  public LatexTopStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LatexVisitor) ((LatexVisitor)visitor).visitTopStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LatexDocumentClass getDocumentClass() {
    return findChildByClass(LatexDocumentClass.class);
  }

  @Override
  @NotNull
  public List<LatexLatexCode> getLatexCodeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LatexLatexCode.class);
  }

}
